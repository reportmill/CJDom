package cjdom;

/**
 * Base class for objects that wrap JavaScript objects.
 */
public class JSObject {

    // The JavaScript Blob object
    protected Object _jsObj;

    /**
     * Constructor.
     */
    public JSObject()
    {
        super();
    }

    /**
     * Constructor.
     */
    public JSObject(Object jsObj)
    {
        super();
        _jsObj = jsObj;
    }

    /**
     * Standard toString implementation.
     */
    public String toString()
    {
        return getClass().getName();
    }
}
