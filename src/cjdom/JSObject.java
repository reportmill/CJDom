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
     * Returns a named member of a JavaScript object.
     */
    public Object getMember(String aName)
    {
        return getMemberImpl(_jsObj, aName);
    }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMember(String aName, Object aValue)
    {
        setMemberImpl(_jsObj, aName, aValue);
    }

    /**
     * Returns a named member of a JavaScript object.
     */
    public String getMemberAsString(String aName)
    {
        return getMemberAsStringImpl(_jsObj, aName);
    }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberAsString(String aName, String aValue)
    {
        setMemberAsStringImpl(_jsObj, aName, aValue);
    }

    /**
     * Calls a JavaScript method.
     */
    public Object call(String aName, Object theArg)
    {
        return callImpl(_jsObj, aName, theArg);
    }

    /**
     * Returns the JSObject.
     */
    public Object getJS()  { return _jsObj; }

    /**
     * Standard toString implementation.
     */
    public String toString()
    {
        return getClass().getName();
    }

    /**
     * JSObject method: getMemberImpl()
     */
    public static native Object getMemberImpl(Object jsObj, String aName);

    /**
     * JSObject method: setMemberImpl()
     */
    public static native void setMemberImpl(Object jsObj, String aName, Object aValue);

    /**
     * JSObject method: getMemberImpl()
     */
    public static native String getMemberAsStringImpl(Object jsObj, String aName);

    /**
     * JSObject method: setMemberAsStringImpl()
     */
    public static native void setMemberAsStringImpl(Object jsObj, String aName, Object aValue);

    /**
     * JSObject method: call().
     */
    public static native Object callImpl(Object jsObj, String aName, Object theArg);
}
