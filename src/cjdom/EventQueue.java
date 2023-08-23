package cjdom;
import netscape.javascript.JSObject;
import java.util.function.Function;

/**
 * This class is meant to handle JavaScript callbacks like setTimeout(), setInterval(), addEventListener(), etc.
 *
 *    - An "_eventNotifyMutex" mutex is created in cjdom.js as a promise (wrapped in a dictionary)
 *    - EventQueue.eventLoop() calls getNextEvent() to get next event as array [ name, lambda func, [ arg ] ]
 *    - JS callback functions register with callback to fireEvent(name, func, arg)
 *    - fireEvent() triggers the promise
 *    - getNextEventImpl() returns the event arg array after resolved mutext promise
 */
public class EventQueue {

    // Shared event queue
    private static EventQueue _shared = new EventQueue();

    // Constants for event types
    public static final String INVOCATION_EVENT = "invocation";

    /**
     * Constructor.
     */
    public EventQueue()
    {
        // Start waiting for events
        new Thread(() -> eventLoop()).start();
    }

    /**
     * Waits for events and dispatches them.
     */
    private void eventLoop()
    {
        while(true) {

            // Wait for next event
            JSObject eventRecordArrayJS = getNextEvent();
            Array<?> eventRecordArray = new Array<>(eventRecordArrayJS);

            // Get event type and function
            String type = eventRecordArray.getString(0);
            Object func = eventRecordArray.getObject(1);

            switch (type) {

                // Handle invocation
                case "invocation":
                    Runnable run = (Runnable) func;
                    run.run();
                    break;

                // Handle KeyboardEvents
                case "keydown":
                case "keyup":
                    EventListener<Event> keyLsnr = (EventListener<Event>) func;
                    JSObject keyEventJS = eventRecordArray.get(2);
                    Event keyEvent = new KeyboardEvent(keyEventJS);
                    keyLsnr.handleEvent(keyEvent);
                    break;

                // Handle MouseEvents
                case "mousedown":
                case "mousemove":
                case "mouseup":
                case "pointerdown":
                case "click":
                case "contextmenu":
                case "dragenter":
                case "dragover":
                case "dragexit":
                case "drop":
                case "dragstart":
                case "dragend":
                    EventListener<Event> mouseLsnr = (EventListener<Event>) func;
                    JSObject mouseEventJS = eventRecordArray.get(2);
                    Event mouseEvent = new MouseEvent(mouseEventJS);
                    mouseLsnr.handleEvent(mouseEvent);
                    break;

                // Handle TouchEvents
                case "touchstart":
                case "touchmove":
                case "touchend":
                    EventListener<Event> touchLsnr = (EventListener<Event>) func;
                    JSObject touchEventJS = eventRecordArray.get(2);
                    Event touchEvent = new TouchEvent(touchEventJS);
                    touchLsnr.handleEvent(touchEvent);
                    break;

                // Handle wheel events
                case "wheel":
                    EventListener<Event> wheelLsnr = (EventListener<Event>) func;
                    JSObject wheelJS = eventRecordArray.get(2);
                    Event wheelEvent = new WheelEvent(wheelJS);
                    wheelLsnr.handleEvent(wheelEvent);
                    break;

                // Handle resize events
                case "load":
                case "loadend":
                case "resize":
                case "select":
                case "selectstart":
                case "selectend":
                    EventListener<Event> eventLsnr = (EventListener<Event>) func;
                    JSObject eventJS = eventRecordArray.get(2);
                    Event event = new Event(eventJS);
                    eventLsnr.handleEvent(event);
                    break;

                // Handle promise
                case "promise":
                    Function<JSObject,Object> promiseThenFunc = (Function<JSObject,Object>) func;
                    JSObject value = eventRecordArray.get(2);
                    promiseThenFunc.apply(value);
                    break;

                // Handle unknown
                default: System.out.println("EventQueue.eventLoop: Unknown event type: " + type);
            }
        }
    }

    /**
     * Waits for next event.
     */
    private static native JSObject getNextEvent();

    /**
     * Sets a timeout.
     */
    public static void setTimeout(Runnable aRun, int aDelay)
    {
        setTimeoutImpl(INVOCATION_EVENT, aRun, aDelay);
    }

    /**
     * Sets an interval.
     */
    public static int setInterval(Runnable aRun, int aDelay)
    {
        return setIntervalImpl(INVOCATION_EVENT, aRun, aDelay);
    }

    /**
     * Registers an event handler of a specific event type on the EventTarget
     */
    public static void addEventListener(EventTarget eventTarget, String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        CJObject jsobj = (CJObject) eventTarget;
        int lsnrId = System.identityHashCode(eventLsnr);
        addEventListenerImpl(jsobj._jsObj, aName, eventLsnr, lsnrId, useCapture);
    }

    /**
     * Removes an event handler of a specific event type from the EventTarget
     */
    public static void removeEventListener(EventTarget eventTarget, String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        CJObject jsobj = (CJObject) eventTarget;
        int lsnrId = System.identityHashCode(eventLsnr);
        removeEventListenerImpl(jsobj._jsObj, aName, eventLsnr, lsnrId, useCapture);
    }

    /**
     * Sets a promise.then() function.
     */
    public static <T,V> Promise<V> setPromiseThen(Promise<T> aPromise, Function<? super T, ? extends V> aFunc)
    {
        JSObject promiseJS = aPromise._jsObj;
        JSObject thenPromiseJS = setPromiseThenImpl(promiseJS, aFunc);
        return new Promise<>(thenPromiseJS);
    }

    /**
     * EventQueue: setTimeoutImpl().
     */
    private static native void setTimeoutImpl(String aName, Runnable aRun, double ms);

    /**
     * EventQueue: setIntervalImpl().
     */
    private static native int setIntervalImpl(String aName, Runnable aRun, double aDelay);

    /**
     * EventQueue: addEventListenerImpl().
     */
    private static native void addEventListenerImpl(JSObject eventTargetJS, String aName, EventListener<?> eventLsnr, int lsnrId, boolean useCapture);

    /**
     * EventQueue: removeEventListenerImpl().
     */
    private static native void removeEventListenerImpl(JSObject eventTargetJS, String aName, EventListener<?> eventLsnr, int lsnrId, boolean useCapture);

    /**
     * EventQueue: setPromiseThenImpl().
     */
    private static native JSObject setPromiseThenImpl(JSObject promiseJS, Function<?,?> aFunc);
}
