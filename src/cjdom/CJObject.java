package cjdom;
import netscape.javascript.JSObject;

/**
 * Base class for objects that wrap JavaScript objects.
 */
public class CJObject {

    // The JavaScript Blob object
    protected JSObject _jsObj;

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
    public CJObject(JSObject jsObj)
    {
        super();
        _jsObj = jsObj;
    }

    /**
     * Returns the JSObject.
     */
    public Object getJS()  { return _jsObj; }

    /**
     * Returns a named member of a JavaScript object.
     */
    public JSObject getMember(String aName)  { return getMemberImpl(_jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMember(String aName, JSObject aValue)  { setMemberImpl(_jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object.
     */
    public String getMemberString(String aName)  { return getMemberStringImpl(_jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberString(String aName, String aValue)  { setMemberStringImpl(_jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object.
     */
    public boolean getMemberBoolean(String aName)  { return getMemberBooleanImpl(_jsObj, aName) > 0; }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberBoolean(String aName, boolean aValue)  { setMemberBooleanImpl(_jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object as int.
     */
    public int getMemberInt(String aName)  { return getMemberIntImpl(_jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberInt(String aName, int aValue)  { setMemberIntImpl(_jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object as float.
     */
    public float getMemberFloat(String aName)  { return getMemberFloatImpl(_jsObj, aName); }

    /**
     * Returns a named member of a JavaScript object as double.
     */
    public double getMemberDouble(String aName)  { return getMemberDoubleImpl(_jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object as double.
     */
    public void setMemberDouble(String aName, double aValue)  { setMemberDoubleImpl(_jsObj, aName, aValue); }

    /**
     * Calls a method.
     */
    public Object call(String aName, Object... args)
    {
        return _jsObj.call(aName, args);
    }

    /**
     * Standard toString implementation.
     */
    public String toString()
    {
        return getClass().getName();
    }

    /**
     * CJObject method: getMemberImpl()
     */
    public static native JSObject getMemberImpl(JSObject jsObj, String aName);

    /**
     * CJObject method: setMemberImpl()
     */
    public static native void setMemberImpl(JSObject jsObj, String aName, JSObject aValue);

    /**
     * CJObject method: getMemberImpl()
     */
    public static native String getMemberStringImpl(JSObject jsObj, String aName);

    /**
     * CJObject method: setMemberStringImpl()
     */
    public static native void setMemberStringImpl(JSObject jsObj, String aName, String aValue);

    /**
     * CJObject method: getMemberBooleanImpl(). Sometimes problem returning boolean?
     */
    public static native int getMemberBooleanImpl(JSObject jsObj, String aName);

    /**
     * CJObject method: setMemberBooleanImpl()
     */
    public static native void setMemberBooleanImpl(JSObject jsObj, String aName, boolean aValue);

    /**
     * CJObject method: getMemberIntImpl()
     */
    public static native int getMemberIntImpl(JSObject jsObj, String aName);

    /**
     * CJObject method: setMemberIntImpl()
     */
    public static native void setMemberIntImpl(JSObject jsObj, String aName, int aValue);

    /**
     * CJObject method: getMemberFloatImpl()
     */
    public static native float getMemberFloatImpl(JSObject jsObj, String aName);

    /**
     * CJObject method: setMemberFloatImpl()
     */
    public static native void setMemberFloatImpl(JSObject jsObj, String aName, float aValue);

    /**
     * CJObject method: getMemberDoubleImpl()
     */
    public static native double getMemberDoubleImpl(JSObject jsObj, String aName);

    /**
     * CJObject method: setMemberDoubleImpl()
     */
    public static native void setMemberDoubleImpl(JSObject jsObj, String aName, double aValue);

    /**
     * CJObject: newObjectImpl()
     */
    protected static native JSObject newObjectImpl();

    /**
     * CJObject method: awaitForPromise().
     */
    public static native Object awaitForPromise(JSObject aPromise);
}
