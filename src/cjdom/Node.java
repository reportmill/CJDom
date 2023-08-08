package cjdom;

/**
 * This class is a wrapper for Web API Node (https://developer.mozilla.org/en-US/docs/Web/API/Node).
 */
public class Node extends JSObject {

    /**
     * Constructor.
     */
    public Node()
    {
        super();
    }

    /**
     * Constructor.
     */
    public Node(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Add given child node.
     */
    public void appendChild(Node childNode)
    {
        appendChildImpl(_jsObj, childNode._jsObj);
    }

    /**
     * Remove given child node.
     */
    public void removeChild(Node childNode)
    {
        removeChildImpl(_jsObj, childNode._jsObj);
    }

    /**
     * Node method: Add given child node.
     */
    private static native void appendChildImpl(Object parentJS, Object childJS);

    /**
     * Node method: Remove given child node.
     */
    private static native void removeChildImpl(Object parentJS, Object childJS);
}
