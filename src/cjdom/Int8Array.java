package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Int8Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array).
 */
public class Int8Array extends TypedArray {

    /**
     * Constructor.
     */
    public Int8Array(int length)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Int8Array(byte[] theBytes)
    {
        super(null);
        _jsObj = newArrayForLengthImpl(theBytes.length);
        for (int i = 0; i < theBytes.length; i++)
            setImpl(_jsObj, i, theBytes[i]);
    }

    /**
     * Constructor.
     */
    public Int8Array(ArrayBuffer arrayBuffer)
    {
        super(null);
        _jsObj = newArrayForArrayBuffer(arrayBuffer._jsObj);
    }

    /**
     * Returns the value at given index.
     */
    public byte get(int index)  { return getImpl(_jsObj, index); }

    /**
     * Sets the given value at given index.
     */
    public void set(int index, byte aValue)
    {
        setImpl(_jsObj, index, aValue);
    }

    /**
     * Returns the bytes.
     */
    public byte[] getBytes()
    {
        int length = getLength();
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++)
            bytes[i] = get(i);
        return bytes;
    }

    /**
     * Returns the value at given index.
     */
    private static native byte getImpl(JSObject jsObj, int index);

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(JSObject jsObj, int index, byte aValue);

    /**
     * Returns a new Uint8Array (internal).
     */
    protected static native JSObject newArrayForLengthImpl(int aLen);

    /**
     * Returns a new Uint8Array (internal).
     */
    protected static native JSObject newArrayForArrayBuffer(JSObject arrayBufferJS);
}
