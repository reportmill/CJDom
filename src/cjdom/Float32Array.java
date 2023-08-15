package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Float32Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array).
 */
public class Float32Array extends CJObject {

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
    private static native void setImpl(JSObject jsObj, int index, double aValue);

    /**
     * Returns a new Float32Array (internal).
     */
    private static native JSObject newArrayForLengthImpl(int aLen);
}
