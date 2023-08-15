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
    //Node cloneNode(boolean var1);
    //void normalize();
    //boolean isSupported(String var1, String var2);
    //String getNamespaceURI();
    //String getPrefix();
    //void setPrefix(String var1);
    //String getLocalName();
    //boolean hasAttributes();
    //String getTextContent();
    //void setTextContent(String var1);
    //Document getOwnerDocument();
}
