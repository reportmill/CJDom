package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API HTMLDocument (https://developer.mozilla.org/en-US/docs/Web/API/HTMLDocument).
 */
public class HTMLDocument extends Document {

    // The document HTML element
    private HTMLHtmlElement _html;

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
        if (_html != null) return _html;

        // Get
        JSObject htmlElementJS = getMember("documentElement");
        HTMLHtmlElement html = new HTMLHtmlElement(htmlElementJS);

        // Set and return
        return _html = html;
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
    public static HTMLDocument getDocument()  { return Window.getDocument(); }
}
