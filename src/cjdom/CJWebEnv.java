package cjdom;
import netscape.javascript.JSObject;

/**
 * The web environment for CheerpJ.
 */
public class CJWebEnv {

    // The current Window
    private Window _window;

    // The current Console
    private Console _console;

    // The shared Env
    private static CJWebEnv _shared;

    /**
     * Returns a shared instance.
     */
    public static CJWebEnv get()
    {
        if (_shared != null) return _shared;
        return _shared = new CJWebEnv();
    }

    /**
     * Returns the current window.
     */
    public Window window()
    {
        if (_window != null) return _window;
        JSObject winJS = windowImpl();
        return _window = new Window(winJS);
    }

    /**
     * Returns the current console.
     */
    public Console console()
    {
        if (_console != null) return _console;
        JSObject consoleJS = consoleImpl();
        return _console = new Console(consoleJS);
    }

    /**
     * Returns the current window.
     */
    public static native JSObject windowImpl();

    /**
     * Returns the current console.
     */
    public static native JSObject consoleImpl();
}
