package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Int32Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array).
 */
public class Int32Array extends TypedArray {

    /**
     * Constructor.
     */
    public Int32Array(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Int32Array(int[] theValues)
    {
        super(null);
        _jsObj = newArrayForJavaArray(theValues, theValues.length);
    }

    /**
     * Returns a new Int32Array (internal).
     */
    protected static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Returns a new Int32Array (internal).
     */
    private static native JSObject newArrayForJavaArray(int[] javaArray, int length);
}
