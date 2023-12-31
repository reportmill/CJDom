package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Uint8ClampedArray (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray).
 */
public class Uint8ClampedArray extends TypedArray {

    /**
     * Constructor.
     */
    public Uint8ClampedArray(JSObject arrayJS)
    {
        super(arrayJS);
    }

    /**
     * Constructor.
     */
    public Uint8ClampedArray(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
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
     * Sets short value at given index.
     */
    public void set(int anIndex, short aValue)  { setImpl(_jsObj, anIndex, aValue); }

    /**
     * Returns an array of shorts for this array.
     */
    public short[] getShortsArray()
    {
        return getShortsArrayImpl(_jsObj);
    }

    /**
     * Returns an array of shorts for this array.
     */
    public short[] getShortsArrayForChannelIndexAndCount(int channelIndex, int channelCount)
    {
        return getShortsArrayForChannelIndexAndCountImpl(_jsObj, channelIndex, channelCount);
    }

    /**
     * Uint8ClampedArray: getImpl().
     */
    private static native int getImpl(JSObject jsObj, int index);

    /**
     * Uint8ClampedArray: setImpl().
     */
    private static native void setImpl(JSObject jsObj, int index, short aValue);

    /**
     * Uint8ClampedArray: newArrayForLengthImpl().
     */
    private static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Uint8ClampedArray: newArrayForShortsArray()
     */
    private static native JSObject newArrayForShortsArray(short[] shortsArray);

    /**
     * Uint8ClampedArray: getShortsArray()
     */
    private static native short[] getShortsArrayImpl(JSObject jsArray);

    /**
     * Uint8ClampedArray: getShortsArrayForChannelIndexAndCountImpl()
     */
    private static native short[] getShortsArrayForChannelIndexAndCountImpl(JSObject jsArray, int channelIndex, int channelCount);
}
