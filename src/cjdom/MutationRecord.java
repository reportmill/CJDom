package cjdom;
import netscape.javascript.JSObject;
import java.util.stream.Stream;

/**
 * This class is a wrapper for Web API MutationRecord (https://developer.mozilla.org/en-US/docs/Web/API/MutationRecord).
 */
public class MutationRecord extends CJObject {

    /**
     * Constructor.
     */
    public MutationRecord(JSObject aJSObject)
    {
        super(aJSObject);
    }

    /**
     * Returns a string representing the type of mutation.
     */
    public String getType()  { return getMemberString("type"); }

    /**
     * Returns the MutationObserver Option representing the type of mutation.
     */
    public MutationObserver.Option getOption()
    {
        String type = getType();
        return MutationObserver.Option.valueOf(type);
    }

    /**
     * Returns the name of the changed attribute as a string, or null.
     */
    public String getAttributeName()
    {
        return getMemberString("attributeName");
    }

    /**
     * Returns the namespace of the changed attribute as a string, or null.
     */
    public String getAttributeNamespace()
    {
        return getMemberString("attributeNamespace");
    }

    /**
     * Returns the nodes added by a mutation. Will be an empty NodeList if no nodes were added.
     */
    public Node[] getAddedNodes()
    {
        JSObject addedNodesJS = getMember("addedNodes");
        return NodeList.getNodeArrayForNodeList(addedNodesJS);
    }

    /**
     * Returns an array of nodes for given array of MutationRecords.
     */
    public static MutationRecord[] getMutationRecordArrayForArrayJS(JSObject mutationRecordArrayJS)
    {
        Array<String> mutationRecordsArray = new Array<>(mutationRecordArrayJS);
        JSObject[] mutationRecordsJS = mutationRecordsArray.toArray(JSObject.class);
        return Stream.of(mutationRecordsJS).map(mutRec -> new MutationRecord(mutRec)).toArray(size -> new MutationRecord[size]);
    }
}
