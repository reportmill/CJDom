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
     * Sets a named member of a JavaScript object as float.
     */
    public void setMemberFloat(String aName, float aValue)  { setMemberFloatImpl(_jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object as double.
     */
    public double getMemberDouble(String aName)  { return getMemberDoubleImpl(_jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object as double.
     */
    public void setMemberDouble(String aName, double aValue)  { setMemberDoubleImpl(_jsObj, aName, aValue); }

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
    public void callWithString(String aName, String theArg)  { callWithStringImpl(_jsObj, aName, theArg); }

    /**
     * Calls a JavaScript method.
     */
    public void callWithStringString(String aName, String arg1, String arg2)  { callWithStringStringImpl(_jsObj, aName, arg1, arg2); }

    /**
     * Calls a JavaScript method.
     */
    public void callWithDouble(String aName, double arg1)  { callWithDoubleImpl(_jsObj, aName, arg1); }

    /**
     * Calls a JavaScript method.
     */
    public void callWithDoubleDouble(String aName, double arg1, double arg2)
    {
        callWithDoubleDoubleImpl(_jsObj, aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithDouble4(String aName, double arg1, double arg2, double arg3, double arg4)
    {
        callWithDouble4Impl(_jsObj, aName, arg1, arg2, arg3, arg4);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithDouble6(String aName, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6)
    {
        callWithDouble6Impl(_jsObj, aName, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObjectWithObject(String aName, Object theArg)  { return callForObjectWithObjectImpl(_jsObj, aName, theArg); }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObjectWithString(String aName, String theArg)  { return callForObjectWithStringImpl(_jsObj, aName, theArg); }

    /**
     * Calls a JavaScript method.
     */
    public String callForStringWithString(String aName, String theArg)
    {
        return callForStringWithStringImpl(_jsObj, aName, theArg);
    }

    /**
     * Calls a JavaScript method.
     */
    public String callForStringWithStringString(String aName, String arg1, String arg2)
    {
        return callForStringWithStringStringImpl(_jsObj, aName, arg1, arg2);
    }

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
    public static native JSObject getMemberImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberImpl()
     */
    public static native void setMemberImpl(JSObject jsObj, String aName, JSObject aValue);

    /**
     * JSObject method: getMemberImpl()
     */
    public static native String getMemberStringImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberStringImpl()
     */
    public static native void setMemberStringImpl(JSObject jsObj, String aName, String aValue);

    /**
     * JSObject method: getMemberIntImpl()
     */
    public static native int getMemberIntImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberIntImpl()
     */
    public static native void setMemberIntImpl(JSObject jsObj, String aName, int aValue);

    /**
     * JSObject method: getMemberFloatImpl()
     */
    public static native float getMemberFloatImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberFloatImpl()
     */
    public static native void setMemberFloatImpl(JSObject jsObj, String aName, float aValue);

    /**
     * JSObject method: getMemberDoubleImpl()
     */
    public static native double getMemberDoubleImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberDoubleImpl()
     */
    public static native void setMemberDoubleImpl(JSObject jsObj, String aName, double aValue);

    /**
     * JSObject method: call().
     */
    public static native void callImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: call().
     */
    public static native void callWithStringImpl(JSObject jsObj, String aName, String theArg);

    /**
     * JSObject method: call().
     */
    public static native void callWithStringStringImpl(JSObject jsObj, String aName, String arg1, String arg2);

    /**
     * JSObject method: callWithDoubleImpl().
     */
    public static native JSObject callWithDoubleImpl(JSObject jsObj, String aName, double arg1);

    /**
     * JSObject method: callWithDoubleDoubleImpl().
     */
    public static native JSObject callWithDoubleDoubleImpl(JSObject jsObj, String aName, double arg1, double arg2);

    /**
     * JSObject method: callWithDouble4Impl().
     */
    public static native JSObject callWithDouble4Impl(JSObject jsObj, String aName, double arg1, double arg2, double arg3, double arg4);

    /**
     * JSObject method: callWithDouble6Impl().
     */
    public static native JSObject callWithDouble6Impl(JSObject jsObj, String aName, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6);

    /**
     * JSObject method: call().
     */
    public static native JSObject callForObjectWithObjectImpl(JSObject jsObj, String aName, Object theArg);

    /**
     * JSObject method: callForObjectWithStringImpl().
     */
    public static native JSObject callForObjectWithStringImpl(JSObject jsObj, String aName, String theArg);

    /**
     * JSObject method: call().
     */
    public static native String callForStringWithStringImpl(JSObject jsObj, String aName, String theArg);

    /**
     * JSObject method: call().
     */
    public static native String callForStringWithStringStringImpl(JSObject jsObj, String aName, String arg1, String arg2);
}
