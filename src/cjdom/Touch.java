package cjdom;

/**
 * This class is a wrapper for Web API Touch (https://developer.mozilla.org/en-US/docs/Web/API/Touch).
 */
public class Touch extends Event {

    /**
     * Constructor.
     */
    public Touch(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Touch method: getClientX().
     */
    public int getClientX()  { return MouseEvent.getClientXImpl(_jsObj); }

    /**
     * Touch method: getClientY().
     */
    public int getClientY()  { return MouseEvent.getClientYImpl(_jsObj); }

    /**
     * Touch method: getPageX().
     */
    public int getPageX()  { return MouseEvent.getPageXImpl(_jsObj); }

    /**
     * Touch method: getPageY().
     */
    public int getPageY()  { return MouseEvent.getPageYImpl(_jsObj); }

    /**
     * Touch method: getScreenX().
     */
    public int getScreenX()  { return MouseEvent.getScreenXImpl(_jsObj); }

    /**
     * Touch method: getScreenY().
     */
    public int getScreenY()  { return MouseEvent.getScreenYImpl(_jsObj); }

    //int getOffsetX();

    //int getOffsetY();

    //int getPageX();

    //int getPageY();

    //boolean getCtrlKey();

    //boolean getShiftKey();

    //boolean getAltKey();

    //boolean getMetaKey();
}