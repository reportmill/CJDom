package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API ArrayBufferView (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBufferView).
 */
public abstract class TypedArray extends CJObject {

    /**
     * Constructor.
     */
    public TypedArray(JSObject objJS)
    {
        super(objJS);
    }

    public int getLength()  { return getMemberInt("length"); }
}
