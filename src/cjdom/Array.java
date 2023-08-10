package cjdom;

/**
 * Wrapper class for WebAPI Array.
 */
public class Array extends JSObject {

    /**
     * Constructor.
     */
    public Array(Object arrayJS)
    {
        super();
        _jsObj = arrayJS;
    }

    /**
     * Constructor.
     */
    public Array(int length)
    {
        super();
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Array(Object[] theObjects)
    {
        super();
        _jsObj = newArrayForLengthImpl(theObjects.length);
        for (int i = 0; i < theObjects.length; i++)
            setImpl(_jsObj, i, theObjects[i]);
    }

    /**
     * Sets the given value at given index.
     */
    public Object get(int index)
    {
        return getImpl(_jsObj, index);
    }

    /**
     * Sets the given value at given index.
     */
    public void set(int index, byte aValue)
    {
        setImpl(_jsObj, index, aValue);
    }

    /**
     * Returns the given value at given index.
     */
    private static native Object getImpl(Object jsObj, int index);

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(Object jsObj, int index, Object aValue);

    /**
     * Returns a new Array (internal).
     */
    protected static native Object newArrayForLengthImpl(int aLen);
}
