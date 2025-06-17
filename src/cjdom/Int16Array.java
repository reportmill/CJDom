package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Int16Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int16Array).
 */
public class Int16Array extends TypedArray {

    /**
     * Constructor.
     */
    public Int16Array(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Int16Array(short[] theValues)
    {
        super(null);
        _jsObj = newArrayForJavaArray(theValues, theValues.length);
    }

    /**
     * Sets the given value at given index.
     */
    public void set(int index, int aValue)  { setImpl(_jsObj, index, aValue); }

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(JSObject jsObj, int index, int aValue);

    /**
     * Returns a new Int32Array (internal).
     */
    protected static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Returns a new Int32Array (internal).
     */
    private static native JSObject newArrayForJavaArray(short[] javaArray, int length);
}
