package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
 */
public class Array extends CJObject {

    /**
     * Constructor.
     */
    public Array(JSObject arrayJS)
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
     * Returns value at given index.
     */
    public JSObject get(int index)
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
     * Returns value at given index.
     */
    public Object getObject(int index)  { return getObjectImpl(_jsObj, index); }

    /**
     * Returns value at given index.
     */
    public String getString(int index)
    {
        return getStringImpl(_jsObj, index);
    }

    /**
     * Returns value at given index.
     */
    private static native JSObject getImpl(JSObject jsObj, int index);

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(JSObject jsObj, int index, Object aValue);

    /**
     * Returns value at given index as string.
     */
    private static native Object getObjectImpl(JSObject jsObj, int index);

    /**
     * Returns value at given index as string.
     */
    private static native String getStringImpl(JSObject jsObj, int index);

    /**
     * Returns a new Array (internal).
     */
    protected static native JSObject newArrayForLengthImpl(int aLen);
}
