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
    public void setTransform(double arg1, double arg2, double arg3, double arg4, double arg5, double arg6)
    {
        callWithDouble6("setTransform", arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * CanvasRenderingContext2D: transform().
     */
    public void transform(double arg1, double arg2, double arg3, double arg4, double arg5, double arg6)
    {
        callWithDouble6("transform", arg1, arg2, arg3, arg4, arg5, arg6);
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
     * CanvasRenderingContext2D: fillRect().
     */
    public void fillRect(double aX, double aY, double aW, double aH)  { callWithDouble4("fillRect", aX, aY, aW, aH); }

    /**
     * CanvasRenderingContext2D: strokeRect().
     */
    public void strokeRect(double aX, double aY, double aW, double aH)  { callWithDouble4("strokeRect", aX, aY, aW, aH); }

    /**
     * CanvasRenderingContext2D: getFillStyle().
     */
    public Object getFillStyle()  { return null; }

    /**
     * CanvasRenderingContext2D: setFillStyle().
     */
    public void setFillStyle(String fillStyleStr)  { setMemberString("fillStyle", fillStyleStr); }

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
    public void setStrokeStyle(String strokeStyleStr)  { setMemberString("strokeStyle", strokeStyleStr); }

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
     * CanvasRenderingContext2D: beginPath().
     */
    public void beginPath()  { call("beginPath"); }

    /**
     * CanvasRenderingContext2D: moveTo().
     */
    public void moveTo(double var1, double var3)  { callWithDoubleDouble("moveTo", var1, var3); }

    /**
     * CanvasRenderingContext2D: lineTo().
     */
    public void lineTo(double var1, double var3)  { callWithDoubleDouble("lineTo", var1, var3); }

    /**
     * CanvasRenderingContext2D: bezierCurveTo().
     */
    public void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double endX, double endY)
    {
        callWithDouble6("bezierCurveTo", cp1x, cp1y, cp2x, cp2y, endX, endY);
    }

    /**
     * CanvasRenderingContext2D: closePath().
     */
    public void closePath()  { call("closePath"); }

    /**
     * CanvasRenderingContext2D: beginPath().
     */
    public void clearRect(double aX, double aY, double aW, double aH)
    {
        callWithDouble4("clearRect", aX, aY, aW, aH);
    }

    //void arc(double var1, double var3, double var5, double var7, double var9, boolean var11);
    //void arc(double var1, double var3, double var5, double var7, double var9);
    //void arcTo(double var1, double var3, double var5, double var7, double var9);
    //void quadraticCurveTo(double var1, double var3, double var5, double var7);
    //void rect(double var1, double var3, double var5, double var7);

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
        JSObject textMetricsJS = callForObjectWithStringImpl(_jsObj, "measureText", aString);
        return new TextMetrics(textMetricsJS);
    }

    /**
     * CanvasRenderingContext2D: fillText().
     */
    public void fillText(String aString, double aX, double aY)  { fillTextImpl(_jsObj, aString, aX, aY); }

    /**
     * CanvasRenderingContext2D: fillText().
     */
    public void fillText(String aString, double aX, double aY, double maxWidth)  { fillTextImpl2(_jsObj, aString, aX, aY, maxWidth); }

    /**
     * CanvasRenderingContext2D: strokeText().
     */
    public void strokeText(String aString, double aX, double aY)  { strokeTextImpl(_jsObj, aString, aX, aY); }

    /**
     * CanvasRenderingContext2D: strokeText().
     */
    public void strokeText(String aString, double aX, double aY, double maxWidth)  { strokeTextImpl2(_jsObj, aString, aX, aY, maxWidth); }

    /**
     * CanvasRenderingContext2D: drawImage().
     */
    public void drawImage(CanvasImageSource anImage, double aX, double aY)  { drawImageImpl(_jsObj, ((CJObject) anImage)._jsObj, aX, aY); }

    /**
     * CanvasRenderingContext2D: drawImage().
     */
    public void drawImage(CanvasImageSource anImage, double aX, double aY, double aW, double aH)
    {
        drawImageImpl2(_jsObj, ((CJObject) anImage)._jsObj, aX, aY, aW, aH);
    }

    /**
     * CanvasRenderingContext2D: drawImage().
     */
    public void drawImage(CanvasImageSource anImage, double srcX, double srcY, double srcW, double srcH, double destX, double destY, double destW, double destH)
    {
        drawImageImpl3(_jsObj, ((CJObject) anImage)._jsObj, srcX, srcY, srcW, srcH, destX, destY, destW, destH);
    }

    /**
     * getImageData().
     */
    public ImageData getImageData(int aX, int aY, int aW, int aH)
    {
        JSObject imageDataJS = getImageDataImpl(_jsObj, aX, aY, aW, aH);
        return new ImageData(imageDataJS);
    }

    /**
     * Put image data.
     */
    public void putImageData(ImageData imageData, double aX, double aY, double dirtyX, double dirtyY, double dirtyW, double dirtyH)
    {
        putImageDataImpl(_jsObj, imageData._jsObj, aX, aY, dirtyX, dirtyY, dirtyW, dirtyH);
    }

    //void putImageData(ImageData var1, double aX, double aY);

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
     * CanvasRenderingContext2D: fillTextImpl().
     */
    private static native void fillTextImpl(JSObject cntxJS, String aString, double aX, double aY);

    /**
     * CanvasRenderingContext2D: fillTextImpl().
     */
    private static native void fillTextImpl2(JSObject cntxJS, String aString, double aX, double aY, double maxWidth);

    /**
     * CanvasRenderingContext2D: strokeText().
     */
    private static native void strokeTextImpl(JSObject cntxJS, String aString, double aX, double aY);

    /**
     * CanvasRenderingContext2D: strokeText().
     */
    private static native void strokeTextImpl2(JSObject cntxJS, String aString, double aX, double aY, double maxWidth);

    /**
     * CanvasRenderingContext2D: drawImageImpl().
     */
    private static native void drawImageImpl(JSObject cntxJS, JSObject imageJS, double aX, double aY);

    /**
     * CanvasRenderingContext2D: drawImageImpl().
     */
    private static native void drawImageImpl2(JSObject cntxJS, JSObject imageJS, double aX, double aY, double aW, double aH);

    /**
     * CanvasRenderingContext2D: drawImageImpl().
     */
    private static native void drawImageImpl3(JSObject cntxJS, JSObject imageJS, double srcX, double srcY, double srcW, double srcH, double destX, double destY, double destW, double destH);

    /**
     * CanvasRenderingContext2D_getImageDataImpl().
     */
    private static native JSObject getImageDataImpl(JSObject canvasJS, int aX, int aY, int aW, int aH);

    /**
     * CanvasRenderingContext2D_putImageDataImpl().
     */
    private static native void putImageDataImpl(JSObject canvasJS, JSObject imageDataJS, double aX, double aY, double dirtyX, double dirtyY, double dirtyW, double dirtyH);

    //boolean isPointInPath(double var1, double var3);
    //boolean isPointInStroke(double var1, double var3);
    //void scrollPathIntoView();
    //ImageData createImageData(double var1, double var3);
    //CanvasGradient createLinearGradient(double var1, double var3, double var5, double var7);
    //CanvasPattern createPattern(CanvasImageSource var1, String var2);
    //CanvasGradient createRadialGradient(double var1, double var3, double var5, double var7, double var9, double var11);
    //boolean drawCustomFocusRing(Element var1);
    //void drawSystemFocusRing(Element var1);
    //JSArrayReader<JSObject> getLineDash();
    //void setLineDash(JSArray<JSObject> var1);
    //String getTextAlign();
    //void setTextAlign(String var1);
    //String getTextBaseline();
    //void setTextBaseline(String var1);
    //HTMLCanvasElement getCanvas();
}
