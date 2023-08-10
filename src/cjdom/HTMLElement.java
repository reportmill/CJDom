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
}
