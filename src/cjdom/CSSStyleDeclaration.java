package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API CSSStyleDeclaration (https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration).
 */
public class CSSStyleDeclaration extends CJObject {

    /**
     * Constructor.
     */
    public CSSStyleDeclaration()
    {
        super();
    }

    /**
     * Constructor.
     */
    public CSSStyleDeclaration(JSObject jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the textual representation of the declaration block.
     */
    public String getCssText()  { return getMemberString("cssText"); }

    /**
     * Sets the textual representation of the declaration block.
     */
    public void setCssText(String aValue)  { setMemberString("cssText", aValue); }

    /**
     * Returns a property value for string.
     */
    public String getPropertyValue(String aString)  { return callForStringWithString("setProperty", aString); }

    /**
     * Returns a property value for string.
     */
    public void setProperty(String aString, String aValue)
    {
        callForStringWithStringString("setProperty", aString, aValue);
    }
}
