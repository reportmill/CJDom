package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API HTMLDocument (https://developer.mozilla.org/en-US/docs/Web/API/HTMLDocument).
 */
public class HTMLDocument extends Document {

    /**
     * Constructor.
     */
    public HTMLDocument(JSObject htmlDocument)
    {
        super(htmlDocument);
    }

    /**
     * Return.
     */
    public HTMLHtmlElement getDocumentElement()
    {
        JSObject htmlElementJS = getMember("documentElement");
        return new HTMLHtmlElement(htmlElementJS);
    }

    public HTMLElement getElementById(String idStr)
    {
        JSObject elementJS = callForObjectWithString("getElementById", idStr);
        String tagName = CJObject.getMemberStringImpl(elementJS, "nodeName");
        return HTMLElement.getElementForName(tagName, elementJS);
    }

    /**
     * Returns Window.current().getDocument().
     */
    public static HTMLDocument current()  { return Window.getDocument(); }
}
