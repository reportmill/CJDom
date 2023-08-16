package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API CanvasPattern (https://developer.mozilla.org/en-US/docs/Web/API/CanvasPattern).
 */
public class CanvasPattern extends CJObject {

    /**
     * Constructor.
     */
    public CanvasPattern(JSObject patternJS)
    {
        super(patternJS);
    }
}
