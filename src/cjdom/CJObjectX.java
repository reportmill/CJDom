package cjdom;
import netscape.javascript.JSObject;

/**
 * Base class for objects that wrap JavaScript objects.
 */
public class CJObjectX extends CJObject {

    /**
     * Constructor.
     */
    public CJObjectX(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithObjectString(String aName, CJObject arg1, String arg2)
    {
        //callWithObjectStringImpl(_jsObj, aName, arg1._jsObj, arg2);
        callWithArgs(aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt(String aName, int arg1)
    {
        //callWithIntImpl(_jsObj, aName, arg1);
        callWithArgs(aName, arg1);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt2(String aName, int arg1, int arg2)
    {
        //callWithInt2Impl(_jsObj, aName, arg1, arg2);
        callWithArgs(aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt3(String aName, int arg1, int arg2, int arg3)
    {
        //callWithInt3Impl(_jsObj, aName, arg1, arg2, arg3);
        callWithArgs(aName, arg1, arg2, arg3);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt4(String aName, int arg1, int arg2, int arg3, int arg4)
    {
        //callWithInt4Impl(_jsObj, aName, arg1, arg2, arg3, arg4);
        callWithArgs(aName, arg1, arg2, arg3, arg4);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithIntObject(String aName, int arg1, CJObject arg2)
    {
        //callWithIntObjectImpl(_jsObj, aName, arg1, arg2._jsObj);
        callWithArgs(aName, arg1, arg2);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithIntObjectInt(String aName, int arg1, CJObject arg2, int arg3)
    {
        //callWithIntObjectIntImpl(_jsObj, aName, arg1, arg2._jsObj, arg3);
        callWithArgs(aName, arg1, arg2, arg3);
    }

    /**
     * JSObject method: callWithObjectStringImpl().
     */
    public static native JSObject callWithObjectStringImpl(JSObject jsObj, String aName, JSObject arg1, String arg2);

    /**
     * JSObject method: callWithIntImpl().
     */
    public static native JSObject callWithIntImpl(JSObject jsObj, String aName, int arg1);

    /**
     * JSObject method: callWithInt2Impl().
     */
    public static native JSObject callWithInt2Impl(JSObject jsObj, String aName, int arg1, int arg2);

    /**
     * JSObject method: callWithInt2Impl().
     */
    public static native JSObject callWithInt3Impl(JSObject jsObj, String aName, int arg1, int arg2, int arg3);

    /**
     * JSObject method: callWithDouble4Impl().
     */
    public static native JSObject callWithInt4Impl(JSObject jsObj, String aName, int arg1, int arg2, int arg3, int arg4);

    /**
     * JSObject method: callWithIntObjectImpl().
     */
    public static native JSObject callWithIntObjectImpl(JSObject jsObj, String aName, int arg1, JSObject arg2);

    /**
     * JSObject method: callWithIntObjectIntImpl().
     */
    public static native JSObject callWithIntObjectIntImpl(JSObject jsObj, String aName, int arg1, JSObject arg2, int arg3);
}
