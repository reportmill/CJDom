package cjdom;

/**
 * This class is a wrapper for Web API Element (https://developer.mozilla.org/en-US/docs/Web/API/Element).
 */
public class Element extends Node {

    /**
     * Constructor.
     */
    public Element()
    {
        super();
    }

    /**
     * Constructor.
     */
    public Element(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the InnerHTML string.
     */
    public String getInnerHTML()
    {
        return getInnerHTMLImpl(_jsObj).toString();
    }

    /**
     * Sets the InnerHTML string.
     */
    public void setInnerHTML(String htmlStr)
    {
        setInnerHTMLImpl(_jsObj, htmlStr);
    }

    /**
     * Element method: Returns the InnerHTML string.
     */
    private static native Object getInnerHTMLImpl(Object elementJS);

    /**
     * Element method: Sets the InnerHTML string.
     */
    private static native void setInnerHTMLImpl(Object elementJS, String htmlStr);
}
