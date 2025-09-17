package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API FileReader (https://developer.mozilla.org/en-US/docs/Web/API/FileReader).
 */
public class FileReader extends CJObject implements EventTarget {

    /**
     * Constructor.
     */
    public FileReader()
    {
        super();
        _jsObj = newFileReader();
    }

    /**
     * Starts reading the contents of a specified Blob or File.
     * When the read operation is finished, the readyState becomes DONE, and the loadend is triggered.
     * At that time, the result attribute contains an ArrayBuffer representing the file's data.
     */
    public void readAsArrayBuffer(Blob aBlob)
    {
        call("readAsArrayBuffer", aBlob._jsObj);
    }

    /**
     * Returns the bytes.
     */
    public byte[] getResultBytes()
    {
        JSObject arrayBufferJS = getMember("result");
        ArrayBuffer arrayBuffer = new ArrayBuffer(arrayBufferJS);

        Int8Array int8Array = new Int8Array(arrayBuffer);
        return int8Array.getBytes();
    }

    /**
     * readBytesAndWait
     */
    public void readBytesAndRunLater(Blob aBlob, Runnable aRun)
    {
        addEventListener("loadend", e -> aRun.run());
        readAsArrayBuffer(aBlob);
    }

    /**
     * FileReader: newFileReader().
     */
    private static native JSObject newFileReader();
}