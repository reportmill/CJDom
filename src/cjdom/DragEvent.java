package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API DragEvent (https://developer.mozilla.org/en-US/docs/Web/API/DragEvent).
 */
public class DragEvent extends MouseEvent {

    /**
     * Constructor.
     */
    public DragEvent(JSObject eventJS)
    {
        super(eventJS);
    }

    /**
     * Returns the data that is transferred during a drag and drop interaction.
     */
    public DataTransfer getDataTransfer()
    {
        JSObject dataTransferJS = getMember("dataTransfer");
        return new DataTransfer(dataTransferJS);
    }
}