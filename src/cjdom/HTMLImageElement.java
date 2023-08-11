package cjdom;

/**
 * This class is a wrapper for Web API HTMLImageElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
 */
public class HTMLImageElement extends HTMLElement {

    /**
     * Constructor.
     */
    public HTMLImageElement(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the image source.
     */
    public String getSrc()  { return getSrcImpl(_jsObj).toString(); }

    /**
     * Sets the image source.
     */
    public void setSrc(String aSrc)  { setSrcImpl(_jsObj, aSrc); }

    /**
     * Return image width.
     */
    public int getWidth()  { return getWidthImpl(_jsObj); }

    /**
     * Set image height.
     */
    public void setWidth(int aValue)  { setWidthImpl(_jsObj, aValue); }

    /**
     * Return image height.
     */
    public int getHeight()  { return getHeightImpl(_jsObj); }

    /**
     * Set image height.
     */
    public void setHeight(int aValue)  { setHeightImpl(_jsObj, aValue);}

    /**
     * HTMLImageElement method: Return image source.
     */
    private static native String getSrcImpl(Object imgJS);

    /**
     * HTMLImageElement method: Set image source.
     */
    private static native void setSrcImpl(Object imgJS, String srcStr);

    /**
     * HTMLImageElement method: Return image width.
     */
    private static native int getWidthImpl(Object imgJS);

    /**
     * HTMLImageElement method: Set image height.
     */
    private static native void setWidthImpl(Object imgJS, int aValue);

    /**
     * HTMLImageElement method: Return image height.
     */
    private static native int getHeightImpl(Object imgJS);

    /**
     * HTMLImageElement method: Set image height.
     */
    private static native void setHeightImpl(Object imgJS, int aValue);
}
