package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API NodeList (https://developer.mozilla.org/en-US/docs/Web/API/NodeList).
 */
public class NodeList extends CJObject {

    /**
     * Constructor.
     */
    public NodeList(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * The length of the array.
     */
    public int getLength()  { return getMemberInt("length"); }

    /**
     * Returns the array of nodes.
     */
    public Node[] getItems()
    {
        return getNodeArrayForNodeList(_jsObj);
    }

    /**
     * Returns an array of nodes for given NodeList.
     */
    public static Node[] getNodeArrayForNodeList(JSObject nodeList)
    {
        int length = WebEnv.get().getMemberInt(nodeList, "length");

        // Convert to Node array
        Node[] nodeArray = new Node[length];
        for (int i = 0; i < length; i++) {
            JSObject nodeJS = (JSObject) nodeList.call("item", i);
            nodeArray[i] = Node.getNodeForNode(nodeJS);
        }

        // Return
        return nodeArray;
    }
}
