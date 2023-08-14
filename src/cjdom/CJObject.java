package cjdom;

/**
 * Base class for objects that wrap JavaScript objects.
 */
public class CJObject {

    // The JavaScript Blob object
    protected netscape.javascript.JSObject _jsObj;

    /**
     * Constructor.
     */
    public CJObject()
    {
        super();
    }

    /**
     * Constructor.
     */
    public CJObject(netscape.javascript.JSObject jsObj)
    {
        super();
        _jsObj = jsObj;
    }

    /**
     * Returns a named member of a JavaScript object.
     */
    public netscape.javascript.JSObject getMember(String aName)  { return getMemberImpl(_jsObj, aName); }

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
    public void call(String aName)
    {
        callImpl(_jsObj, aName);
    }

    /**
     * Calls a JavaScript method.
     */
    public Object callWithObject(String aName, Object theArg)
    {
        return callWithObjectImpl(_jsObj, aName, theArg);
    }

    /**
     * Calls a JavaScript method.
     */
    public netscape.javascript.JSObject callWithString(String aName, String theArg)
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
    public static native netscape.javascript.JSObject getMemberImpl(netscape.javascript.JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberImpl()
     */
    public static native void setMemberImpl(netscape.javascript.JSObject jsObj, String aName, Object aValue);

    /**
     * JSObject method: getMemberImpl()
     */
    public static native String getMemberStringImpl(netscape.javascript.JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberAsStringImpl()
     */
    public static native void setMemberStringImpl(netscape.javascript.JSObject jsObj, String aName, Object aValue);

    /**
     * JSObject method: getMemberIntImpl()
     */
    public static native int getMemberIntImpl(netscape.javascript.JSObject jsObj, String aName);

    /**
     * JSObject method: getMemberFloatImpl()
     */
    public static native float getMemberFloatImpl(netscape.javascript.JSObject jsObj, String aName);

    /**
     * JSObject method: getMemberDoubleImpl()
     */
    public static native double getMemberDoubleImpl(netscape.javascript.JSObject jsObj, String aName);

    /**
     * JSObject method: call().
     */
    public static native void callImpl(netscape.javascript.JSObject jsObj, String aName);

    /**
     * JSObject method: call().
     */
    public static native Object callWithObjectImpl(netscape.javascript.JSObject jsObj, String aName, Object theArg);

    /**
     * JSObject method: call().
     */
    public static native netscape.javascript.JSObject callWithStringImpl(netscape.javascript.JSObject jsObj, String aName, String theArg);
}
