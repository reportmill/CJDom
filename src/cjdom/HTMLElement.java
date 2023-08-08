package cjdom;

/**
 * This class is a wrapper for Web API Node (https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement).
 */
public class HTMLElement extends Element {

    /**
     * Constructor.
     */
    public HTMLElement(Object jsoObj)
    {
        super(jsoObj);
    }

    /**
     * Returns the inline style of an element.
     */
    public CSSStyleDeclaration getStyle()
    {
        Object styleJS = getStyleImpl(_jsObj);
        return new CSSStyleDeclaration(styleJS);
    }

    /**
     * HTMLElement method: Returns the htmlElement.style.
     */
    private static native Object getStyleImpl(Object elementJS);
}
