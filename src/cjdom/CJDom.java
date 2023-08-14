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
        if (anObj instanceof CJObject)
            obj = ((CJObject) anObj)._jsObj;
        logImpl(obj);
    }

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