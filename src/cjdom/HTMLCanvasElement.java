package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API HTMLImageElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement).
 */
public class HTMLCanvasElement extends HTMLElement implements CanvasImageSource {

    /**
     * Constructor.
     */
    public HTMLCanvasElement(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Return canvas width.
     */
    public int getWidth()  { return getMemberInt("width"); }

    /**
     * Set canvas height.
     */
    public void setWidth(int aValue)  { setMemberInt("width", aValue); }

    /**
     * Return canvas height.
     */
    public int getHeight()  { return getMemberInt("height"); }

    /**
     * Set canvas height.
     */
    public void setHeight(int aValue)  { setMemberInt("height", aValue);}

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
}
