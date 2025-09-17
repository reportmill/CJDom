package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API HTMLElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement).
 */
public class HTMLElement extends Element implements EventTarget {

    // The style element
    private CSSStyleDeclaration _style;

    /**
     * Constructor.
     */
    public HTMLElement(Object jsoObj)
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
        if (_style != null) return _style;
        Object styleJS = getMember("style");
        return _style = new CSSStyleDeclaration(styleJS);
    }

    /**
     * Returns a string representing the rendered text content of an element.
     */
    public String getInnerText()  { return getMemberString("innerText"); }

    /**
     * Sets a string representing the rendered text content of an element.
     */
    public void setInnerText(String aString)  { setMemberString("innerText", aString); }

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

    public void click()
    {
        if (Navigator.isSafari())
            setNeedsClickElement(_jsObj);
        else call("click");
    }

    /**
     * Returns the wrapped HTML element for given tag name.
     */
    public static HTMLElement getElementForName(String tagName, Object jsObj)
    {
        switch (tagName.toLowerCase()) {
            case "a": return new HTMLAnchorElement(jsObj);
            case "audio": return new HTMLAudioElement(jsObj);
            case "canvas": return new HTMLCanvasElement(jsObj);
            case "div": return new HTMLDivElement(jsObj);
            case "img": return new HTMLImageElement(jsObj);
            case "input": return new HTMLInputElement(jsObj);
            case "body": return new HTMLBodyElement(jsObj);
            case "html": return new HTMLHtmlElement(jsObj);
            case "iframe": return new HTMLIFrameElement(jsObj);
            case "script": return new HTMLScriptElement(jsObj);
            default: return new HTMLElement(jsObj);
        }
    }

    /**
     * HTMLElement setNeedsClickElement(): Called to set an element that needs a click.
     */
    private static native void setNeedsClickElement(JSObject needsClickElement);
}
