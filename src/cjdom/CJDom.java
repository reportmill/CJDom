package cjdom;

/**
 * Central class for some utility methods and testing.
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

    /**
     * Standard main implementation.
     */
    public static void main(String[] args)
    {
        log("Hello World!");

        testWindow();
        testArrays();
    }

    /**
     * Test window.
     */
    private static void testWindow()
    {
        Window window = Window.current();
        log(window);
        //window.open("http://abc.com", "_blank");
    }

    /**
     * Test arrays.
     */
    private static void testArrays()
    {
        // Int8Array
        byte[] bytes = { 1, 2, 3, 4, 5 };
        Int8Array int8Array = new Int8Array(bytes);
        log(int8Array);

        // Uint16Array
        int[] intValues = { 1, 2, 3, 4, 5 };
        Uint16Array uint16Array = new Uint16Array(intValues);
        log(uint16Array);

        // Float32Array
        double[] floatValues = { 1, 2, 3, 4, 5 };
        Float32Array float32Array = new Float32Array(floatValues);
        log(float32Array);
    }
}