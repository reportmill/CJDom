package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API ClipboardItem (https://developer.mozilla.org/en-US/docs/Web/API/ClipboardItem).
 */
public class ClipboardItem extends CJObject {

    /**
     * Constructor.
     */
    public ClipboardItem(JSObject eventJS)
    {
        super(eventJS);
    }

    /**
     * Constructor.
     */
    public ClipboardItem(String aType, String aValue)
    {
        super(null);
        _jsObj = newClipboardItemForTypeAndString(aType, aValue);
    }

    /**
     * Constructor.
     */
    public ClipboardItem(Blob aBlob)
    {
        super(null);
        _jsObj = newClipboardItemForBlob(aBlob._jsObj);
    }

    /**
     * ClipboardItem: newClipboardItemForTypeAndString()
     */
    private static native JSObject newClipboardItemForTypeAndString(String aType, String aString);

    /**
     * ClipboardItem: newClipboardItemForBlob()
     */
    private static native JSObject newClipboardItemForBlob(JSObject blobJS);
}