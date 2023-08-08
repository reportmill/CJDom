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
     * HTMLImageElement method: Return image width.
     */
    private static native int getWidthImpl(Object jsObj);

    /**
     * HTMLImageElement method: Set image height.
     */
    private static native void setWidthImpl(Object jsObj, int aValue);

    /**
     * HTMLImageElement method: Return image height.
     */
    private static native int getHeightImpl(Object jsObj);

    /**
     * HTMLImageElement method: Set image height.
     */
    private static native void setHeightImpl(Object jsObj, int aValue);
}
