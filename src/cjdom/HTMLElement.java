package cjdom;

/**
 * This class is a wrapper for Web API HTMLElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement).
 */
public class HTMLElement extends Element implements EventTarget {

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
    public int getOffsetTop()  { return getOffsetTopImpl(_jsObj); }

    /**
     * Returns the offset left.
     */
    public int getOffsetLeft()  { return getOffsetLeftImpl(_jsObj); }

    /**
     * Returns the inline style of an element.
     */
    public CSSStyleDeclaration getStyle()
    {
        Object styleJS = getStyleImpl(_jsObj);
        return new CSSStyleDeclaration(styleJS);
    }

    /**
     * Sets whether html element has content editable.
     */
    public void setContentEditable(boolean aValue)
    {
        setContentEditableImpl(_jsObj, aValue);
    }

    public int getClientWidth()
    {
//        return getClientWidthImpl();
        return 0;
    }

    public int getClientHeight()
    {
//        return getClientHeightImpl();
        return 0;
    }

    public void focus()
    {
//        focusImpl();
    }

    public void blur()
    {
//        blurImpl();
    }

    /**
     * Returns the wrapped HTML element for given tag name.
     */
    public static HTMLElement getElementForName(String tagName, Object jsObj)
    {
        switch (tagName) {
            case "canvas": return new HTMLCanvasElement(jsObj);
            case "img": return new HTMLImageElement(jsObj);
            case "body": return new HTMLBodyElement(jsObj);
            case "html": return new HTMLHtmlElement(jsObj);
            default: return new HTMLElement(jsObj);
        }
    }

    /**
     * HTMLElement method: getOffsetTopImpl().
     */
    private static native int getOffsetTopImpl(Object elementJS);

    /**
     * HTMLElement method: getOffsetLeftImpl().
     */
    private static native int getOffsetLeftImpl(Object elementJS);

    /**
     * HTMLElement method: Returns the htmlElement.style.
     */
    private static native Object getStyleImpl(Object elementJS);

    /**
     * Creates a URL from given blob.
     */
    private static native void setContentEditableImpl(Object htmlElementJS, boolean aValue);
}
