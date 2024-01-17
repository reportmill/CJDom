package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Document (https://developer.mozilla.org/en-US/docs/Web/API/Document).
 */
public class Document extends Node implements EventTarget {

    // The Body element
    private HTMLBodyElement _body;

    /**
     * Constructor.
     */
    public Document(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Creates the HTML element specified by tagName.
     */
    public HTMLElement createElement(String tagName)
    {
        JSObject jsObj = createElementImpl(_jsObj, tagName);
        return HTMLElement.getElementForName(tagName, jsObj);
    }

    /**
     * Document method: Creates the HTML element specified by tagName.
     */
    private static native JSObject createElementImpl(JSObject docJS, String tagName);

    /**
     * Returns the HTMLBodyElement for this document.
     */
    public HTMLBodyElement getBody()
    {
        if (_body != null) return _body;

        // Get body
        JSObject bodyJS = getBodyImpl(_jsObj);
        HTMLBodyElement body = new HTMLBodyElement(bodyJS);

        // Set and return
        return _body = body;
    }

    public HTMLHeadElement getHead()
    {
        JSObject headJS = getMember("head");
        return new HTMLHeadElement(headJS);
    }


    /**
     * Document method: Return document.body.
     */
    private static native JSObject getBodyImpl(JSObject docJS);
}
