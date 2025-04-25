package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Location (https://developer.mozilla.org/en-US/docs/Web/API/Location).
 */
public class Location extends CJObject {

    /**
     * Constructor.
     */
    protected Location(JSObject locationJS)
    {
        super();
        _jsObj = locationJS;
    }

    /**
     * Returns the pathname.
     */
    public String pathname()
    {
        return getMemberString("pathname");
    }

    /**
     * Returns the current location.
     */
    public static Location get()  { return Window.location(); }
}
