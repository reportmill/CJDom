package cjdom;
import netscape.javascript.JSObject;

/**
 * This class is a wrapper for Web API CanvasRenderingContext2D (https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D).
 */
public class CanvasRenderingContext2D extends CJObject {

    /**
     * Constructor.
     */
    public CanvasRenderingContext2D(JSObject renderingContextJS)
    {
        super(renderingContextJS);
    }

    /**
     * CanvasRenderingContext2D: setTransform().
     */
    public void setTransform(double var1, double var3, double var5, double var7, double var9, double var11)
    {
        setTransformImpl(_jsObj, var1, var3, var5, var7, var9, var11);
    }

    /**
     * CanvasRenderingContext2D: transform().
     */
    public void transform(double var1, double var3, double var5, double var7, double var9, double var11)
    {
        transformImpl(_jsObj, var1, var3, var5, var7, var9, var11);
    }

    /**
     * CanvasRenderingContext2D: translate().
     */
    public void translate(double var1, double var3)  { callWithDoubleDouble("translate", var1, var3); }

    /**
     * CanvasRenderingContext2D: rotate().
     */
    public void rotate(double var1)  { callWithDouble("rotate", var1); }

    /**
     * CanvasRenderingContext2D: rotate().
     */
    public void scale(double var1, double var3)  { callWithDoubleDouble("scale", var1, var3); }

    /**
     * CanvasRenderingContext2D: save().
     */
    public void save()  { call("save"); }

    /**
     * CanvasRenderingContext2D: restore().
     */
    public void restore()  { call("restore"); }

    /**
     * CanvasRenderingContext2D: restore().
     */
    public void fill()  { call("fill"); }

    /**
     * CanvasRenderingContext2D: restore().
     */
    public void stroke()  { call("stroke"); }

    /**
     * CanvasRenderingContext2D: restore().
     */
    public void clip()  { call("clip"); }

    /**
     * CanvasRenderingContext2D: getFillStyle().
     */
    public Object getFillStyle()  { return null; }

    /**
     * CanvasRenderingContext2D: setFillStyle().
     */
    public void setFillStyle(String var1)  { callWithString("setFillStyle", var1); }

    /**
     * CanvasRenderingContext2D: setFillStyle().
     */
    //public void setFillStyle(CanvasGradient var1);
    //public void setFillStyle(CanvasPattern var1);

    /**
     * CanvasRenderingContext2D: getStrokeStyle().
     */
    public Object getStrokeStyle()  { return null; }

    /**
     * CanvasRenderingContext2D: setStrokeStyle().
     */
    public void setStrokeStyle(String var1)  { callWithString("setStrokeStyle", var1); }

    /**
     * CanvasRenderingContext2D: setStrokeStyle().
     */
    //public void setStrokeStyle(CanvasGradient var1);
    //public void setStrokeStyle(CanvasPattern var1);

    /**
     * CanvasRenderingContext2D: getGlobalAlpha().
     */
    public double getGlobalAlpha()  { return getMemberDouble("globalAlpha"); }

    /**
     * CanvasRenderingContext2D: setGlobalAlpha().
     */
    public void setGlobalAlpha(double var1)  { setMemberDouble("globalAlpha", var1); }

    /**
     * CanvasRenderingContext2D: getGlobalCompositeOperation().
     */
    public String getGlobalCompositeOperation()  { return getMemberString("globalCompositeOperation"); }

    /**
     * CanvasRenderingContext2D: getGlobalCompositeOperation().
     */
    public void setGlobalCompositeOperation(String var1)  { setMemberString("globalCompositeOperation", var1); }

    /**
     * CanvasRenderingContext2D: getLineCap().
     */
    public String getLineCap()  { return getMemberString("lineCap"); }

    /**
     * CanvasRenderingContext2D: getLineCap().
     */
    public void setLineCap(String var1)  { setMemberString("lineCap", var1); }

    /**
     * CanvasRenderingContext2D: getLineDashOffset().
     */
    public double getLineDashOffset()  { return getMemberDouble("lineDashOffset"); }

    /**
     * CanvasRenderingContext2D: setLineDashOffset().
     */
    public void setLineDashOffset(double var1)  { setMemberDouble("lineDashOffset", var1); }

    /**
     * CanvasRenderingContext2D: getLineJoin().
     */
    public String getLineJoin()  { return getMemberString("lineJoin"); }

    /**
     * CanvasRenderingContext2D: setLineJoin().
     */
    public void setLineJoin(String var1)  { setMemberString("lineJoin", var1); }

    /**
     * CanvasRenderingContext2D: getLineJoin().
     */
    public double getLineWidth()  { return getMemberDouble("lineWidth"); }

