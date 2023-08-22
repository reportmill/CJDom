package cjdom;
import netscape.javascript.JSObject;
import java.util.function.Function;

/**
 * This class is a wrapper for Web API Promise (https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise).
 */
public class Promise<T> extends CJObject {

    /**
     * Constructor.
     */
    public Promise(JSObject promiseJS)
    {
        super(promiseJS);
    }

    public <V> Promise<V> then(Function<? super T, ? extends V> onFulfilled)
    {
        return EventQueue.setPromiseThen(this, onFulfilled);
    }

    public void catch_(Function<?,?> onRejected)
    {
    }
}