package cjdom;

/**
 * This class is a wrapper for Web API MouseEvent (https://developer.mozilla.org/en-US/docs/Web/API/MouseEvent).
 */
public class MouseEvent extends UIEvent {

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

    /**
     * MouseEvent method: getClientX().
     */
    public int getClientX()  { return getClientXImpl(_jsObj); }

    /**
     * MouseEvent method: getClientY().
     */
    public int getClientY()  { return getClientYImpl(_jsObj); }

    /**
     * MouseEvent method: getPageX().
     */
    public int getPageX()  { return getPageXImpl(_jsObj); }

    /**
     * MouseEvent method: getPageY().
     */
    public int getPageY()  { return getPageYImpl(_jsObj); }

    /**
     * MouseEvent method: getScreenX().
     */
    public int getScreenX()  { return getScreenXImpl(_jsObj); }

    /**
     * MouseEvent method: getScreenY().
     */
    public int getScreenY()  { return getScreenYImpl(_jsObj); }

    /**
     * MouseEvent method: getClientX().
     */
    protected static native int getClientXImpl(Object eventJS);

    /**
     * MouseEvent method: getClientY().
     */
    protected static native int getClientYImpl(Object eventJS);

    /**
     * MouseEvent method: getPageX().
     */
    protected static native int getPageXImpl(Object eventJS);

    /**
     * MouseEvent method: getPageY().
     */
    protected static native int getPageYImpl(Object eventJS);

    /**
     * MouseEvent method: getScreenX().
     */
    protected static native int getScreenXImpl(Object eventJS);

    /**
     * MouseEvent method: getScreenY().
     */
    protected static native int getScreenYImpl(Object eventJS);

    //int getOffsetX();

    //int getOffsetY();

    //EventTarget getRelatedTarget();

    //double getMovementX();

    //double getMovementY();
}
