package cjdom;

import cjdomtest.BallBounce;

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
        testDocument();
        new BallBounce();
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

    /**
     * Test Document.
     */
    private static void testDocument()
    {
        System.out.println("Get Document");
        HTMLDocument document = HTMLDocument.current();

        System.out.println("Create image element");
        HTMLImageElement imageElement = (HTMLImageElement) document.createElement("img");
        log(imageElement);
        imageElement.setWidth(120);
        imageElement.setHeight(120);
        System.out.println("Image width: " + imageElement.getWidth() + ", height: " + imageElement.getHeight());

        System.out.println("Create canvas element");
        HTMLCanvasElement canvasElement = (HTMLCanvasElement) document.createElement("canvas");
        log(canvasElement);
        canvasElement.setWidth(120);
        canvasElement.setHeight(120);
        System.out.println("Canvas width: " + canvasElement.getWidth() + ", height: " + canvasElement.getHeight());
    }
}