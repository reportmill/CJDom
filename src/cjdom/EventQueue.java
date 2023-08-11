package cjdom;

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
            Object eventRecordArrayJS = getNextEvent();
            Array eventRecordArray = new Array(eventRecordArrayJS);

            // Get event type and function
            String type = (String) eventRecordArray.get(0);
            Object func = eventRecordArray.get(1);

            switch (type) {

                // Handle invocation
                case "invocation":
                    Runnable run = (Runnable) func;
                    run.run();
                    break;

                // Handle MouseEvents
                case "mousedown":
                case "mousemove":
                case "mouseup":
                    EventListener<Event> eventLsnr = (EventListener<Event>) func;
                    Object eventJS = eventRecordArray.get(2);
                    Event event = new MouseEvent(eventJS);
                    eventLsnr.handleEvent(event);
                    break;

                // Handle TouchEvents
                case "touchstart":
                case "touchmove":
                case "touchend":
                    EventListener<Event> touchLsnr = (EventListener<Event>) func;
                    Object touchEventJS = eventRecordArray.get(2);
                    Event touchEvent = new TouchEvent(touchEventJS);
                    touchLsnr.handleEvent(touchEvent);
                    break;
            }
        }
    }

    /**
     * Waits for next event.
     */
    private static native Array getNextEvent();

    /**
     * Sets a timeout.
     */
    public static void setTimeout(Runnable aRun, int aDelay)
    {
        setTimeoutImpl(INVOCATION_EVENT, aRun, aDelay);
    }

    /**
     * Sets a timeout.
     */
    private static native Object setTimeoutImpl(String aName, Runnable aRun, double ms);

    /**
     * Sets an interval.
     */
    public static int setInterval(Runnable aRun, int aDelay)
    {
        return setIntervalImpl(INVOCATION_EVENT, aRun, aDelay);
    }

    /**
     * Sets a interval.
     */
    private static native int setIntervalImpl(String aName, Runnable aRun, double aDelay);

    /**
     * Registers an event handler of a specific event type on the EventTarget
     */
    public static void addEventListener(EventTarget eventTarget, String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        JSObject jsobj = (JSObject) eventTarget;
        addEventListenerImpl(jsobj._jsObj, aName, eventLsnr, useCapture);
    }

    /**
     * Removes an event handler of a specific event type from the EventTarget
     */
    public static void removeEventListener(EventTarget eventTarget, String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        JSObject jsobj = (JSObject) eventTarget;
        removeEventListenerImpl(jsobj._jsObj, aName, eventLsnr, useCapture);
    }

    /**
     * Registers an event handler of a specific event type on the EventTarget
     */
    private static native void addEventListenerImpl(Object eventTargetJS, String aName, EventListener<?> eventLsnr, boolean useCapture);

    /**
     * Removes an event handler of a specific event type from the EventTarget
     */
    private static native void removeEventListenerImpl(Object eventTargetJS, String aName, EventListener<?> eventLsnr, boolean useCapture);

    /*
    // This wrapped promise is used to trigger getNextEvent
    var _eventNotifyMutex = createMutex();

    // This array is used to return event name, lambda function and optional arg
    var _eventPropsArray;

    function createMutex()
    {
        let fulfill = null;
        let reject = null;
        let promise = new Promise((f, r) => { fulfill = f; reject = r; });
        return { fulfill, reject, promise };
    }

    function fireEvent(name, callback, arg)
    {
        _eventPropsArray = [ name, callback, arg ];
        _eventNotifyMutex.fulfill();
        _eventNotifyMutex = createMutex();
    }

    async function Java_cjdom_EventQueue_getNextEvent(lib)
    {
        var mutexPromise = _eventNotifyMutex.promise.then(() => null);
        await mutexPromise;
        return _eventPropsArray;
    }

    function Java_cjdom_EventQueue_setTimeoutImpl(lib, aRun, aDelay)
    {
        setTimeout(() => fireEvent("invocation", aRun), aDelay);
    }

    function Java_cjdom_EventQueue_setIntervalImpl(lib, aName, aRun, aDelay)
    {
        return setInterval(() => fireEvent(aName, aRun), aDelay);
    }
     */
}
