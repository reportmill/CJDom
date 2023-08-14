package cjdom;

/**
 * This class is a wrapper for Web API KeyboardEvent (https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent).
 */
public class KeyboardEvent extends UIEvent {

    // Constants for types
    public static final String MOUSEDOWN = "mousedown";
    public static final String MOUSEUP = "mouseup";

    // Constants for buttons
    public static final short LEFT_BUTTON = 0;
    public static final short MIDDLE_BUTTON = 1;
    public static final short RIGHT_BUTTON = 2;

    /**
     * Constructor.
     */
    public KeyboardEvent(netscape.javascript.JSObject eventJS)
    {
        super(eventJS);
    }

    public int getKeyCode()
    {
        return 0;
    }

    public String getKey()
    {
        return "";
    }

    public short getButton()
    {
        return 0;
    }

    public short getButtons()
    {
        return 0;
    }

    //EventTarget getRelatedTarget();

    //double getMovementX();

    //double getMovementY();
}
