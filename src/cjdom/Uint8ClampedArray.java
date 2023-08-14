package cjdom;

/**
 * This class is a wrapper for Web API Uint8ClampedArray (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray).
 */
public class Uint8ClampedArray extends CJObject {

    /**
     * Constructor.
     */
    public Uint8ClampedArray(netscape.javascript.JSObject arrayJS)
    {
        super(arrayJS);
    }

    /**
     * Constructor.
     */
    public Uint8ClampedArray(int length)
    {
        super();
        _jsObj = newArrayForLengthImpl(length);
    }

    public int getLength()
    {
        return 0;
    }

    public short get(int anIndex)
    {
        return 0;
    }

    public void set(int anIndex, short aValue)
    {
        setImpl(_jsObj, anIndex, aValue);
    }

    /**
     * Sets the given value at given index.
     */
    private static native void setImpl(Object jsObj, int index, int aValue);

    /**
     * Returns a new Uint16Array (internal).
     */
    private static native netscape.javascript.JSObject newArrayForLengthImpl(int aLen);
}
