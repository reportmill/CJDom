package cjdom;

/**
 * Wrapper class for WebAPI Float32Array.
 */
public class Float32Array extends JSObject {

    /**
     * Constructor.
     */
    public Float32Array(int length)
    {
        super();
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Float32Array(float[] theValues)
    {
        this(theValues.length);
        for (int i = 0; i < theValues.length; i++)
            setImpl(_jsObj, i, theValues[i]);
    }

    /**
     * Constructor.
     */
    public Float32Array(double[] theValues)
    {
        this(theValues.length);
        for (int i = 0; i < theValues.length; i++)
            setImpl(_jsObj, i, theValues[i]);
    }

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(Object jsObj, int index, double aValue);

    /**
     * Returns a new Float32Array (internal).
     */
    private static native Object newArrayForLengthImpl(int aLen);
}
