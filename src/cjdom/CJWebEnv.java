package cjdom;
import netscape.javascript.JSObject;
import java.util.function.DoubleConsumer;

/**
 * The web environment for CheerpJ.
 */
public class CJWebEnv extends WebEnv {

    // The current Window
    private Window _window;

    // The current Console
    private Console _console;

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
     * Request animation frame.
     */
    public int requestAnimationFrame(DoubleConsumer callback)
    {
        return EventQueue.requestAnimationFrame(callback);
    }

    /**
     * Schedules a runnable to execute after a delay of given milliseconds.
     */
    public void setTimeout(Runnable aRun, int aDelay)
    {
        EventQueue.setTimeout(aRun, aDelay);
    }

    /**
     * Schedules a runnable to execute every time a given number of milliseconds elapses.
     */
    public int setInterval(Runnable aRun, int aPeriod)
    {
        //java.util.TimerTask timerTask = new TimerTask() { public void run()  { moveBalls(); } };
        //new java.util.Timer().schedule(timerTask, 0, 25);
        return EventQueue.setInterval(aRun, aPeriod);
    }

    /**
     * Returns the current window.
     */
    private static native JSObject windowImpl();

    /**
     * Returns the current console.
     */
    private static native JSObject consoleImpl();
}
