package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Int8Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int8Array).
 */
public class Int8Array extends TypedArray {

    /**
     * Constructor.
     */
    public Int8Array(byte[] theBytes)
    {
        super(null);
        _jsObj = newArrayForByteArray(theBytes);
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
     * Int8Array method: newArrayForByteArray().
     */
    private static native JSObject newArrayForByteArray(byte[] javaArray);

    /**
     * Int8Array method: newArrayForArrayBuffer().
     */
    protected static native JSObject newArrayForArrayBuffer(JSObject arrayBufferJS);
}
