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
        super(locationJS);
    }

    /**
     * Returns the hash.
     */
    public String getHash()  { return getMemberString("hash"); }

    /**
     * Sets the hash.
     */
    public void setHash(String aValue)  { setMemberString("hash", aValue); }

    /**
     * Returns the pathname.
     */
    public String pathname()  { return getMemberString("pathname"); }

    /**
     * Returns the current location.
     */
    public static Location get()  { return Window.location(); }
}
