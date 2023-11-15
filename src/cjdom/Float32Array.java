package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Float32Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array).
 */
public class Float32Array extends TypedArray {

    /**
     * Constructor.
     */
    public Float32Array(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Float32Array(float[] floatArray)
    {
        super(null);
        _jsObj = newArrayForFloatArray(floatArray);
    }

    /**
     * Constructor.
     */
    public Float32Array(double[] doubleArray)
    {
        super(null);
        _jsObj = fromImpl(doubleArray);
    }

    /**
     * Float32Array method: setImpl().
     */
    private static native void setImpl(JSObject jsObj, int index, double aValue);

    /**
     * Float32Array method: newArrayForLengthImpl().
     */
    private static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Float32Array method: newArrayForFloatArray().
     */
    private static native JSObject newArrayForFloatArray(float[] javaArray);

    /**
     * Float32Array method: fromImpl().
     */
    private static native JSObject fromImpl(Object arrayLike);
}
