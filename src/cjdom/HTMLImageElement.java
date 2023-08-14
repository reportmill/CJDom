package cjdom;

/**
 * This class is a wrapper for Web API HTMLImageElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
 */
public class HTMLImageElement extends HTMLElement implements CanvasImageSource {

    /**
     * Constructor.
     */
    public HTMLImageElement(netscape.javascript.JSObject jsObj)
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
     * Returns the HTMLImageElement crossOrigin property.
     */
    public String getCrossOrigin()  { return getMemberString("crossOrigin"); }

    /**
     * Sets the HTMLImageElement crossOrigin property.
     */
    public void setCrossOrigin(String aString)  { setMemberString("crossOrigin", aString); }

    /**
     * HTMLImageElement method: Return image source.
     */
    private static native String getSrcImpl(netscape.javascript.JSObject imgJS);

    /**
     * HTMLImageElement method: Set image source.
     */
    private static native void setSrcImpl(netscape.javascript.JSObject imgJS, String srcStr);

    /**
     * HTMLImageElement method: Return image width.
     */
    private static native int getWidthImpl(netscape.javascript.JSObject imgJS);

    /**
     * HTMLImageElement method: Set image height.
     */
    private static native void setWidthImpl(netscape.javascript.JSObject imgJS, int aValue);

    /**
     * HTMLImageElement method: Return image height.
     */
    private static native int getHeightImpl(netscape.javascript.JSObject imgJS);

    /**
     * HTMLImageElement method: Set image height.
     */
    private static native void setHeightImpl(netscape.javascript.JSObject imgJS, int aValue);
}
