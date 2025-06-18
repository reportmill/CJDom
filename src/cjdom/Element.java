package cjdom;
import netscape.javascript.JSObject;

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
    public Element(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the id.
     */
    public String getId()  { return getMemberString("id"); }

    /**
     * Sets the id.
     */
    public void setId(String idStr)  { setMemberString("id", idStr); }

    /**
     * Returns the class name.
     */
    public String getClassName()  { return getMemberString("className"); }

    /**
     * Sets the class name.
     */
    public void setClassName(String idStr)  { setMemberString("className", idStr); }

    /**
     * Returns the class list.
     */
    public DOMTokenList getClassList()
    {
        JSObject jsObj = (JSObject) getMember("classList");
        return new DOMTokenList(jsObj);
    }

    /**
     * Returns element attribute for attribute name.
     */
    public String getAttribute(String aName)  { return getMemberString(aName); }

    /**
     * Sets element attribute for attribute name.
     */
    public void setAttribute(String aName, String aValue)  { setMemberString(aName, aValue);}

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
     * Set pointer capture.
     */
    public void setPointerCapture(int anId)
    {
        _jsObj.call("setPointerCapture", anId);
    }

    /**
     * Element method: Returns the InnerHTML string.
     */
    private static native String getInnerHTMLImpl(JSObject elementJS);

    /**
     * Element method: Sets the InnerHTML string.
     */
    private static native void setInnerHTMLImpl(JSObject elementJS, String htmlStr);
}
