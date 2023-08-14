package cjdom;

/**
 * This class is a wrapper for Web API Event (https://developer.mozilla.org/en-US/docs/Web/API/Event).
 */
public class Event extends CJObject {

    /**
     * Constructor.
     */
    public Event(netscape.javascript.JSObject eventJS)
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

    /**
     * Event method: stopPropagation().
     */
    public void stopPropagation()  { call("stopPropagation"); }

    /**
     * Event method: preventDefault().
     */
    public void preventDefault()  { call("preventDefault"); }

    //short getEventPhase();

    //boolean isBubbles();

    //boolean isCancelable();

    //JSObject getTimeStamp();
}
