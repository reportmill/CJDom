package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Uint32Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint32Array).
 */
public class Uint32Array extends TypedArray {

    /**
     * Constructor.
     */
    public Uint32Array(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Uint32Array(int[] theValues)
    {
        super(null);
        _jsObj = newArrayForJavaArray(theValues, theValues.length);
    }

    /**
     * Returns a new Uint32Array (internal).
     */
    private static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Returns a new Uint32Array (internal).
     */
    private static native JSObject newArrayForJavaArray(int[] javaArray, int length);
}
