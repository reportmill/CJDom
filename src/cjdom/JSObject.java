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
    public Object getMember(String aName)  { return getMemberImpl(_jsObj, aName); }

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
    public String getMemberString(String aName)  { return getMemberStringImpl(_jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberString(String aName, String aValue)
    {
        setMemberStringImpl(_jsObj, aName, aValue);
    }

    /**
     * Returns a named member of a JavaScript object as int.
     */
    public int getMemberInt(String aName)  { return getMemberIntImpl(_jsObj, aName); }

    /**
     * Returns a named member of a JavaScript object as float.
     */
    public float getMemberFloat(String aName)  { return getMemberFloatImpl(_jsObj, aName); }

    /**
     * Returns a named member of a JavaScript object as double.
     */
    public double getMemberDouble(String aName)  { return getMemberDoubleImpl(_jsObj, aName); }

    /**
     * Calls a JavaScript method.
     */
    public Object call(String aName, Object theArg)
    {
        return callWithObjectImpl(_jsObj, aName, theArg);
    }

    /**
     * Calls a JavaScript method.
     */
    public Object call(String aName, String theArg)
    {
        return callWithStringImpl(_jsObj, aName, theArg);
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
    public static native String getMemberStringImpl(Object jsObj, String aName);

    /**
     * JSObject method: setMemberAsStringImpl()
     */
    public static native void setMemberStringImpl(Object jsObj, String aName, Object aValue);

    /**
     * JSObject method: getMemberIntImpl()
     */
    public static native int getMemberIntImpl(Object jsObj, String aName);

    /**
     * JSObject method: getMemberFloatImpl()
     */
    public static native float getMemberFloatImpl(Object jsObj, String aName);

    /**
     * JSObject method: getMemberDoubleImpl()
     */
    public static native double getMemberDoubleImpl(Object jsObj, String aName);

    /**
     * JSObject method: call().
     */
    public static native Object callWithObjectImpl(Object jsObj, String aName, Object theArg);

    /**
     * JSObject method: call().
     */
    public static native Object callWithStringImpl(Object jsObj, String aName, String theArg);
}
