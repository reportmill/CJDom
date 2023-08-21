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
    public boolean getMemberBoolean(String aName)  { return getMemberBooleanImpl(_jsObj, aName); }

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
    public void callWithObject(String aName, JSObject arg1)
    {
        callWithObjectImpl(_jsObj, aName, arg1);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithObject2(String aName, JSObject arg1, JSObject arg2)
    {
        callWithObject2Impl(_jsObj, aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithString(String aName, String theArg)
    {
        callWithStringImpl(_jsObj, aName, theArg);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithString2(String aName, String arg1, String arg2)
    {
        callWithString2Impl(_jsObj, aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt(String aName, int arg1)
    {
        callWithIntImpl(_jsObj, aName, arg1);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt2(String aName, int arg1, int arg2)
    {
        callWithInt2Impl(_jsObj, aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt3(String aName, int arg1, int arg2, int arg3)
    {
        callWithInt3Impl(_jsObj, aName, arg1, arg2, arg3);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt4(String aName, int arg1, int arg2, int arg3, int arg4)
    {
        callWithInt4Impl(_jsObj, aName, arg1, arg2, arg3, arg4);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithDouble(String aName, double arg1)
    {
        callWithDoubleImpl(_jsObj, aName, arg1);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithDouble2(String aName, double arg1, double arg2)
    {
        callWithDouble2Impl(_jsObj, aName, arg1, arg2);
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
    public void callWithArgs(String aName, Object ... theArgs)
    {
        Array array = new Array(theArgs);
        callWithArgsImpl(_jsObj, aName, array._jsObj);
    }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObjectWithArgs(String aName, Object ... theArgs)
    {
        Array array = new Array(theArgs);
        return callForObjectWithArgsImpl(_jsObj, aName, array._jsObj);
    }

    /**
     * Calls a JavaScript method.
     */
    public int callForIntWithArgs(String aName, Object ... theArgs)
    {
        Array array = new Array(theArgs);
        return callForIntWithArgsImpl(_jsObj, aName, array._jsObj);
    }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObject(String aName)
    {
        return callForObjectImpl(_jsObj, aName);
    }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObjectWithObject(String aName, Object theArg)  { return callForObjectWithObjectImpl(_jsObj, aName, theArg); }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObjectWithString(String aName, String theArg)
    {
        return callForObjectWithStringImpl(_jsObj, aName, theArg);
    }

    /**
     * Calls a JavaScript method.
     */
    public JSObject callForObjectWithInt(String aName, int arg1)  { return callForObjectWithIntImpl(_jsObj, aName, arg1); }

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
    public String callForStringWithString2(String aName, String arg1, String arg2)
    {
        return callForStringWithString2Impl(_jsObj, aName, arg1, arg2);
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
     * JSObject method: getMemberBooleanImpl()
     */
    public static native boolean getMemberBooleanImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: setMemberBooleanImpl()
     */
    public static native void setMemberBooleanImpl(JSObject jsObj, String aName, boolean aValue);

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
     * JSObject method: callImpl().
     */
    public static native void callImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: callWithObjectImpl().
     */
    public static native void callWithObjectImpl(JSObject jsObj, String aName, JSObject arg1);

    /**
     * JSObject method: callWithObject2Impl().
     */
    public static native void callWithObject2Impl(JSObject jsObj, String aName, JSObject arg1, JSObject arg2);

    /**
     * JSObject method: callWithStringImpl().
     */
    public static native void callWithStringImpl(JSObject jsObj, String aName, String theArg);

    /**
     * JSObject method: callWithString2Impl().
     */
    public static native void callWithString2Impl(JSObject jsObj, String aName, String arg1, String arg2);

    /**
     * JSObject method: callWithIntImpl().
     */
    public static native void callWithIntImpl(JSObject jsObj, String aName, int arg1);

    /**
     * JSObject method: callWithInt2Impl().
     */
    public static native void callWithInt2Impl(JSObject jsObj, String aName, int arg1, int arg2);

    /**
     * JSObject method: callWithInt3Impl().
     */
    public static native void callWithInt3Impl(JSObject jsObj, String aName, int arg1, int arg2, int arg3);

    /**
     * JSObject method: callWithInt4Impl().
     */
    public static native void callWithInt4Impl(JSObject jsObj, String aName, int arg1, int arg2, int arg3, int arg4);

    /**
     * JSObject method: callWithDoubleImpl().
     */
    public static native void callWithDoubleImpl(JSObject jsObj, String aName, double arg1);

    /**
     * JSObject method: callWithDouble2Impl().
     */
    public static native void callWithDouble2Impl(JSObject jsObj, String aName, double arg1, double arg2);

    /**
     * JSObject method: callWithDouble4Impl().
     */
    public static native void callWithDouble4Impl(JSObject jsObj, String aName, double arg1, double arg2, double arg3, double arg4);

    /**
     * JSObject method: callWithDouble6Impl().
     */
    public static native void callWithDouble6Impl(JSObject jsObj, String aName, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6);

    /**
     * JSObject method: callWithArgsImpl().
     */
    public static native void callWithArgsImpl(JSObject jsObj, String aName, JSObject arrayJS);

    /**
     * JSObject method: callForObjectWithArgsImpl().
     */
    public static native JSObject callForObjectWithArgsImpl(JSObject jsObj, String aName, JSObject arrayJS);

    /**
     * JSObject method: callForIntWithArgsImpl().
     */
    public static native int callForIntWithArgsImpl(JSObject jsObj, String aName, JSObject arrayJS);

    /**
     * JSObject method: callForObjectImpl().
     */
    public static native JSObject callForObjectImpl(JSObject jsObj, String aName);

    /**
     * JSObject method: callForObjectWithObjectImpl().
     */
    public static native JSObject callForObjectWithObjectImpl(JSObject jsObj, String aName, Object theArg);

    /**
     * JSObject method: callForObjectWithStringImpl().
     */
    public static native JSObject callForObjectWithStringImpl(JSObject jsObj, String aName, String theArg);

    /**
     * JSObject method: callForObjectWithIntImpl().
     */
    public static native JSObject callForObjectWithIntImpl(JSObject jsObj, String aName, int arg1);

    /**
     * JSObject method: call().
     */
    public static native String callForStringWithStringImpl(JSObject jsObj, String aName, String theArg);

    /**
     * JSObject method: call().
     */
    public static native String callForStringWithString2Impl(JSObject jsObj, String aName, String arg1, String arg2);
}
