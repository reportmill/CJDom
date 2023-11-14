package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Event (https://developer.mozilla.org/en-US/docs/Web/API/Event).
 */
public class Event extends CJObject {

    /**
     * Constructor.
     */
    public Event(JSObject eventJS)
    {
        super(eventJS);
    }

    /**
     * Returns the type.
     */
    public String getType()  { return getMemberString("type"); }

    /**
     * Returns the target.
     */
    public EventTarget getTarget()  { return null; }

    /**
     * Returns the target.
     */
    public EventTarget getCurrentTarget()  { return null; }

    /**
     * Event method: stopPropagation().
     */
    public void stopPropagation()  { _jsObj.call("stopPropagation"); }

    /**
     * Event method: preventDefault().
     */
    public void preventDefault()  { _jsObj.call("preventDefault"); }

    //short getEventPhase();

    //boolean isBubbles();

    //boolean isCancelable();

    //JSObject getTimeStamp();
}
