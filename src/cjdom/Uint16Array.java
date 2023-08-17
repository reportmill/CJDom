package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Uint16Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array).
 */
public class Uint16Array extends TypedArray {

    /**
     * Constructor.
     */
    public Uint16Array(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Uint16Array(short[] theValues)
    {
        super(null);
        _jsObj = newArrayForJavaArray(theValues, theValues.length);
    }

    /**
     * Constructor.
     */
    public Uint16Array(int[] theValues)
    {
        super(null);
        int length = theValues.length;
        short[] shortsArray = new short[length];
        for (int i = 0; i < length; i++) shortsArray[i] = (short) theValues[i];
        _jsObj = newArrayForJavaArray(shortsArray, length);
    }

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(JSObject jsObj, int index, int aValue);

    /**
     * Returns a new Uint16Array (internal).
     */
    private static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Returns a new Uint16Array (internal).
     */
    private static native JSObject newArrayForJavaArray(short[] javaArray, int length);
}
