package cjdom;

/**
 * An event queue.
 */
public class EventQueue {

    // Shared event queue
    private static EventQueue _shared = new EventQueue();

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
        setTimeoutImpl(aRun, aDelay);
    }

    /**
     * Sets a timeout.
     */
    private static native Object setTimeoutImpl(Runnable aRun, double ms);

    /**
     * Sets an interval.
     */
    public static int setInterval(Runnable aRun, int aDelay)
    {
        return setIntervalImpl("invocation", aRun, aDelay);
    }

    /**
     * Sets a interval.
     */
    private static native int setIntervalImpl(String aName, Runnable aRun, double aDelay);

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
