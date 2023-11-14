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
    public static ClipboardItem[] readClipboardItems()
    {
        Object[] clipboardItemsJS = readClipboardItemsImpl();
        return Stream.of(clipboardItemsJS).map(item -> new ClipboardItem((JSObject) item)).toArray(size -> new ClipboardItem[size]);
    }

    /**
     * Writes array of ClipboardItem to clipboard.
     */
    public static void writeClipboardItems(ClipboardItem[] clipboardItems)
    {
        Array<ClipboardItem> clipboardItemsArray = new Array<>(clipboardItems);
        writeClipboardItemsImpl(clipboardItemsArray._jsObj);
    }

    /**
     * Clipboard: readClipboardItemsImpl()
     */
    private static native Object[] readClipboardItemsImpl();

    /**
     * Clipboard: writeClipboardItemsImpl()
     */
    public static native void writeClipboardItemsImpl(JSObject clipboardItemsJS);
}