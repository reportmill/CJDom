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
        if (_style != null) return _style;

        JSObject styleJS = getMember("style");
        CSSStyleDeclaration style = new CSSStyleDeclaration(styleJS);

        // Set and return
        return _style = style;
    }

    /**
     * Returns a string representing the rendered text content of an element.
     */
    public String getInnerText()
    {
        return getMemberString("innerText");
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

    public void focus()  { _jsObj.call("focus"); }

    public void blur()  { _jsObj.call("blur"); }

    /**
     * Returns the wrapped HTML element for given tag name.
     */
    public static HTMLElement getElementForName(String tagName, JSObject jsObj)
    {
        switch (tagName.toLowerCase()) {
            case "audio": return new HTMLAudioElement(jsObj);
            case "canvas": return new HTMLCanvasElement(jsObj);
            case "div": return new HTMLDivElement(jsObj);
            case "img": return new HTMLImageElement(jsObj);
            case "body": return new HTMLBodyElement(jsObj);
            case "html": return new HTMLHtmlElement(jsObj);
            case "iframe": return new HTMLIFrameElement(jsObj);
            case "script": return new HTMLScriptElement(jsObj);
            default: return new HTMLElement(jsObj);
        }
    }
}
