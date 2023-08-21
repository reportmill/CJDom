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
            set(i, theObjects[i]);
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
    public void set(int index, Object aValue)
    {
        if (aValue instanceof CJObject)
            setImpl(_jsObj, index, ((CJObject) aValue)._jsObj);
        else if (aValue instanceof String)
            setStringImpl(_jsObj, index, (String) aValue);
        else if (aValue instanceof Boolean)
            setBooleanImpl(_jsObj, index, (Boolean) aValue);
        else if (aValue instanceof Integer)
            setIntImpl(_jsObj, index, (Integer) aValue);
        else if (aValue instanceof Float)
            setFloatImpl(_jsObj, index, (Float) aValue);
        else if (aValue instanceof Double)
            setDoubleImpl(_jsObj, index, (Double) aValue);
        else if (aValue == null)
            setImpl(_jsObj, index, null);
        else {
            System.out.println("Array.set: Unknown class: " + (aValue != null ? aValue.getClass().getName() : null));
        }
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
    private static native void setImpl(JSObject jsObj, int index, JSObject aValue);

    /**
     * Sets the given string value at given index.
     */
    private static native void setStringImpl(JSObject jsObj, int index, String aValue);

    /**
     * Sets the given int value at given index.
     */
    private static native void setBooleanImpl(JSObject jsObj, int index, boolean aValue);

    /**
     * Sets the given int value at given index.
     */
    private static native void setIntImpl(JSObject jsObj, int index, int aValue);

    /**
     * Sets the given float value at given index.
     */
    private static native void setFloatImpl(JSObject jsObj, int index, float aValue);

    /**
     * Sets the given double value at given index.
     */
    private static native void setDoubleImpl(JSObject jsObj, int index, double aValue);

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
