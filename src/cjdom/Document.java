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

        switch (tagName) {
            case "canvas": return new HTMLCanvasElement(jsObj);
            case "img": return new HTMLImageElement(jsObj);
            default: return new HTMLElement(jsObj);
        }
    }

    /**
     * Creates the HTML element specified by tagName.
     */
    private static native Object createElementImpl(Object documentJS, String tagName);
}
