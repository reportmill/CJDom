package cjdom;

/**
 * This class is a wrapper for Web API HTMLDocument (https://developer.mozilla.org/en-US/docs/Web/API/HTMLDocument).
 */
public class HTMLDocument extends Document {

    /**
     * Constructor.
     */
    public HTMLDocument(Object htmlDocument)
    {
        super(htmlDocument);
    }

    /**
     * Return.
     */
    public HTMLHtmlElement getDocumentElement()
    {
        Object htmlElementJS = getMember("documentElement");
        return new HTMLHtmlElement(htmlElementJS);
    }

    public HTMLElement getElementById(String idStr)
    {
        Object elementJS = call("getElementById", idStr);
        String tagName = JSObject.getMemberStringImpl(elementJS, "nodeName");
        return HTMLElement.getElementForName(tagName, elementJS);
    }

    /**
     * Returns Window.current().getDocument().
     */
    public static HTMLDocument current()
    {
        return Window.current().getDocument();
    }
}
