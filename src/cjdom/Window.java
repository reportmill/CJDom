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
    public void open(String url, String target)  { open(url, target, null); }

    /**
     * Wrapper method for Web API method.
     */
    public void open(String url, String target, String windowFeatures)
    {
        CJWebEnv.get().open(url, target, windowFeatures);
    }

    /**
     * Request animation frame.
     */
    public static int requestAnimationFrame(DoubleConsumer callback)
    {
        return CJWebEnv.get().requestAnimationFrame(callback);
    }

    /**
     * Schedules a runnable to execute after a delay of given milliseconds.
     */
    public static void setTimeout(Runnable aRun, int aDelay)  { CJWebEnv.get().setTimeout(aRun, aDelay); }

    /**
     * Schedules a runnable to execute every time a given number of milliseconds elapses.
     */
    public static int setInterval(Runnable aRun, int aPeriod)  { return CJWebEnv.get().setInterval(aRun, aPeriod); }

    /**
     * Stops intervals for given id.
     */
    public static void clearInterval(int anId)  { CJWebEnv.get().clearInterval(anId); }

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
