package cjdom;
import netscape.javascript.JSObject;
import java.util.stream.Stream;

/**
 * This class is a wrapper for Web API DOMTokenList (https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList).
 */
public class DOMTokenList extends CJObject {

    /**
     * Constructor.
     */
    public DOMTokenList(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Return canvas X.
     */
    public int length()  { return getMemberInt("length"); }

    public String item(int index)  { return (String) _jsObj.call("item", index); }

    public boolean contains(String token)  { return (Boolean) _jsObj.call("contains", token); }

    public void add(String token)  { _jsObj.call("add", token); }

    public void add(String token1, String token2) { _jsObj.call("add", token1, token2); }

    public void add(String ... tokens)  { Stream.of(tokens).forEach(this::add); }

    public void remove(String token)  { _jsObj.call("remove", token); }

    public void remove(String token1, String token2)  { _jsObj.call("remove", token1, token2); }

    public void remove(String... tokens)  { Stream.of(tokens).forEach(this::remove); }

    public boolean toggle(String token)  { return (Boolean) _jsObj.call("toggle", token); }
}
