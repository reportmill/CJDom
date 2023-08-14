package cjdom;

/**
 * This class is a wrapper for Web API CSSStyleDeclaration (https://developer.mozilla.org/en-US/docs/Web/API/CSSStyleDeclaration).
 */
public class CSSStyleDeclaration extends JSObject {

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
    public CSSStyleDeclaration(Object jsObj)
    {
        super(jsObj);
    }

    /**
     * Returns the textual representation of the declaration block.
     */
    public String getCssText()
    {
        Object cssTextJS = getCssTextImpl(_jsObj);
        return cssTextJS.toString();
    }

    /**
     * Sets the textual representation of the declaration block.
     */
    public void setCssText(String aValue)
    {
        setCssTextImpl(_jsObj, aValue);
    }

    /**
     * Returns a property value for string.
     */
    public String getPropertyValue(String aString)
    {
        return getMemberString(aString);
    }

    /**
     * Returns a property value for string.
     */
    public void setProperty(String aString, String aValue)
    {
        setMemberString(aString, aValue);
    }

    /**
     * CSSStyleDeclaration method: Returns the textual representation of the declaration block.
     */
    private static native String getCssTextImpl(Object cssJS);

    /**
     * CSSStyleDeclaration method: Sets the textual representation of the declaration block.
     */
    private static native void setCssTextImpl(Object cssJS, String aValue);
}
