package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Clipboard (https://developer.mozilla.org/en-US/docs/Web/API/Clipboard).
 */
public class Clipboard extends CJObject {

    /**
     * Constructor.
     */
    public Clipboard(JSObject eventJS)
    {
        super(eventJS);
    }

    /**
     * Reads clipboard and returns an array of ClipboardItem.
     */
    public static ClipboardItem[] clipboardRead()
    {
        // Get array of clipboard items (JS)
        JSObject arrayJS = clipboardReadImpl();
        Array<ClipboardItem> array = new Array<>(arrayJS);

        // Convert Array<clipboardItemJS> to ClipboardItems[]
        int length = array.getLength();
        ClipboardItem[] clipboardItems = new ClipboardItem[length];
        for (int i = 0; i < length; i++) {
            JSObject clipboardItemJS = array.get(i);
            clipboardItems[i] = new ClipboardItem(clipboardItemJS);
        }

        // Return
        return clipboardItems;
    }

    /**
     * Returns clipboard.write(items) promise.
     */
    public static void getClipboardWriteItemsPromise(Array<ClipboardItem> theItems)
    {
        getClipboardWriteItemsPromiseImpl(theItems._jsObj);
    }

    /**
     * Clipboard: clipboardReadImpl()
     */
    private static native JSObject clipboardReadImpl();

    /**
     * Clipboard: getClipboardWriteItemsPromiseImpl()
     */
    public static native void getClipboardWriteItemsPromiseImpl(JSObject theItems);
}