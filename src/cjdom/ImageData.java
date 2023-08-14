package cjdom;

/**
 * This class is a wrapper for Web API ImageData (https://developer.mozilla.org/en-US/docs/Web/API/ImageData).
 */
public class ImageData extends CJObject {

    /**
     * Constructor.
     */
    public ImageData(netscape.javascript.JSObject imageDataJS)
    {
        super(imageDataJS);
    }

    /**
     * Constructor.
     */
    public ImageData(Uint8ClampedArray intArray, int aWidth, int aHeight)
    {
        super();
    }

    /**
     * Returns ImageData.width.
     */
    public int getWidth()  { return getMemberInt("width"); }

    /**
     * Returns ImageData.width.
     */
    public int getHeight()  { return getMemberInt("height"); }

    /**
     * Returns ImageData.width.
     */
    public Uint8ClampedArray getData()
    {
        netscape.javascript.JSObject arrayJS = getMember("data");
        return new Uint8ClampedArray(arrayJS);
    }

    // script = "return new ImageData(array, width, height);"
    public static native netscape.javascript.JSObject newImageDataForArrayAndWidthAndHeight(Object uint8ClampedArrayJS, int aWidth, int aHeight);
}
