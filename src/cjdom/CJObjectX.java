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
    public void callWithInt4(String aName, int arg1, int arg2, int arg3, int arg4)
    {
        callWithInt4Impl(_jsObj, aName, arg1, arg2, arg3, arg4);
    }

    /**
     * Calls a JavaScript method.
     */
    public void callWithInt6(String aName, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
    {
        callWithInt6Impl(_jsObj, aName, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * JSObject method: callWithIntImpl().
     */
    public static native JSObject callWithIntImpl(JSObject jsObj, String aName, int arg1);

    /**
     * JSObject method: callWithInt2Impl().
     */
    public static native JSObject callWithInt2Impl(JSObject jsObj, String aName, int arg1, int arg2);

    /**
     * JSObject method: callWithDouble4Impl().
     */
    public static native JSObject callWithInt4Impl(JSObject jsObj, String aName, int arg1, int arg2, int arg3, int arg4);

    /**
     * JSObject method: callWithInt6Impl().
     */
    public static native JSObject callWithInt6Impl(JSObject jsObj, String aName, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
