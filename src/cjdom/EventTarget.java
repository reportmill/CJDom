package cjdom;

/**
 * This class is a wrapper for Web API EventTarget (https://developer.mozilla.org/en-US/docs/Web/API/EventTarget).
 */
public interface EventTarget {

    /**
     * Registers an event handler of a specific event type on the EventTarget.
     */
    default void addEventListener(String aName, EventListener<?> eventLsnr)
    {
        addEventListener(aName, eventLsnr, false);
    }

    /**
     * Registers an event handler of a specific event type on the EventTarget.
     */
    default void addEventListener(String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        EventQueue.addEventListener(this, aName, eventLsnr, useCapture);
    }

    /**
     * Registers an event handler of a specific event type on the EventTarget.
     */
    default void addLoadEventListener(EventListener<?> eventLsnr)
    {
        LoadEventQueue.addLoadEventListener(this, eventLsnr);
    }

    /**
     * Removes an event handler of a specific event type from the EventTarget.
     */
    default void removeEventListener(String aName, EventListener<?> eventLsnr)
    {
        removeEventListener(aName, eventLsnr, false);
    }

    /**
     * Removes an event handler of a specific event type from the EventTarget.
     */
    default void removeEventListener(String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        EventQueue.removeEventListener(this, aName, eventLsnr, useCapture);
    }
}
