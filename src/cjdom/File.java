package cjdom;
import netscape.javascript.JSObject;

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
     * Returns the file name.
     */
    public String getName()  { return getMemberString("name"); }

    /**
     * Returns the file type.
     */
    public String getType()  { return getMemberString("type"); }

    /**
     * Creates a File from given bytes in JS.
     */
    private static native JSObject createFileForNameAndTypeAndBytes(String aName, String aType, JSObject int8ArrayJS);
}
