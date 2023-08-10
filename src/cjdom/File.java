package cjdom;

/**
 * This class is a wrapper for Web API File (https://developer.mozilla.org/en-US/docs/Web/API/File).
 */
public class File extends Blob {

    /**
     * Constructor.
     */
    public File(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Constructor for name, type and bytes.
     */
    public File(String aName, String aType, byte[] theBytes)
    {
        super(null);
        Int8Array int8Array = new Int8Array(theBytes);
        _jsObj = createFileForNameAndTypeAndBytes(aName, aType, int8Array._jsObj);
    }

    /**
     * Creates a File from given bytes in JS.
     */
    private static native Object createFileForNameAndTypeAndBytes(String aName, String aType, Object int8ArrayJS);
}
