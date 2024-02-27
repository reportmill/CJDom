package cjdom;
import netscape.javascript.JSObject;

/**
 * This class has utility methods for CJDom.
 */
public class CJDom {

    // The platform string
    private static String _platform;

    // Returns whether platform is windows
    private static Boolean _isWindows;

    /**
     * Log given object.
     */
    public static void log(Object anObj)
    {
        Object obj = anObj;
        if (anObj instanceof CJObject) {
            JSObject jsObj = ((CJObject) anObj)._jsObj;
            logJS(jsObj);
        }

        else logImpl(obj);
    }

    /**
     * Returns whether platform is windows.
     */
    public static boolean isWindows()
    {
        if (_isWindows != null) return _isWindows;
        String platform = getPlatform();
        return _isWindows = platform.contains("Win");
    }

    /**
     * Returns the platform.
     */
    public static String getPlatform()
    {
        if (_platform != null) return _platform;
        Window window = Window.current();
        JSObject navigator = window.getMember("navigator");
        return _platform = (String) navigator.getMember("platform");
    }

    /**
     * Log given object.
     */
    public static native void logJS(JSObject anObj);

    /**
     * Log given object.
     */
    private static native void logImpl(Object anObj);

    /**
     * CJDom method: Returns document.documentElement.clientWidth.
     */
    public static native int getViewportWidth();

    /**
     * CJDom method: Returns document.documentElement.clientHeight.
     */
    public static native int getViewportHeight();

    /**
     * CJDom method: Returns window.devicePixelRatio.
     */
    public static native double getDevicePixelRatio();
}