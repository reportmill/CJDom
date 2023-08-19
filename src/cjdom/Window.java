package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Window (https://developer.mozilla.org/en-US/docs/Web/API/Window).
 */
public class Window extends CJObject implements EventTarget {

    // The current Window
    private static Window _window;

    // The current document
    private static HTMLDocument _document;

    /**
     * Constructor.
     */
    private Window(JSObject winJS)
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
    private static native int getInnerWidthImpl(JSObject winJS);

    /**
     * Window method: Return window InnerHeight.
     */
    private static native int getInnerHeightImpl(JSObject winJS);

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
    private static native void openImpl(JSObject winJS, String url, String target, String windowFeatures);

    /**
     * Schedules a runnable to execute after a delay of given milliseconds.
     */
    public static void setTimeout(Runnable aRun, int aDelay)
    {
        EventQueue.setTimeout(aRun, aDelay);
    }

    /**
     * Schedules a runnable to execute every time a given number of milliseconds elapses.
     */
    public static int setInterval(Runnable aRun, int aPeriod)
    {
        //java.util.TimerTask timerTask = new TimerTask() { public void run()  { moveBalls(); } };
        //new java.util.Timer().schedule(timerTask, 0, 25);
        return EventQueue.setInterval(aRun, aPeriod);
    }

    /**
     * Stops intervals for given id.
     */
    public static native void clearInterval(int anId);

    /**
     * Returns the current window.
     */
    public static Window current()
    {
        if (_window != null) return _window;

        JSObject winJS = currentImpl();
        Window window = new Window(winJS);

        // Set and return
        return _window = window;
    }

    /**
     * Returns the current window.
     */
    public static native JSObject currentImpl();

    /**
     * Returns the current window.
     */
    public static HTMLDocument getDocument()
    {
        if (_document != null) return _document;

        JSObject htmlDocumentJS = getDocumentImpl();
        HTMLDocument doc = new HTMLDocument(htmlDocumentJS);

        // Set and return
        return _document = doc;
    }

    /**
     * Returns JavaScript Window.document.
     */
    private static native JSObject getDocumentImpl();
}
