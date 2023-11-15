package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Array (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
 */
public class Array<E> extends CJObject {

    /**
     * Constructor.
     */
    public Array(JSObject arrayJS)
    {
        super();
        _jsObj = arrayJS;
    }

    /**
     * Constructor.
     */
    public Array(int length)
    {
        super();
        _jsObj = newArrayForLengthImpl(length);
    }

    /**
     * Constructor.
     */
    public Array(Object[] theObjects)
    {
        super();
        _jsObj = newArrayForLengthImpl(theObjects.length);
        for (int i = 0; i < theObjects.length; i++)
            set(i, theObjects[i]);
    }

    /**
     * The length of the array.
     */
    public int getLength()  { return getMemberInt("length"); }

    /**
     * Returns value at given index.
     */
    public E get(int index)
    {
        return (E) getImpl(_jsObj, index);
    }

    /**
     * Sets the given value at given index.
     */
    public void set(int index, Object aValue)
    {
        Object value = aValue;
        if (aValue instanceof CJObject)
            value = ((CJObject) aValue)._jsObj;

        setImpl(_jsObj, index, value);
    }

    /**
     * Returns array of objects as given class.
     */
    public <T> T[] toArray(T[] anArray)
    {
        int length = getLength();
        for (int i = 0; i < length; i++)
            anArray[i] = (T) get(i);
        return anArray;
    }

    /**
     * Returns array of objects as given class.
     */
    public <T> T[] toArray(Class<T> aClass)
    {
        int length = getLength();
        T[] array = (T[]) java.lang.reflect.Array.newInstance(aClass, length);
        return toArray(array);
    }

    /**
     * Array: getImpl().
     */
    private static native Object getImpl(JSObject jsObj, int index);

    /**
     * Array: setImpl().
     */
    private static native void setImpl(JSObject jsObj, int index, Object aValue);

    /**
     * Array: newArrayForLengthImpl().
     */
    protected static native JSObject newArrayForLengthImpl(int aLen);
}
