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

    /**
     * Attempts to begin playback of the media.
     */
    public void play()  { _jsObj.call("play"); }

    /**
     * Pause playback of the media
     */
    public void pause()  { _jsObj.call("pause"); }

    /**
     * Resets the media element to its initial state and begins the process of selecting a media source and loading
     * the media in preparation for playback to begin at the beginning.
     */
    public void load()  { _jsObj.call("load"); }

    /**
     * Property indicates whether the media element has ended playback.
     */
    public boolean isEnded()  { return getMemberBoolean("ended"); }
}
