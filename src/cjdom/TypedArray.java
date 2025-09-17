package cjdom;

/**
 * This class is a wrapper for Web API ArrayBufferView (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBufferView).
 */
public abstract class TypedArray extends JSProxy {

    /**
     * Constructor.
     */
    public TypedArray(Object objJS)
    {
        super(objJS);
    }

    public int getLength()  { return getMemberInt("length"); }
}
