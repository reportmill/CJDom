package cjdom;

/**
 *
 */
public class TextMetrics extends JSObject {

    public int getWidth()
    {
//        return 0;
        return 0;
    }

    public double getFontBoundingBoxAscent()
    {
        return getFontBoundingBoxAscentImpl(_jsObj);
    }

    public double getActualBoundingBoxAscent()
    {
        return getActualBoundingBoxAscentImpl(_jsObj);
    }

    public double getFontBoundingBoxDescent()
    {
        return getFontBoundingBoxDescentImpl(_jsObj);
    }

    public double getActualBoundingBoxDescent()
    {
        return getActualBoundingBoxDescentImpl(_jsObj);
    }

    public static native double getFontBoundingBoxAscentImpl(Object textMetricsJS);
    /*
        return textMetricsJS.fontBoundingBoxAscent || 906;
     */

    public static native double getActualBoundingBoxAscentImpl(Object textMetricsJS);
    /*
        return textMetricsJS.actualBoundingBoxAscent || 906;
     */

    public static native double getFontBoundingBoxDescentImpl(Object textMetricsJS);
    /*
        return textMetricsJS.fontBoundingBoxDescent || 212;
     */

    public static native double getActualBoundingBoxDescentImpl(Object textMetricsJS);
    /*
        return textMetricsJS.actualBoundingBoxDescent || 212;
     */
}
