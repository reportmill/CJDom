package cjdomtest;
import webapi.*;

/**
 * Some tests.
 */
public class DomTests {

    /**
     * Standard main implementation.
     */
    public static void main(String[] args)
    {
        Console.log("Hello World!");
        testAddHelloWorldDiv();
    }

    /**
     * This test adds a hello world div to the document.
     */
    public static void testAddHelloWorldDiv()
    {
        HTMLDocument doc = HTMLDocument.getDocument();
        HTMLDivElement div = (HTMLDivElement) doc.createElement("div");
        div.setInnerText("Hello World Everyone!");
        HTMLBodyElement body = HTMLBodyElement.getBody();
        body.appendChild(div);
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
        Window window = Window.get();
        Console.log(window);
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
        Console.log(int8Array);

        // Uint16Array
        int[] intValues = { 1, 2, 3, 4, 5 };
        Uint16Array uint16Array = new Uint16Array(intValues);
        Console.log(uint16Array);

        // Float32Array
        double[] floatValues = { 1, 2, 3, 4, 5 };
        Float32Array float32Array = new Float32Array(floatValues);
        Console.log(float32Array);
    }

    /**
     * Test Document.
     */
    private static void testDocument()
    {
        System.out.println("Get Document");
        HTMLDocument document = HTMLDocument.getDocument();

        System.out.println("Create image element");
        HTMLImageElement imageElement = (HTMLImageElement) document.createElement("img");
        Console.log(imageElement);
        imageElement.setWidth(120);
        imageElement.setHeight(120);
        System.out.println("Image width: " + imageElement.getWidth() + ", height: " + imageElement.getHeight());

        System.out.println("Create canvas element");
        HTMLCanvasElement canvasElement = (HTMLCanvasElement) document.createElement("canvas");
        Console.log(canvasElement);
        canvasElement.setWidth(120);
        canvasElement.setHeight(120);
        System.out.println("Canvas width: " + canvasElement.getWidth() + ", height: " + canvasElement.getHeight());
    }
}
