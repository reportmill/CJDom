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
    public ClipboardItem(Blob aBlob)
    {
        super(null);
        _jsObj = null; // var param = {}; param[blob.type] = blob; return new ClipboardItem(param);
    }
}