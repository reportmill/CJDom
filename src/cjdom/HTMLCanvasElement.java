package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API HTMLImageElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement).
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

    /**
     * HTMLCanvasElement: getContext().
     */
    public Object getContext(String contextType)
    {
        JSObject contextJS = (JSObject) _jsObj.call("getContext", contextType);
        if (contextType.equals("webgl"))
            return new WebGLRenderingContext(contextJS);
        return new CanvasRenderingContext2D(contextJS);
    }

    /**
     * Returns a DOMRect object providing information about the size of an element and its position relative to the viewport
     */
    public DOMRect getBoundingClientRect()
    {
        JSObject contextJS = (JSObject) _jsObj.call("getBoundingClientRect");
        return new DOMRect(contextJS);
    }

    /**
     * HTMLCanvasElement: toDataURL()
     */
    public String toDataURL(String mimeType)
    {
        return (String) _jsObj.call("toDataURL", mimeType);
    }
}
