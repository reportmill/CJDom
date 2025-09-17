package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API Node (https://developer.mozilla.org/en-US/docs/Web/API/Node).
 */
public class Node extends CJObject {

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
    public Node(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the node name: e.g.: div, img, canvas.
     */
    public String getNodeName()
    {
        return getNodeNameImpl(_jsObj);
    }

    /**
     * Returns the parent node.
     */
    public Node getParentNode()
    {
        JSObject parentNodeJS = getParentNodeImpl(_jsObj);
        if (parentNodeJS == null)
            return null;
        return new HTMLElement(parentNodeJS);
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
     * Node method: Return node name.
     */
    private static native String getNodeNameImpl(JSObject nodeJS);

    /**
     * Node method: Return parentNode.
     */
    private static native JSObject getParentNodeImpl(JSObject nodeJS);

    /**
     * Node method: Add given child node.
     */
    private static native void appendChildImpl(JSObject parentJS, JSObject childJS);

    /**
     * Node method: Remove given child node.
     */
    private static native void removeChildImpl(JSObject parentJS, JSObject childJS);

    public Node cloneNode(boolean deep)
    {
        JSObject jsObj = (JSObject) call("cloneNode", deep);
        String name = getNodeName();
        return HTMLElement.getElementForName(name, jsObj);
    }

    /**
     * Returns a new node for given JS node.
     */
    public static Node getNodeForNode(JSObject jsObj)
    {
        String nodeName = getNodeNameImpl(jsObj);
        return getNodeForNodeAndName(jsObj, nodeName);
    }

    /**
     * Returns a new node for given JS node and node name.
     */
    public static Node getNodeForNodeAndName(JSObject jsObj, String nodeName)
    {
        if (nodeName.equals("#text"))
            return new Text(jsObj);

        return HTMLElement.getElementForName(nodeName, jsObj);
    }

    /**
     * Returns the text content property of the node.
     */
    public String getTextContent()  { return getMemberString("textContent"); }

    /**
     * Sets the text content property of the node.
     */
    public void setTextContent(String var1)  { setMemberString("textContent", var1); }

    //String getNodeValue();
    //void setNodeValue(String var1);
    //short getNodeType();
    //NodeList<Node> getChildNodes();
    //Node getFirstChild();
    //Node getLastChild();
    //Node getPreviousSibling();
    //Node getNextSibling();
    //NamedNodeMap<Attr> getAttributes();
    //Node insertBefore(Node var1, Node var2);
    //Node replaceChild(Node var1, Node var2);
    //boolean hasChildNodes();
    //boolean hasChildNodesJS();
    //void normalize();
    //boolean isSupported(String var1, String var2);
    //String getNamespaceURI();
    //String getPrefix();
    //void setPrefix(String var1);
    //String getLocalName();
    //boolean hasAttributes();
    //Document getOwnerDocument();
}
