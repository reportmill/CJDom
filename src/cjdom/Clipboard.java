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
     * Returns PermissionStatus for read permissions.
     * Chrome supports. Safari just returns null.
     */
    public static PermissionStatus getReadPermissionsPromise()
    {
        // https://developer.mozilla.org/en-US/docs/Web/API/PermissionStatus
        JSObject permissionStatusJS = getReadPermissionsPromiseImpl();
        return new PermissionStatus(permissionStatusJS);
        //return new Promise<>(getReadPermissionsPromiseImpl());
    }

    /**
     * Returns clipboard.readText() promise.
     */
    public static String getClipboardReadTextPromise()
    {
        return getClipboardReadTextPromiseImpl();
        //return new Promise<>(getClipboardReadTextPromiseImpl());
    }

    /**
     * Returns clipboard.write(items) promise.
     */
    public static void getClipboardWriteItemsPromise(Array<ClipboardItem> theItems)
    {
        getClipboardWriteItemsPromiseImpl(theItems._jsObj);
        //return new Promise<>(getClipboardWriteItemsPromiseImpl(theItems._jsObj));
    }

    /**
     * Clipboard: getReadPermissionsPromiseImpl()
     */
    private static native JSObject getReadPermissionsPromiseImpl();

    /**
     * Clipboard: getClipboardReadTextPromiseImpl()
     */
    public static native String getClipboardReadTextPromiseImpl();

    /**
     * Clipboard: getClipboardWriteItemsPromiseImpl()
     */
    public static native void getClipboardWriteItemsPromiseImpl(JSObject theItems);

    /**
     * Returns navigator.clipboard.read() promise.
     */
    //public static native JSPromise<JSArray<JSDataTransferItem>> getClipboardReadPromise();
    // return navigator.clipboard.read();
}