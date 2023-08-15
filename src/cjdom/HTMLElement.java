package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API HTMLElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement).
 */
public class HTMLElement extends Element implements EventTarget {

    /**
     * Constructor.
     */
    public HTMLElement(JSObject jsoObj)
    {
        super(jsoObj);
    }

    /**
     * Returns the offset top.
     */
    public int getOffsetTop()  { return getMemberInt("offsetTop"); }

    /**
     * Returns the offset left.
     */
    public int getOffsetLeft()  { return getMemberInt("offsetLeft"); }

    /**
     * Returns the inline style of an element.
     */
    public CSSStyleDeclaration getStyle()
    {
        JSObject styleJS = getMember("style");
        return new CSSStyleDeclaration(styleJS);
    }

    /**
     * Sets whether html element has content editable.
     */
    public void setContentEditable(boolean aValue)
    {
        setMemberString("contentEditable", aValue ? "true" : "false");
        setMemberInt("tabIndex", 0);
    }

    public int getClientWidth()  { return getMemberInt("clientWidth"); }

    public int getClientHeight()  { return getMemberInt("clientHeight"); }

    public void focus()  { call("focus"); }

    public void blur()  { call("blur"); }

    /**
     * Returns the wrapped HTML element for given tag name.
     */
    public static HTMLElement getElementForName(String tagName, JSObject jsObj)
    {
        switch (tagName) {
            case "canvas": return new HTMLCanvasElement(jsObj);
            case "img": return new HTMLImageElement(jsObj);
            case "body": return new HTMLBodyElement(jsObj);
            case "html": return new HTMLHtmlElement(jsObj);
            default: return new HTMLElement(jsObj);
        }
    }
}
