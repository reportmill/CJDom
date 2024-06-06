package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Navigator (https://developer.mozilla.org/en-US/docs/Web/API/Navigator).
 */
public class Navigator {

    // The navigator
    private static JSObject _navigator;

    // The platform string
    private static String _platform;

    // The user agent string
    private static String _userAgent;

    // Returns whether platform is windows
    private static Boolean _isWindows;

    // Returns whether user agent is Safari
    private static Boolean _isSafari;

    /**
     * Returns the navigator.
     */
    private static JSObject getNavigator()
    {
        if (_navigator != null) return _navigator;
        Window window = Window.current();
        return _navigator = window.getMember("navigator");
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
     * Returns whether UserAgent is Safari.
     */
    public static boolean isSafari()
    {
        if (_isSafari != null) return _isSafari;
        String userAgent = getUserAgent();
        return _isSafari = userAgent.contains("Safari") && !userAgent.contains("Chrome") && !userAgent.contains("CriOS");
    }

    /**
     * Returns the platform.
     */
    public static String getPlatform()
    {
        if (_platform != null) return _platform;
        JSObject navigator = getNavigator();
        return _platform = (String) navigator.getMember("platform");
    }

    /**
     * Returns the platform.
     */
    public static String getUserAgent()
    {
        if (_userAgent != null) return _userAgent;
        JSObject navigator = getNavigator();
        return _userAgent = (String) navigator.getMember("userAgent");
    }
}
