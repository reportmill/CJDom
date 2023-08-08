package cjdom;

/**
 * Wrapper class for WebAPI Window.
 */
public class Window extends JSObject {

    /**
     * Constructor.
     */
    private Window(Object winJS)
    {
        super();
        _jsObj = winJS;
    }

    /**
     * Return window InnerWidth.
     */
    public int getInnerWidth()  { return getInnerWidthImpl(_jsObj); }

    /**
     * Return window InnerHeight.
     */
    public int getInnerHeight()  { return getInnerHeightImpl(_jsObj); }

    /**
     * Window method: Return window InnerWidth.
     */
    private static native int getInnerWidthImpl(Object winJS);

    /**
     * Window method: Return window InnerHeight.
     */
    private static native int getInnerHeightImpl(Object winJS);

    /**
     * Wrapper method for Web API method.
     */
    public void open(String url, String target)
    {
        open(url, target, null);
    }

    /**
     * Wrapper method for Web API method.
     */
    public void open(String url, String target, String windowFeatures)
    {
        openImpl(_jsObj, url, target, windowFeatures);
    }

    /**
     * Wrapper method for Web API method.
     */
    protected static native void openImpl(Object winJS, String url, String target, String windowFeatures);

    /**
     * Returns the current window.
     */
    public static Window current()
    {
        Object winJS = currentImpl();
        System.out.println("Window: got currentImpl");
        return new Window(winJS);
    }

    /**
     * Returns the current window.
     */
    public static native Object currentImpl();

    /**
     * Returns the current window.
     */
    public static HTMLDocument getDocument()
    {
        Object htmlDocumentJS = getDocumentImpl();
        return new HTMLDocument(htmlDocumentJS);
    }

    /**
     * Returns JavaScript Window.document.
     */
    private static native Object getDocumentImpl();
}
