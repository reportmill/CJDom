package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API MutationObserver (https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver).
 */
public class MutationObserver extends CJObject {

    // The callback
    private Callback _callback;

    // The mutation types that can be observed
    public enum Option { attributes, childList, subtree, attributeFilter, attributeOldValue, characterData, characterDataOldValue }

    /**
     * Constructor.
     */
    public MutationObserver(Callback aCallback)
    {
        super();
        _jsObj = newMutationObserverImpl(aCallback);
        _callback = aCallback;
    }

    /**
     * Returns the callback.
     */
    public Callback getCallback()  { return _callback; }

    /**
     * Configures the MutationObserver to begin receiving notifications through its callback function when DOM changes matching the given options occur.
     */
    public void observe(Node targetNode, Option... theOptions)
    {
        // Convert options to dictionary object
        JSObject optionsJS = (JSObject) WebEnv.get().newObject();
        for (Option option : theOptions)
            WebEnv.get().setMemberBoolean(optionsJS, option.name(), true);

        EventQueue.addMutationObserver(this, targetNode, optionsJS);
    }

    /**
     * Stops the MutationObserver instance from receiving further notifications until and unless observe() is called again.
     */
    public void disconnect()
    {
        System.out.println("MutationObserver.disconnect: Not implemented");
    }

    /**
     * An interface for a MutationObserver callback.
     */
    public interface Callback {

        // Called when mutation is observed
        void handleMutations(MutationRecord[] mutationRecords);
    }

    /**
     * MutationObserver: newMutationObserverImpl().
     */
    protected static native JSObject newMutationObserverImpl(Callback aCallback);
}
