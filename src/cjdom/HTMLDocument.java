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
     * Returns Window.current().getDocument().
     */
    public static HTMLDocument getDocument()  { return Window.getDocument(); }
}
