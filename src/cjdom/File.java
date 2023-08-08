package cjdom;

/**
 * Wrapper class for WebAPI File.
 */
public class File extends Blob {

    /**
     * Constructor.
     */
    protected File(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the current window.
     */
    public static File current()
    {
        Object winJS = currentImpl();
        return new File(winJS);
    }

    /**
     * Returns the current window.
     */
    protected static native Object currentImpl();
}
