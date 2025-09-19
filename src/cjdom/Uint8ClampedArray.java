package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Uint8ClampedArray (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray).
 */
public class Uint8ClampedArray extends TypedArray {

    /**
     * Constructor.
     */
    public Uint8ClampedArray(Object arrayJS)
    {
        super(arrayJS);
    }

    /**
     * Constructor.
     */
    public Uint8ClampedArray(short[] shortsArray)
    {
        super(null);
        _jsObj = newArrayForShortsArray(shortsArray);
    }

    /**
     * Returns array length.
     */
    public int getLength()  { return getMemberInt("length"); }

    /**
     * Returns short value at given index.
     */
    public short get(int anIndex)  { return (short) getImpl(_jsObj, anIndex); }

    /**
     * Uint8ClampedArray: getImpl().
     */
    private static native int getImpl(JSObject jsObj, int index);

    /**
     * Uint8ClampedArray: newArrayForShortsArray()
     */
    private static native JSObject newArrayForShortsArray(short[] shortsArray);
}
