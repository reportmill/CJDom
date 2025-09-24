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
     * CanvasRenderingContext2D: paintStacks().
     */
    public void paintStacks(double contextScale, int[] instructionStack, int instructionStackSize, int[] intStack, double[] doubleStack, String[] stringStack, Object[] objectStack)
    {
//        paintStacksImpl(_cntxJS, contextScale, instructionStack, instructionStackSize, intStack, doubleStack, stringStack, objectStack);
    }
}
