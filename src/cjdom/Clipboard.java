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
     * Returns a Promise for read permissions.
     * Chrome supports. Safari just returns null.
     */
    public static Promise<Object> getReadPermissionsPromise()
    {
        JSObject promiseJS = getReadPermissionsPromiseImpl();
        return new Promise<>(promiseJS);
    }

    /**
     * Returns clipboard.readText() promise.
     */
    public static Promise<String> getClipboardReadTextPromise()
    {
        JSObject promiseJS = getClipboardReadTextPromiseImpl();
        return new Promise<>(promiseJS);
    }

    /**
     * Returns clipboard.write(items) promise.
     */
    public static Promise<String> getClipboardWriteItemsPromise(Array<ClipboardItem> theItems)
    {
        JSObject promiseJS = getClipboardWriteItemsPromiseImpl(theItems._jsObj);
        return new Promise<>(promiseJS);
    }

    /**
     * Returns navigator.permissions.state for given permissions.
     */
    public static String getPermissionStatusState(Object aPermResult)
    {
        CJObject cjObject = aPermResult instanceof CJObject ? (CJObject) aPermResult : new CJObject((JSObject) aPermResult);
        return cjObject.getMemberString("state");
    }

    /**
     * Clipboard: getReadPermissionsPromiseImpl()
     */
    private static native JSObject getReadPermissionsPromiseImpl();

    /**
     * Clipboard: getClipboardReadTextPromiseImpl()
     */
    public static native JSObject getClipboardReadTextPromiseImpl();

    /**
     * Clipboard: getClipboardWriteItemsPromiseImpl()
     */
    public static native JSObject getClipboardWriteItemsPromiseImpl(JSObject theItems);

    /**
     * Returns navigator.clipboard.read() promise.
     */
    //public static native JSPromise<JSArray<JSDataTransferItem>> getClipboardReadPromise();
    // return navigator.clipboard.read();
}