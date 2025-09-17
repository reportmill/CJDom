package cjdom;
import java.util.function.DoubleConsumer;

/**
 * This class is an adapter for this package, implementing the fundamental functionality to make it work with
 * CheerpJ, TeaVM, JxBrowser.
 */
public abstract class WebEnv<T> {

    // The shared Env
    private static final WebEnv<Object> _shared = (WebEnv<Object>) createEnv();

    /**
     * Returns a shared instance.
     */
    public static WebEnv<Object> get()  { return _shared; }

    /**
     * Returns a shared instance.
     */
    private static WebEnv<?> createEnv()  { return new CJWebEnv(); }

    /**
     * Returns a named member of a JavaScript object.
     */
    public abstract T getMember(T jsObj, String aName);

    /**
     * Sets a named member of a JavaScript object.
     */
    public abstract void setMember(T jsObj, String aName, T aValue);

    /**
     * Returns a named member of a JavaScript object.
     */
    public abstract String getMemberString(T jsObj, String aName);

    /**
     * Sets a named member of a JavaScript object.
     */
    public abstract void setMemberString(T jsObj, String aName, String aValue);

    /**
     * Returns a named member of a JavaScript object.
     */
    public abstract boolean getMemberBoolean(T jsObj, String aName);

    /**
     * Sets a named member of a JavaScript object.
     */
    public abstract void setMemberBoolean(T jsObj, String aName, boolean aValue);

    /**
     * Returns a named member of a JavaScript object as int.
     */
    public abstract int getMemberInt(T jsObj, String aName);

    /**
     * Sets a named member of a JavaScript object.
     */
    public abstract void setMemberInt(T jsObj, String aName, int aValue);

    /**
     * Returns a named member of a JavaScript object as double.
     */
    public abstract double getMemberDouble(T jsObj, String aName);

    /**
     * Sets a named member of a JavaScript object as double.
     */
    public abstract void setMemberDouble(T jsObj, String aName, double aValue);

    /**
     * Calls a method.
     */
    public abstract Object call(T jsObj, String aName, Object... args);

    /**
     * Evaluates given JavaScript string and returns result.
     */
    public abstract Object eval(T jsObj, String javaScript);

    /**
     * Returns the current window.
     */
    public abstract Window window();

    /**
     * Returns the current console.
     */
    public abstract Console console();

    /**
     * Returns a new JavaScript native object.
     */
    public Object newObject()  { return eval((T) window()._jsObj, "return { };"); }

    /**
     * Does await promise for given promise.
     */
    public abstract Object awaitForPromise(T aPromise);

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

    /**
     * Performs click on given HTMLElement JS.
     */
    public void click(T jsObj)  { call(jsObj, "click"); }
}
