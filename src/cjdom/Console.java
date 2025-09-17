package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Console (https://developer.mozilla.org/en-US/docs/Web/API/Console).
 */
public class Console extends CJObject {

    /**
     * Constructor.
     */
    public Console(JSObject winJS)
    {
        super();
        _jsObj = winJS;
    }

    /**
     * Log given object.
     */
    public static void log(Object anObj)
    {
        Object obj = anObj;
        if (anObj instanceof CJObject)
            obj = ((CJObject) anObj)._jsObj;

        Console console = WebEnv.get().console();
        console._jsObj.call("log", obj);
    }
}