package cjdom;

/**
 * This class is a wrapper for Web API UIEvent (https://developer.mozilla.org/en-US/docs/Web/API/UIEvent).
 */
public class UIEvent extends Event {

    /**
     * Constructor.
     */
    public UIEvent(Object eventJS)
    {
        super(eventJS);
    }

    public boolean isShiftKey()
    {
        return false;
    }

    public boolean isAltKey()
    {
        return false;
    }

    public boolean isCtrlKey()
    {
        return false;
    }

    public boolean isMetaKey()
    {
        return false;
    }

    public short getButton()
    {
        return 0;
    }

    public short getButtons()
    {
        return 0;
    }
}
