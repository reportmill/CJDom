package cjdom;

/**
 * This class is a wrapper for Web API Event (https://developer.mozilla.org/en-US/docs/Web/API/Event).
 */
public class Event extends JSObject {

    /**
     * Constructor.
     */
    public Event(Object eventJS)
    {
        super(eventJS);
    }

    /**
     * Returns the type.
     */
    public String getType()  { return "mouse"; }

    /**
     * Returns the target.
     */
    public EventTarget getTarget()
    {
        return null;
    }

    /**
     * Returns the target.
     */
    public EventTarget getCurrentTarget()
    {
        return null;
    }

    //short getEventPhase();

    //boolean isBubbles();

    //boolean isCancelable();

    //JSObject getTimeStamp();

    public void stopPropagation()
    {

    }

    public void preventDefault()  { preventDefaultImpl(_jsObj); }

    /**
     * Event method: preventDefaultImpl()
     */
    private static native void preventDefaultImpl(Object eventJS);
}
