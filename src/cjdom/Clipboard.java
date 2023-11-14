package cjdom;
import netscape.javascript.JSObject;
import java.util.stream.Stream;

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
        Object[] clipboardItemsJS = clipboardReadImpl();
        return Stream.of(clipboardItemsJS).map(item -> new ClipboardItem((JSObject) item)).toArray(size -> new ClipboardItem[size]);
    }

    /**
     * Returns clipboard.write(items) promise.
     */
    public static void getClipboardWriteItemsPromise(Array<ClipboardItem> theItems)
    {
        clipboardWriteImpl(theItems._jsObj);
    }

    /**
     * Clipboard: clipboardReadImpl()
     */
    private static native Object[] clipboardReadImpl();

    /**
     * Clipboard: clipboardWriteImpl()
     */
    public static native void clipboardWriteImpl(JSObject theItems);
}