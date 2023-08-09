package cjdomtest;
import cjdom.*;

/**
 * Some tests.
 */
public class DomTests {

    /**
     * Standard main implementation.
     */
    public static void main(String[] args)
    {
        CJDom.log("Hello World!");
        testAll();
    }

    /**
     * Run all tests.
     */
    public static void testAll()
    {
        testWindow();
        testArrays();
        testDocument();
    }

    /**
     * Test window.
     */
    private static void testWindow()
    {
        Window window = Window.current();
        CJDom.log(window);
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
        CJDom.log(int8Array);

        // Uint16Array
        int[] intValues = { 1, 2, 3, 4, 5 };
        Uint16Array uint16Array = new Uint16Array(intValues);
        CJDom.log(uint16Array);

        // Float32Array
        double[] floatValues = { 1, 2, 3, 4, 5 };
        Float32Array float32Array = new Float32Array(floatValues);
        CJDom.log(float32Array);
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
        CJDom.log(imageElement);
        imageElement.setWidth(120);
        imageElement.setHeight(120);
        System.out.println("Image width: " + imageElement.getWidth() + ", height: " + imageElement.getHeight());

        System.out.println("Create canvas element");
        HTMLCanvasElement canvasElement = (HTMLCanvasElement) document.createElement("canvas");
        CJDom.log(canvasElement);
        canvasElement.setWidth(120);
        canvasElement.setHeight(120);
        System.out.println("Canvas width: " + canvasElement.getWidth() + ", height: " + canvasElement.getHeight());
    }
}
