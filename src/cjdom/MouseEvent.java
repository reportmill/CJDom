package cjdom;

/**
 * This class is a wrapper for Web API MouseEvent (https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent).
 */
public class MouseEvent extends Event {

    // Constants for types
    public static final String CLICK = "click";
    public static final String MOUSEDOWN = "mousedown";
    public static final String MOUSEUP = "mouseup";
    public static final String MOUSEOVER = "mouseover";
    public static final String MOUSEMOVE = "mousemove";
    public static final String MOUSEOUT = "mouseout";

    // Constants for buttons
    public static final short LEFT_BUTTON = 0;
    public static final short MIDDLE_BUTTON = 1;
    public static final short RIGHT_BUTTON = 2;

    /**
     * Constructor.
     */
    public MouseEvent(Object eventJS)
    {
        super(eventJS);
    }


    //int getScreenX();

    //int getScreenY();

    /**
     * MouseEvent method: getClientX().
     */
    public int getClientX()  { return getClientXImpl(_jsObj); }

    /**
     * MouseEvent method: getClientY().
     */
    public int getClientY()  { return getClientYImpl(_jsObj); }

    /**
     * MouseEvent method: getClientX().
     */
    private static native int getClientXImpl(Object eventJS);

    /**
     * MouseEvent method: getClientY().
     */
    private static native int getClientYImpl(Object eventJS);

    //int getOffsetX();

    //int getOffsetY();

    //int getPageX();

    //int getPageY();

    //boolean getCtrlKey();

    //boolean getShiftKey();

    //boolean getAltKey();

    //boolean getMetaKey();

    //short getButton();

    //short getButtons();

    //EventTarget getRelatedTarget();

    //double getMovementX();

    //double getMovementY();
}
