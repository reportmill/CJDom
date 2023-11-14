package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API DataTransfer (https://developer.mozilla.org/en-US/docs/Web/API/DataTransfer).
 */
public class DataTransfer extends CJObject {

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
        JSObject typesJS = getMember("types");
        Array<String> typesArray = new Array<>(typesJS);
        int length = typesArray.getLength();
        String[] types = new String[length];
        for (int i = 0; i < length; i++)
            types[i] = typesArray.getString(i);
        return types;
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
        JSObject fileListJS = getMember("files");
        int length = getMemberIntImpl(fileListJS, "length");
        File[] files = new File[length];
        for (int i = 0; i < length; i++) {
            JSObject fileJS = (JSObject) fileListJS.call("item", i);
            files[i] = new File(fileJS);
        }
        return files;
    }

    /**
     * Sets the image element to use for the drag feedback image.
     */
    public void setDragImage(HTMLElement aImg, double xOffset, double yOffset)
    {
        _jsObj.call("setDragImage", aImg, xOffset, yOffset);
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
     * Returns a DataTransfer for String.
     */
    public static DataTransfer getDataTrasferForString(String aStr)
    {
        //return new DataTransferString(aStr);
        DataTransfer dataTransfer = new DataTransfer();
        dataTransfer.setData("text/plain", aStr);
        return dataTransfer;
    }

    /**
     * DataTransfer: newDataTransfer().
     */
    private static native JSObject newDataTransfer();
}
