package cjdom;
import java.util.function.DoubleConsumer;

/**
 * This class is an adapter for this package, implementing the fundamental functionality to make it work with
 * CheerpJ, TeaVM, JxBrowser.
 */
public abstract class WebEnv {

    // The shared Env
    private static WebEnv _shared;

    /**
     * Returns a shared instance.
     */
    public static WebEnv get()
    {
        if (_shared != null) return _shared;
        return _shared = new CJWebEnv();
    }

    /**
     * Returns the current window.
     */
    public abstract Window window();

    /**
     * Returns the current console.
     */
    public abstract Console console();

    /**
     * Wrapper method for Web API method.
     */
    public void open(String url, String target, String windowFeatures)
    {
        Window window = get().window();
        window.call("open", url, target, windowFeatures);
    }

    /**
     * Request animation frame.
     */
    public abstract int requestAnimationFrame(DoubleConsumer callback);

    /**
     * Schedules a runnable to execute after a delay of given milliseconds.
     */
    public abstract void setTimeout(Runnable aRun, int aDelay);

    /**
     * Schedules a runnable to execute every time a given number of milliseconds elapses.
     */
    public abstract int setInterval(Runnable aRun, int aPeriod);

    /**
     * Stops intervals for given id.
     */
    public void clearInterval(int anId)
    {
        Window window = get().window();
        window.call("clearInterval", anId);
    }
}
