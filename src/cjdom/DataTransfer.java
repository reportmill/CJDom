package cjdom;
import netscape.javascript.JSObject;
import java.util.stream.Stream;

/**
 * This class is a wrapper for Web API DataTransfer (https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer).
 */
public class DataTransfer extends CJObject {

    // The types
    private String[] _types;

    // The files
    private File[] _files;

    // Whether this DataTransfer was cached
    private boolean _cached;

    /**
     * Constructor.
     */
    public DataTransfer(JSObject objectJS)
    {
        super(objectJS);
    }

    /**
     * Constructor.
     */
    public DataTransfer()
    {
        super(null);
        _jsObj = newDataTransfer();
    }

    /**
     * Returns the types.
     */
    public String[] getTypes()
    {
        if (_types != null) return _types;
        return _types = getTypesImpl();
    }

    /**
     * Returns the types.
     */
    private String[] getTypesImpl()
    {
        // If cached drag/drop data transfer, get cached types
        if (_cached) {
            String[] types = getDropDataTransferTypesImpl();
            return types;
        }

        // Get DataTransfer.types
        JSObject typesArrayJS = getMember("types");
        Array<String> typesArray = new Array<>(typesArrayJS);
        return typesArray.toArray(String.class);
    }

    /**
     * Returns the data for a given type.
     */
    public String getData(String aType)
    {
        return (String) _jsObj.call("getData", aType);
    }

    /**
     * Set the data for a given type.
     */
    public void setData(String aType, String theData)
    {
        _jsObj.call("setData", aType, theData);
    }

    /**
     * Returns the number of files.
     */
    public int getFileCount()  { return getFiles().length; }

    /**
     * Returns the files.
     */
    public File[] getFiles()
    {
        if (_files != null) return _files;
        return _files = getFilesImpl();
    }

    /**
     * Returns the files.
     */
    private File[] getFilesImpl()
    {
        // If cached drag/drop data transfer, get cached files
        if (_cached) {
            JSObject dropFilesArrayJS = getDropDataTransferFilesImpl();
            Array<JSObject> dropFilesArray = new Array<>(dropFilesArrayJS);
            JSObject[] dropFilesJS = dropFilesArray.toArray(JSObject.class);
            return Stream.of(dropFilesJS).map(dropFileJS -> new File(dropFileJS)).toArray(size -> new File[size]);
        }

        // Get DataTransfer.files
        JSObject fileListJS = getMember("files");
        int length = getMemberIntImpl(fileListJS, "length");
        File[] files = new File[length];

        // Iterate over file list and get files
        for (int i = 0; i < length; i++) {
            JSObject fileJS = (JSObject) fileListJS.call("item", i);
            files[i] = new File(fileJS);
        }

        // Return
        return files;
    }

    /**
     * Starts a drag for this data transfer and given element.
     */
    public void startDrag(HTMLElement image, double dx, double dy)
    {
        startDragImpl(_jsObj, image._jsObj, dx, dy);
    }

    /**
     * Returns whether DataTransfer has given type.
     */
    public boolean hasType(String aType)
    {
        String[] types = getTypes();
        for (String type : types)
            if (type.equals(aType))
                return true;
        return false;
    }

    /**
     * Returns the DataTransfer from last drop.
     */
    public static DataTransfer getDropDataTransfer()
    {
        // Get cached data transfer
        JSObject dropDataTransferJS = getDropDataTransferImpl();
        if (dropDataTransferJS == null)
            return null;

        // Wrap in DataTransfer, set cached and return
        DataTransfer dataTransfer = new DataTransfer(dropDataTransferJS);
        dataTransfer._cached = true;
        return dataTransfer;
    }

    /**
     * DataTransfer: newDataTransfer().
     */
    private static native JSObject newDataTransfer();

    /**
     * DataTransfer: getDropDataTransfer().
     */
    public static native JSObject getDropDataTransferImpl();

    /**
     * DataTransfer: getDropDataTransferTypesImpl().
     */
    public static native String[] getDropDataTransferTypesImpl();

    /**
     * DataTransfer: getDropDataTransferFilesImpl().
     */
    public static native JSObject getDropDataTransferFilesImpl();

    /**
     * DataTransfer: startDragImpl().
     */
    private static native void startDragImpl(JSObject dataTransfer, JSObject image, double dx, double dy);
}
