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
     * Returns the types.
     */
    public String[] getTypes()
    {
        // Get array of types
        JSObject arrayJS = getMember("types");
        Array<String> array = new Array<>(arrayJS);
        int length = array.getLength();

        // Convert to array of String
        String[] types = new String[length];
        for (int i = 0; i < length; i++)
            types[i] = array.getString(i);

        // Return
        return types;
    }

    /**
     * Returns a type.
     */
    public Blob getType(String aType)
    {
        JSObject blobJS = (JSObject) _jsObj.call("getType", aType);
        return new Blob(blobJS);
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