    /**
     * CanvasRenderingContext2D: getLineJoin().
     */
    public void setLineWidth(double var1)  { setMemberDouble("lineWidth", var1); }

    /**
     * CanvasRenderingContext2D: getLineJoin().
     */
    public double getMiterLimit()  { return getMemberDouble("miterLimit"); }

    /**
     * CanvasRenderingContext2D: getLineJoin().
     */
    public void setMiterLimit(double var1)  { setMemberDouble("miterLimit", var1); }

    /**
     * Return the current font.
     */
    public String getFont()  { return getMemberString("font"); }

    /**
     * Sets the current font.
     */
    public void setFont(String fontName)  { setMemberString("font", fontName); }

    /**
     * Return the TextMetrics for given string.
     */
    public TextMetrics measureText(String aString)
    {
        JSObject textMetricsJS = callWithStringImpl(_jsObj, "measureText", aString);
        return new TextMetrics(textMetricsJS);
    }

    /**
     * getImageData().
     */
    public ImageData getImageData(int x, int y, int w, int h)
    {
        JSObject imageDataJS = getImageDataImpl(_jsObj, x, y, w, h);
        return new ImageData(imageDataJS);
    }

    /**
     * Put image data.
     */
    public void putImageData(ImageData imageData, double var2, double var4, double var6, double var8, double var10, double var12)
    {
        putImageDataImpl(_jsObj, imageData._jsObj, var2, var4, var6, var8, var10, var12);
    }

    /**
     * Returns the amount of blur applied to shadows.
     */
    public double getShadowBlur()  { return getMemberDouble("shadowBlur"); }

    /**
     * Returns the amount of blur applied to shadows.
     */
    public void setShadowBlur(double value)  { setMemberDouble("shadowBlur", value); }

    /**
     * Returns the color of shadows.
     */
    public String getShadowColor()  { return getMemberString("shadowColor"); }

    /**
     * Returns the color of shadows.
     */
    public void setShadowColor(String colorStr)  { setMemberString("shadowColor", colorStr); }

    /**
     * Returns the distance that shadows will be offset horizontally
     */
    public double getShadowOffsetX()  { return getMemberDouble("shadowOffsetX"); }

    /**
     * Returns the distance that shadows will be offset horizontally
     */
    public void setShadowOffsetX(double value)  { setMemberDouble("shadowOffsetX", value); }

    /**
     * Returns the distance that shadows will be offset vertically.
     */
    public double getShadowOffsetY()  { return getMemberDouble("shadowOffsetY"); }

    /**
     * Returns the distance that shadows will be offset vertically
     */
    public void setShadowOffsetY(double value)  { setMemberDouble("shadowOffsetY", value); }

    /**
     * CanvasRenderingContext2D: getImageSmoothingQuality().
     */
    public String getImageSmoothingQuality()  { return getMemberString("imageSmoothingQuality"); }

    /**
     * CanvasRenderingContext2D: setImageSmoothingQuality().
     */
    public void setImageSmoothingQuality(String var1)  { setMemberString("imageSmoothingQuality", var1); }

    /**
     * CanvasRenderingContext2D: isImageSmoothingEnabled().
     */
    public boolean isImageSmoothingEnabled(String var1)  { return true; } // getMemberBoolean("imageSmoothingEnabled");

    /**
     * CanvasRenderingContext2D: setImageSmoothingEnabled().
     */
    public void setImageSmoothingEnabled(boolean var1)  { } //setMemberBoolean("imageSmoothingEnabled", var1);

    /**
     * CanvasRenderingContext2D: setTransform().
     */
    public static native void setTransformImpl(JSObject contextJS, double var1, double var3, double var5, double var7, double var9, double var11);

    /**
     * CanvasRenderingContext2D: transform().
     */
    public static native void transformImpl(JSObject contextJS, double var1, double var3, double var5, double var7, double var9, double var11);

    /**
     * CanvasRenderingContext2D_getImageDataImpl().
     */
    private static native JSObject getImageDataImpl(JSObject canvasJS, int x, int y, int w, int h);

    /**
     * CanvasRenderingContext2D_putImageDataImpl().
     */
    private static native void putImageDataImpl(JSObject canvasJS, JSObject imageDataJS, double var2, double var4, double var6, double var8, double var10, double var12);

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
    //void fillRect(double var1, double var3, double var5, double var7);
    //void fillText(String var1, double var2, double var4, double var6);
    //void fillText(String var1, double var2, double var4);
    //void strokeRect(double var1, double var3, double var5, double var7);
    //void strokeText(String var1, double var2, double var4, double var6);
    //void strokeText(String var1, double var2, double var4);
    //String getTextAlign();
    //void setTextAlign(String var1);
    //String getTextBaseline();
    //void setTextBaseline(String var1);
    //HTMLCanvasElement getCanvas();
}
