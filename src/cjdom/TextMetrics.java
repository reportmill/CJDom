package cjdom;

/**
 * This class is a wrapper for Web API TextMetrics (https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics).
 */
public class TextMetrics extends JSObject {

    /**
     * Constructor.
     */
    public TextMetrics(Object textMetricsJS)
    {
        super(textMetricsJS);
    }

    /**
     * Returns the width of a segment of inline text in CSS pixels.
     */
    public int getWidth()  { return getMemberIntImpl(_jsObj, "width"); }

    /**
     * Returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute
     * to the top of the highest bounding rectangle of all the fonts used to render the text, in CSS pixels.
     */
    public double getFontBoundingBoxAscent()
    {
        return getMemberDoubleImpl(_jsObj, "fontBoundingBoxAscent");
    }

    /**
     * Returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute
     * to the top of the bounding rectangle used to render the text, in CSS pixels.
     */
    public double getActualBoundingBoxAscent()
    {
        return getMemberDoubleImpl(_jsObj, "actualBoundingBoxAscent");
    }

    /**
     * Returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute
     * to the bottom of the bounding rectangle of all the fonts used to render the text, in CSS pixels.
     */
    public double getFontBoundingBoxDescent()
    {
        return getMemberDoubleImpl(_jsObj, "fontBoundingBoxDescent");
    }

    /**
     * Returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute
     * to the bottom of the bounding rectangle used to render the text, in CSS pixels.
     */
    public double getActualBoundingBoxDescent()
    {
        return getMemberDoubleImpl(_jsObj, "actualBoundingBoxDescent");
    }
}
