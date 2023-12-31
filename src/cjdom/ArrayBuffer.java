package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API ArrayBuffer (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer).
 */
public class ArrayBuffer extends CJObject {

    /**
     * Constructor.
     */
    public ArrayBuffer(JSObject arrayBufferJS)
    {
        super(arrayBufferJS);
    }

    /**
     * Returns the ArrayBuffer.byteLength property.
     */
    public int getByteLength()  { return getMemberInt("byteLength"); }
}
