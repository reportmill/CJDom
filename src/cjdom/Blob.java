package cjdom;

/**
 * Wrapper class for WebAPI Blob.
 */
public class Blob extends JSObject {

    /**
     * Constructor.
     */
    protected Blob(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Creates a URL from given blob.
     */
    //@JSBody(params = {"theBlob"}, script = "return URL.createObjectURL(theBlob);")
    public static native String createURL(Blob theBlob);

    /**
     * Creates a Blob from given bytes in Java.
     */
    public static Blob createBlob(byte[] theBytes, String aType)
    {
        Int8Array bytesJS = new Int8Array(theBytes);
        Blob blob = createBlob(bytesJS, aType);
        return blob;
    }

    /**
     * Creates a Blob from given bytes in JS.
     */
    //@JSBody(params = {"theBytes", "aType"}, script = "return new Blob([theBytes], aType? { type:aType } : null);")
    public static native Blob createBlob(Int8Array theBytes, String aType);
}
