package cjdom;

/**
 * This class is a wrapper for Web API HTMLImageElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
 */
public class HTMLCanvasElement extends HTMLElement implements CanvasImageSource {

    /**
     * Constructor.
     */
    public HTMLCanvasElement(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Return canvas width.
     */
    public int getWidth()  { return getWidthImpl(_jsObj); }

    /**
     * Set canvas height.
     */
    public void setWidth(int aValue)  { setWidthImpl(_jsObj, aValue); }

    /**
     * Return canvas height.
     */
    public int getHeight()  { return getHeightImpl(_jsObj); }

    /**
     * Set canvas height.
     */
    public void setHeight(int aValue)  { setHeightImpl(_jsObj, aValue);}

    public Object getContext(String var1)
    {
//        Object contextJS = getContextImpl(typeName);
//        return new CanvasRenderingContext2D(contextJS);
        return null;
    }

    public String toDataURL(String var1)
    {
//        return null;
        return null;
    }

    /**
     * HTMLCanvasElement method: Return canvas width.
     */
    private static native int getWidthImpl(Object jsObj);

    /**
     * HTMLCanvasElement method: Set canvas height.
     */
    private static native void setWidthImpl(Object jsObj, int aValue);

    /**
     * HTMLCanvasElement method: Return canvas height.
     */
    private static native int getHeightImpl(Object jsObj);

    /**
     * HTMLCanvasElement method: Set canvas height.
     */
    private static native void setHeightImpl(Object jsObj, int aValue);
}
