package cjdom;

/**
 * This class is a wrapper for Web API CanvasRenderingContext2D (https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D).
 */
public class CanvasRenderingContext2D extends JSObject {

    /**
     * Constructor.
     */
    public CanvasRenderingContext2D(JSObject renderingContextJS)
    {
        super(renderingContextJS);
    }

    /**
     * Return the current font.
     */
    public String getFont()
    {
        return getMemberString("font");
    }

    /**
     * Sets the current font.
     */
    public void setFont(String fontName)
    {
        setMemberString("font", fontName);
    }

    /**
     * Return the TextMetrics for given string.
     */
    public TextMetrics measureText(String aString)
    {
        Object textMetricsJS = callWithStringImpl(_jsObj, "measureText", aString);
        return new TextMetrics(textMetricsJS);
    }

    //void beginPath();

    //void closePath();

    //void arc(double var1, double var3, double var5, double var7, double var9, boolean var11);

    //void arc(double var1, double var3, double var5, double var7, double var9);

    //void arcTo(double var1, double var3, double var5, double var7, double var9);

    //void bezierCurveTo(double var1, double var3, double var5, double var7, double var9, double var11);

    //void clearRect(double var1, double var3, double var5, double var7);

    //void moveTo(double var1, double var3);

    //void lineTo(double var1, double var3);

    //boolean isPointInPath(double var1, double var3);

    //boolean isPointInStroke(double var1, double var3);

    //void quadraticCurveTo(double var1, double var3, double var5, double var7);

    //void rect(double var1, double var3, double var5, double var7);

    //void scrollPathIntoView();

    //void clip();

    //ImageData createImageData(double var1, double var3);

    //CanvasGradient createLinearGradient(double var1, double var3, double var5, double var7);

    //CanvasPattern createPattern(CanvasImageSource var1, String var2);

    //CanvasGradient createRadialGradient(double var1, double var3, double var5, double var7, double var9, double var11);

    //void drawImage(CanvasImageSource var1, double var2, double var4);

    //void drawImage(CanvasImageSource var1, double var2, double var4, double var6, double var8);

    //void drawImage(CanvasImageSource var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16);

    //boolean drawCustomFocusRing(Element var1);

    //void drawSystemFocusRing(Element var1);

    //JSArrayReader<JSObject> getLineDash();

    //void setLineDash(JSArray<JSObject> var1);

    //void putImageData(ImageData var1, double var2, double var4, double var6, double var8, double var10, double var12);

    //void putImageData(ImageData var1, double var2, double var4);

    //ImageData getImageData(double var1, double var3, double var5, double var7);

    //void fill();

    //void fillRect(double var1, double var3, double var5, double var7);

    //void fillText(String var1, double var2, double var4, double var6);

    //void fillText(String var1, double var2, double var4);

    //void stroke();

    //void strokeRect(double var1, double var3, double var5, double var7);

    //void strokeText(String var1, double var2, double var4, double var6);

    //void strokeText(String var1, double var2, double var4);

    //void setTransform(double var1, double var3, double var5, double var7, double var9, double var11);

    //void transform(double var1, double var3, double var5, double var7, double var9, double var11);

    //void translate(double var1, double var3);

    //void rotate(double var1);

    //void scale(double var1, double var3);

    //void save();

    //void restore();

    ///JSObject getFillStyle();

    //void setFillStyle(String var1);

    //void setFillStyle(CanvasGradient var1);

    //void setFillStyle(CanvasPattern var1);

    //String getLineCap();

    //void setLineCap(String var1);

    //double getLineDashOffset();

    //void setLineDashOffset(double var1);

   //String getLineJoin();

    //void setLineJoin(String var1);

    //double getLineWidth();

    //void setLineWidth(double var1);

    //double getMiterLimit();

    //void setMiterLimit(double var1);

    //JSObject getStrokeStyle();

    //void setStrokeStyle(String var1);

    //void setStrokeStyle(CanvasGradient var1);

    //void setStrokeStyle(CanvasPattern var1);

    //double getGlobalAlpha();

    //void setGlobalAlpha(double var1);

    //String getGlobalCompositeOperation();

    //void setGlobalCompositeOperation(String var1);

    //double getShadowBlur();

    //void setShadowBlur(double var1);

    //String getShadowColor();

    //void setShadowColor(String var1);

    //double getShadowOffsetX();

    //void setShadowOffsetX(double var1);

    //double getShadowOffsetY();

    //void setShadowOffsetY(double var1);

    //String getTextAlign();
    //void setTextAlign(String var1);
    //String getTextBaseline();
    //void setTextBaseline(String var1);
    //HTMLCanvasElement getCanvas();
}
