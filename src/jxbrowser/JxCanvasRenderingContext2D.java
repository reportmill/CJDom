package jxbrowser;
import webapi.*;

/**
 * This class is a CanvasRenderingContext2D subclass for JxBrowser.
 */
public class JxCanvasRenderingContext2D extends CanvasRenderingContext2D {

    /**
     * Constructor.
     */
    public JxCanvasRenderingContext2D(Object renderingContextJS)
    {
        super(renderingContextJS);
    }

    /**
     * Creates a linear gradient along the line connecting two given coordinates.
     */
    @Override
    public CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1)
    {
        Object gradientJS = null; //createLinearGradientImpl(_cntxJS, x0, y0, x1, y1);
        return new CanvasGradient(gradientJS);
    }

    /**
     * Creates a radial gradient using the size and coordinates of two circles.
     */
    @Override
    public CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1)
    {
        Object gradientJS = null; //createRadialGradientImpl(_cntxJS, x0, y0, r0, x1, y1, r1);
        return new CanvasGradient(gradientJS);
    }

    /**
     * Creates a pattern using the specified image and repetition.
     */
    @Override
    public CanvasPattern createPattern(CanvasImageSource image, String repetition)
    {
        Object patternJS = null; //createPatternImpl(_cntxJS, (JSObject) ((JSProxy) image).getJS(), repetition);
        return new CanvasPattern(patternJS);
    }

    /**
     * CanvasRenderingContext2D: paintStacks().
     */
    public void paintStacks(double contextScale, int[] instructionStack, int instructionStackSize, int[] intStack, double[] doubleStack, String[] stringStack, Object[] objectStack)
    {
//        paintStacksImpl(_cntxJS, contextScale, instructionStack, instructionStackSize, intStack, doubleStack, stringStack, objectStack);
    }
}
