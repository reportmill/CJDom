package cjdom;
import netscape.javascript.JSObject;
import java.util.function.DoubleConsumer;

/**
 * The web environment for CheerpJ.
 */
public class CJWebEnv extends WebEnv<JSObject> {

    // The current Window
    private Window _window;

    // The current Console
    private Console _console;

    /**
     * Returns a named member of a JavaScript object.
     */
    public JSObject getMember(JSObject jsObj, String aName)  { return getMemberImpl(jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMember(JSObject jsObj, String aName, JSObject aValue)  { setMemberImpl(jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object.
     */
    public String getMemberString(JSObject jsObj, String aName)  { return getMemberStringImpl(jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberString(JSObject jsObj, String aName, String aValue)  { setMemberStringImpl(jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object.
     */
    public boolean getMemberBoolean(JSObject jsObj, String aName)  { return getMemberBooleanImpl(jsObj, aName) > 0; }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberBoolean(JSObject jsObj, String aName, boolean aValue)  { setMemberBooleanImpl(jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object as int.
     */
    public int getMemberInt(JSObject jsObj, String aName)  { return getMemberIntImpl(jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberInt(JSObject jsObj, String aName, int aValue)  { setMemberIntImpl(jsObj, aName, aValue); }

    /**
     * Returns a named member of a JavaScript object as double.
     */
    public double getMemberDouble(JSObject jsObj, String aName)  { return getMemberDoubleImpl(jsObj, aName); }

    /**
     * Sets a named member of a JavaScript object as double.
     */
    public void setMemberDouble(JSObject jsObj, String aName, double aValue)  { setMemberDoubleImpl(jsObj, aName, aValue); }

    /**
     * Calls a method.
     */
    public Object call(JSObject jsObj, String aName, Object... args)  { return jsObj.call(aName, args); }

    /**
     * Returns an indexed member of a JavaScript object.
     */
    @Override
    public Object getSlot(JSObject jsObj, int anIndex)  { return getSlotImpl(jsObj, anIndex); }

    /**
     * Sets an indexed member of a JavaScript object.
     */
    @Override
    public void setSlot(JSObject jsObj, int anIndex, Object aValue)  { setSlotImpl(jsObj, anIndex, aValue); }

    /**
     * Evaluates given JavaScript string and returns result.
     */
    public Object eval(JSObject jsObj, String javaScript)  { return jsObj.eval(javaScript); }

    /**
     * Returns the current window.
     */
    public Window window()
    {
        if (_window != null) return _window;
        JSObject winJS = windowImpl();
        return _window = new Window(winJS);
    }

    /**
     * Returns the current console.
     */
    public Console console()
    {
        if (_console != null) return _console;
        JSObject consoleJS = consoleImpl();
        return _console = new Console(consoleJS);
    }

    /**
     * Returns a new JavaScript native object.
     */
    public Object newObject()  { return newObjectImpl(); }

    /**
     * Does await promise for given promise.
     */
    public Object awaitForPromise(JSObject aPromise)  { return awaitForPromiseImpl(aPromise); }

    /**
     * Request animation frame.
     */
    public int requestAnimationFrame(DoubleConsumer callback)
    {
        return EventQueue.requestAnimationFrame(callback);
    }

    /**
     * Schedules a runnable to execute after a delay of given milliseconds.
     */
    public void setTimeout(Runnable aRun, int aDelay)
    {
        EventQueue.setTimeout(aRun, aDelay);
    }

    /**
     * Schedules a runnable to execute every time a given number of milliseconds elapses.
     */
    public int setInterval(Runnable aRun, int aPeriod)
    {
        //java.util.TimerTask timerTask = new TimerTask() { public void run()  { moveBalls(); } };
        //new java.util.Timer().schedule(timerTask, 0, 25);
        return EventQueue.setInterval(aRun, aPeriod);
    }

    /**
     * Override to handle Safari special.
     */
    @Override
    public void click(JSObject jsObj)
    {
        if (Navigator.isSafari())
            setNeedsClickElement(jsObj);
        else super.click(jsObj);
    }

    /**
     * Returns an array of given length.
     */
    @Override
    public JSObject newArrayJSForLength(int aLength)  { return newArrayJSForLengthImpl(aLength); }

    /**
     * Returns an array of bytes for given array buffer.
     */
    @Override
    public byte[] getBytesArrayForArrayBufferJS(JSObject arrayBufferJS)
    {
        return getBytesArrayForArrayBufferJSImpl(arrayBufferJS);
    }

    /**
     * Returns an array of bytes for this array.
     */
    @Override
    public byte[] getBytesArrayForTypedArrayJS(JSObject typedArrayJS)
    {
        return getBytesArrayForTypedArrayJSImpl(typedArrayJS);
    }

    /**
     * Returns an array of shorts for this array.
     */
    @Override
    public short[] getShortsArrayForTypedArrayJS(JSObject typedArrayJS)
    {
        return getShortsArrayForTypedArrayJSImpl(typedArrayJS);
    }

    /**
     * Returns an array of shorts for this array.
     */
    @Override
    public short[] getShortsArrayForChannelIndexAndCount(JSObject typedArrayJS, int channelIndex, int channelCount)
    {
        return getShortsArrayForTypedArrayJSAndChannelIndexAndCountImpl(typedArrayJS, channelIndex, channelCount);
    }

    /**
     * Returns a typed array of given class for given input.
     */
    @Override
    public JSObject getTypedArrayJSForClassAndObject(Class<?> aClass, Object arrayObject)
    {
        if (aClass == Int8Array.class)
            return getInt8ArrayForObject(arrayObject);
        if (aClass == Float32Array.class)
            return getFloat32ArrayForObject(arrayObject);
        if (aClass == Uint16Array.class)
            return getUint16ArrayForObject(arrayObject);
        if (aClass == Uint8ClampedArray.class)
            return getUint8ClampedArrayForObject(arrayObject);
        throw new RuntimeException("CJWebEnv: No support for class " + aClass.getName());
    }

    /**
     * CJWebEnv method: getMemberImpl()
     */
    private static native JSObject getMemberImpl(JSObject jsObj, String aName);

    /**
     * CJWebEnv method: setMemberImpl()
     */
    private static native void setMemberImpl(JSObject jsObj, String aName, JSObject aValue);

    /**
     * CJWebEnv method: getMemberImpl()
     */
    private static native String getMemberStringImpl(JSObject jsObj, String aName);

    /**
     * CJWebEnv method: setMemberStringImpl()
     */
    private static native void setMemberStringImpl(JSObject jsObj, String aName, String aValue);

    /**
     * CJWebEnv method: getMemberBooleanImpl(). Sometimes problem returning boolean?
     */
    private static native int getMemberBooleanImpl(JSObject jsObj, String aName);

    /**
     * CJWebEnv method: setMemberBooleanImpl()
     */
    private static native void setMemberBooleanImpl(JSObject jsObj, String aName, boolean aValue);

    /**
     * CJWebEnv method: getMemberIntImpl()
     */
    private static native int getMemberIntImpl(JSObject jsObj, String aName);

    /**
     * CJWebEnv method: setMemberIntImpl()
     */
    private static native void setMemberIntImpl(JSObject jsObj, String aName, int aValue);

    /**
     * CJWebEnv method: getMemberDoubleImpl()
     */
    private static native double getMemberDoubleImpl(JSObject jsObj, String aName);

    /**
     * CJWebEnv method: setMemberDoubleImpl()
     */
    private static native void setMemberDoubleImpl(JSObject jsObj, String aName, double aValue);

    /**
     * CJWebEnv: getSlotImpl().
     */
    private static native Object getSlotImpl(JSObject jsObj, int index);

    /**
     * CJWebEnv: setSlotImpl().
     */
    private static native void setSlotImpl(JSObject jsObj, int index, Object aValue);

    /**
     * Returns the current window.
     */
    private static native JSObject windowImpl();

    /**
     * Returns the current console.
     */
    private static native JSObject consoleImpl();

    /**
     * CJWebEnv: newObjectImpl()
     */
    private static native JSObject newObjectImpl();

    /**
     * CJWebEnv method: awaitForPromiseImpl().
     */
    private static native Object awaitForPromiseImpl(JSObject aPromise);

    /**
     * CJWebEnv method: setNeedsClickElement(): Called to set an element that needs a click.
     */
    private static native void setNeedsClickElement(JSObject needsClickElement);

    /**
     * CJWebEnv: getBytesArrayForArrayBufferJSImpl()
     */
    private static native byte[] getBytesArrayForArrayBufferJSImpl(JSObject typedArrayJS);

    /**
     * CJWebEnv: getBytesArrayForTypedArrayJSImpl()
     */
    private static native byte[] getBytesArrayForTypedArrayJSImpl(JSObject typedArrayJS);

    /**
     * CJWebEnv: getShortsArrayForTypedArrayJSImpl()
     */
    private static native short[] getShortsArrayForTypedArrayJSImpl(JSObject typedArrayJS);

    /**
     * CJWebEnv: getShortsArrayForTypedArrayJSAndChannelIndexAndCountImpl()
     */
    private static native short[] getShortsArrayForTypedArrayJSAndChannelIndexAndCountImpl(JSObject typedArrayJS, int channelIndex, int channelCount);

    /**
     * CJWebEnv: newArrayForLengthImpl().
     */
    private static native JSObject newArrayJSForLengthImpl(int aLength);

    /**
     * CJWebEnv: getInt8ArrayForObject().
     */
    private static native JSObject getInt8ArrayForObject(Object arrayObject);

    /**
     * CJWebEnv: getFloat32ArrayForObject().
     */
    private static native JSObject getFloat32ArrayForObject(Object arrayObject);

    /**
     * CJWebEnv: getUint16ArrayForObject().
     */
    private static native JSObject getUint16ArrayForObject(Object arrayObject);

    /**
     * CJWebEnv: getUint8ClampedArrayForObject().
     */
    private static native JSObject getUint8ClampedArrayForObject(Object arrayObject);
}
