package cjdom;

/**
 * This class is a wrapper for Web API UIEvent (https://developer.mozilla.org/en-US/docs/Web/API/UIEvent).
 */
public class UIEvent extends Event {

    /**
     * Constructor.
     */
    public UIEvent(netscape.javascript.JSObject eventJS)
    {
        super(eventJS);
    }

    public boolean isShiftKey()  { return getMemberInt("shiftKey") > 0; }

    public boolean isAltKey()  { return getMemberInt("altKey") > 0; }

    public boolean isCtrlKey()  { return getMemberInt("ctrlKey") > 0; }

    public boolean isMetaKey()  { return getMemberInt("metaKey") > 0; }
}
