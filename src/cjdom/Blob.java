package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Blob (https://developer.mozilla.org/en-US/docs/Web/API/Blob).
 */
public class Blob extends CJObject {

    /**
     * Constructor.
     */
    public Blob(netscape.javascript.JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Constructor for given bytes and type.
     */
    public Blob(byte[] theBytes, String aType)
    {
        super();
        Int8Array int8Array = new Int8Array(theBytes);
        _jsObj = createBlobForBytesAndType(int8Array._jsObj, aType);
    }

    /**
     * Returns the blob text.
     */
    public String getText()
    {
        JSObject promiseJS = (JSObject) call("text");
        return (String) WebEnv.get().awaitForPromise(promiseJS);
    }

    /**
     * Returns a URL for this blob.
     */
    public String createURL()
    {
        return createURL(_jsObj);
    }

    /**
     * Blob method: Creates a Blob from given bytes in JS.
     */
    private static native JSObject createBlobForBytesAndType(JSObject int8ArrayJS, String aType);

    /**
     * Creates a URL from given blob.
     */
    private static native String createURL(JSObject blobJS);
}
