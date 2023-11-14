package cjdom;

/**
 * This class is a wrapper for Web API HTMLMediaElement (https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement).
 */
public class HTMLMediaElement extends HTMLElement {

    /**
     * Constructor.
     */
    public HTMLMediaElement(netscape.javascript.JSObject jsObj)
    {
        super(jsObj);
    }

    public void play()  { _jsObj.call("play");}

    public void pause()  { _jsObj.call("pause"); }

    public void load()  { _jsObj.call("load"); }

    public boolean isEnded()  { return getMemberBoolean("ended"); }
}
