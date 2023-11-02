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
    public Uint8ClampedArray(short[] theValues)
    {
        super(null);
        _jsObj = newArrayForJavaArray(theValues, theValues.length);
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
        // Convert image bytes array to shorts array
        int length = getLength();
        short[] shortsArray = new short[length];
        copyToJavaArray(_jsObj, shortsArray, length);
        //for (int i = 0; i < length; i++) shortsArray[i] = get(i);

        // Return
        return shortsArray;
    }

    /**
     * Returns an array of shorts for this array.
     */
    public short[] getShortsArrayForChannelIndexAndCount(int channelIndex, int channelCount)
    {
        int length = getLength();
        int length2 = length / channelCount;
        short[] shortsArray = new short[length2];
        copyToJavaArrayForChannelIndexAndCount(_jsObj, shortsArray, length2, channelIndex, channelCount);
        //for (int i = 0, j = channelIndex; i < length2; i++, j += channelCount) shortsArray[i] = get(j);

        // Return
        return shortsArray;
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
     * Uint8ClampedArray: newArrayForJavaArray()
     */
    private static native JSObject newArrayForJavaArray(short[] javaArray, int length);

    /**
     * Uint8ClampedArray: copyToJavaArray()
     */
    private static native void copyToJavaArray(JSObject jsArray, short[] javaArray, int length);

    /**
     * Uint8ClampedArray: copyToJavaArrayForChannelIndexAndCount()
     */
    private static native void copyToJavaArrayForChannelIndexAndCount(JSObject jsArray, short[] javaArray, int length, int channelIndex, int channelCount);
}
