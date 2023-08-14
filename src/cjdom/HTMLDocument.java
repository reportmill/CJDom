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
        Object htmlElement = getMember("documentElement");
        return new HTMLHtmlElement(htmlElement);
    }

    public HTMLElement getElementById(String idStr)
    {
        Object elementByIdJS = call("getElementById", idStr);
        String tagName = JSObject.getMemberAsStringImpl(elementByIdJS, "nodeName");
        return HTMLElement.getElementForName(tagName, elementByIdJS);
    }

    /**
     * Returns Window.current().getDocument().
     */
    public static HTMLDocument current()
    {
        return Window.current().getDocument();
    }
}
