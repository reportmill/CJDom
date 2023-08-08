package cjdom;

/**
 * Wrapper class for WebAPI Uint16Array.
 */
public class Uint16Array extends JSObject {

    /**
     * Constructor.
     */
    public Uint16Array(int length)
    {
        super();
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Uint16Array(short[] theValues)
    {
        this(theValues.length);
        for (int i = 0; i < theValues.length; i++)
            setImpl(_jsObj, i, theValues[i]);
    }

    /**
     * Constructor.
     */
    public Uint16Array(int[] theValues)
    {
        this(theValues.length);
        for (int i = 0; i < theValues.length; i++)
            setImpl(_jsObj, i, theValues[i]);
    }

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(Object jsObj, int index, int aValue);

    /**
     * Returns a new Uint16Array (internal).
     */
    private static native Object newArrayForLengthImpl(int aLen);
}
