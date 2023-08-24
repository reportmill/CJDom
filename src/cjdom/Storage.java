package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Storage (https://developer.mozilla.org/en-US/docs/Web/API/Storage).
 */
public class Storage extends CJObject {

    // The local storage
    private static Storage _localStorage;

    /**
     * Constructor.
     */
    public Storage(JSObject programJS)
    {
        super(programJS);
    }

    public String getItem(String aKey)  { return callForStringWithString("getItem", aKey); }

    public void setItem(String aKey, String aValue)  { callWithString2("setItem", aKey, aValue); }

    public String getKey(int anIndex)  { return callForStringWithArgs("key", anIndex); }

    public void clear()  { call("clear"); }

    /**
     * Returns the shared local storage.
     */
    public static Storage getLocalStorage()
    {
        if (_localStorage != null) return _localStorage;

        Window window = Window.current();
        JSObject localStorageJS = window.getMember("localStorage");
        Storage localStorage = new Storage(localStorageJS);
        return _localStorage = localStorage;
    }
}
