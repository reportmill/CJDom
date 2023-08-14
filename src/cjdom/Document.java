package cjdom;

/**
 * This class is a wrapper for Web API Document (https://developer.mozilla.org/en-US/docs/Web/API/Document).
 */
public class Document extends Node {

    /**
     * Constructor.
     */
    public Document(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Creates the HTML element specified by tagName.
     */
    public HTMLElement createElement(String tagName)
    {
        Object jsObj = createElementImpl(_jsObj, tagName);
        return HTMLElement.getElementForName(tagName, jsObj);
    }

    /**
     * Document method: Creates the HTML element specified by tagName.
     */
    private static native Object createElementImpl(Object docJS, String tagName);

    /**
     * Returns the HTMLBodyElement for this document.
     */
    public HTMLBodyElement getBody()
    {
        Object bodyJS = getBodyImpl(_jsObj);
        return new HTMLBodyElement(bodyJS);
    }

    /**
     * Document method: Return document.body.
     */
    private static native Object getBodyImpl(Object docJS);
}
