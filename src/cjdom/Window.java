package cjdom;
import netscape.javascript.JSObject;
import java.util.function.DoubleConsumer;

/**
 * This class is a wrapper for Web API Window (https://developer.mozilla.org/en-US/docs/Web/API/Window).
 */
public class Window extends CJObject implements EventTarget {

    // The current Window
    private static Window _window;

    // The current document
    private static HTMLDocument _document;

    // The current Location
    private static Location _location;

    /**
     * Constructor.
     */
    public Window(JSObject winJS)
    {
        super();
        _jsObj = winJS;
    }

    /**
     * Returns the ratio of the resolution in physical pixels to the resolution in CSS pixels for the current display device.
     */
    public static double getDevicePixelRatio()  { return current().getMemberDouble("devicePixelRatio"); }

    /**
     * Return window InnerWidth.
     */
    public int getInnerWidth()  { return getMemberInt("innerWidth"); }

    /**
     * Return window InnerHeight.
     */
    public int getInnerHeight()  { return getMemberInt("innerHeight"); }

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
     * Request animation frame.
     */
    public static int requestAnimationFrame(DoubleConsumer callback)
    {
        return EventQueue.requestAnimationFrame(callback);
    }

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
     * Override to set URL hash.
     */
    public void setWindowLocationHash(String aString)
    {
        JSObject locationJS = getMember("location");
        String str = aString != null ? aString : "";
        setMemberStringImpl(locationJS, "hash", str);
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
        return _window = CJWebEnv.get().window();
    }

    /**
     * Returns the current location.
     */
    public static Location location()
    {
        if (_location != null) return _location;
        Window window = current();
        JSObject locationJS = window.getMember("location");
        return _location = new Location(locationJS);
    }

    /**
     * Returns the current window.
     */
    public static HTMLDocument getDocument()
    {
        if (_document != null) return _document;
        Window window = current();
        JSObject documentJS = window.getMember("document");
        return _document = new HTMLDocument(documentJS);
    }
}
