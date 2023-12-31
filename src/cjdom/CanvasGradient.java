package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API CanvasGradient (https://developer.mozilla.org/en-US/docs/Web/API/CanvasGradient).
 */
public class CanvasGradient extends CJObject {

    /**
     * Constructor.
     */
    public CanvasGradient(JSObject gradientJS)
    {
        super(gradientJS);
    }

    /**
     * Adds a color stop for given offset and color.
     */
    public void addColorStop(double offset, String color)
    {
        addColorStopImpl(_jsObj, offset, color);
    }

    /**
     * CanvasGradient: addColorStopImpl().
     */
    private static native void addColorStopImpl(JSObject gradientJS, double offset, String color);
}
