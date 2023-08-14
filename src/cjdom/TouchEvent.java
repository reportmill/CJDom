package cjdom;

/**
 * This class is a wrapper for Web API TouchEvent (https://developer.mozilla.org/en-US/docs/Web/API/TouchEvent).
 */
public class TouchEvent extends UIEvent {

    /**
     * Constructor.
     */
    public TouchEvent(netscape.javascript.JSObject jsObj)
    {
        super(jsObj);
    }

    public int getClientX()
    {
        Touch touch = getTouch();
        return touch != null ? touch.getClientX() : 0;
    }

    public int getClientY()
    {
        Touch touch = getTouch();
        return touch != null ? touch.getClientY() : 0;
    }

    public int getScreenX()
    {
        Touch touch = getTouch();
        return touch != null ? touch.getScreenX() : 0;
    }

    public int getScreenY()
    {
        Touch touch = getTouch();
        return touch != null ? touch.getScreenY() : 0;
    }

    public int getPageX()
    {
        Touch touch = getTouch();
        return touch != null ? touch.getPageX() : 0;
    }

    public int getPageY()
    {
        Touch touch = getTouch();
        return touch != null ? touch.getPageY() : 0;
    }

    /**
     * Returns the first touch.
     */
    public Touch getTouch()
    {
        // Get Touches
        Touch[] touches = getTouches();

        // If at end, see if there no are changed touches
        String type = getType();
        boolean isTouchEnd = type.equals("touchend");
        if (isTouchEnd) {
            Touch[] changedTouches = getChangedTouches();
            if (changedTouches != null && changedTouches.length > 0)
                touches = changedTouches;
        }

        // Get First touch
        Touch touch = touches != null && touches.length > 0 ? touches[0] : null;
        if (touch == null)
            System.err.println("TouchEvent.getTouch: No touches?");

        // Return touch
        return touch;
    }

    public Touch[] getTouches()  { return null; }

    public Touch[] getChangedTouches()  { return null; }

    //boolean getCtrlKey();
    //boolean getShiftKey();
    //boolean getAltKey();
    //boolean getMetaKey();
}