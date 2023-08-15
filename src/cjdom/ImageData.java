package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API ImageData (https://developer.mozilla.org/en-US/docs/Web/API/ImageData).
 */
public class ImageData extends CJObject {

    /**
     * Constructor.
     */
    public ImageData(JSObject imageDataJS)
    {
        super(imageDataJS);
    }

    /**
     * Constructor.
     */
    public ImageData(Uint8ClampedArray intArray, int aWidth, int aHeight)
    {
        super();
        _jsObj = newImageDataForArrayAndWidthAndHeight(intArray._jsObj, aWidth, aHeight);
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
        JSObject arrayJS = getMember("data");
        return new Uint8ClampedArray(arrayJS);
    }

    /**
     * ImageData: newImageDataForArrayAndWidthAndHeight()
     */
    private static native JSObject newImageDataForArrayAndWidthAndHeight(JSObject uint8ClampedArrayJS, int aWidth, int aHeight);
}
