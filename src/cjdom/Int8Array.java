package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Int8Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array).
 */
public class Int8Array extends CJObject {

    /**
     * Constructor.
     */
    public Int8Array(int length)
    {
        super();
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Int8Array(byte[] theBytes)
    {
        super();
        _jsObj = newArrayForLengthImpl(theBytes.length);
        for (int i = 0; i < theBytes.length; i++)
            setImpl(_jsObj, i, theBytes[i]);
    }

    /**
     * Sets the given value at given index.
     */
    public void set(int index, byte aValue)
    {
        setImpl(_jsObj, index, aValue);
    }

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(JSObject jsObj, int index, byte aValue);

    /**
     * Returns a new Uint16Array (internal).
     */
    protected static native JSObject newArrayForLengthImpl(int aLen);
}
