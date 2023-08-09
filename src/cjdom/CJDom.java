package cjdom;

/**
 * This class has utility methods for CJDom.
 */
public class CJDom {

    /**
     * Log given object.
     */
    public static void log(Object anObj)
    {
        Object obj = anObj;
        if (anObj instanceof JSObject)
            obj = ((JSObject) anObj)._jsObj;
        logImpl(obj);
    }

    /**
     * Log given object.
     */
    private static native void logImpl(Object anObj);

}