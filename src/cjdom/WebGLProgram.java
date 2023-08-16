package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API WebGLProgram (https://developer.mozilla.org/en-US/docs/Web/API/WebGLProgram).
 */
public class WebGLProgram extends CJObject {

    /**
     * Constructor.
     */
    public WebGLProgram(JSObject programJS)
    {
        super(programJS);
    }
}
