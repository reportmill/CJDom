package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Uint8ClampedArray (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray).
 */
public class Uint8ClampedArray extends CJObject {

    /**
     * Constructor.
     */
    public Uint8ClampedArray(JSObject arrayJS)
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

    /**
     * Returns array length.
     */
    public int getLength()  { return getMemberInt("length"); }

    /**
     * Returns short value at given index.
     */
    public short get(int anIndex)  { return (short) getImpl(_jsObj, anIndex); }

    /**
     * Sets short value at given index.
     */
    public void set(int anIndex, short aValue)  { setImpl(_jsObj, anIndex, aValue); }

    /**
     * Uint8ClampedArray: getImpl().
     */
    private static native int getImpl(JSObject jsObj, int index);

    /**
     * Uint8ClampedArray: setImpl().
     */
    private static native void setImpl(JSObject jsObj, int index, short aValue);

    /**
     * Uint8ClampedArray: newArrayForLengthImpl().
     */
    private static native JSObject newArrayForLengthImpl(int aLen);
}
