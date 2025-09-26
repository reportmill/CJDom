package jxbrowser;
import webapi.*;
import java.util.Arrays;
import java.util.List;

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

        if (!_paintStacksSet) {
            _paintStacksSet = true;
            WebEnv.get().eval(PAINT_STACKS_FUNCTION);
        }
    }

    /**
     * CanvasRenderingContext2D: paintStacks().
     */
    public void paintStacks(double contextScale, int[] instructionStack, int instructionStackSize, int[] intStack, double[] doubleStack, String[] stringStack, Object[] objectStack)
    {
        // Convert arrays to lists (non-primitive)
        List<Integer> instructionStackList = Arrays.stream(instructionStack).boxed().toList();
        List<Integer> intStackList = Arrays.stream(intStack).boxed().toList();
        List<Double> doubleStackList = Arrays.stream(doubleStack).boxed().toList();
        List<String> stringStackList = List.of(stringStack);
        List<Object> objectStackList = List.of(objectStack);

        // paintStacksImpl(_cntxJS, contextScale, instructionStack, instructionStackSize, intStack, doubleStack, stringStack, objectStack);
        WebEnv.get().window().call("paintStacksImpl", _jsObj, contextScale, instructionStackList, instructionStackSize, intStackList, doubleStackList, stringStackList, objectStackList);
    }

    private static boolean _paintStacksSet;
    private static final String PAINT_STACKS_FUNCTION = """
var _cntx;
var _cntxScale;
var _instructionStack;
var _intStack; var _intIndex;
var _doubleStack; var _doubleIndex;
var _stringStack; var _stringIndex;
var _nativeStack; var _nativeIndex;

/**
 * CJCanvasRenderingContext2D: paintStacks().
 */
window.paintStacksImpl = function (contextJS, contextScale, instructionStack, instructionStackSize, intStack, doubleStack, stringStack, objectStack)
{
    _cntx = contextJS;
    _cntxScale = contextScale;
    _instructionStack = instructionStack;
    _intStack = intStack; _intIndex = 0;
    _doubleStack = doubleStack; _doubleIndex = 0;
    _stringStack = stringStack; _stringIndex = 0;
    _nativeStack = objectStack; _nativeIndex = 0;

    _cntx.setTransform(_cntxScale, 0, 0, _cntxScale, 0, 0);

    for (var i = 0; i < instructionStackSize; i++) {
        switch (_instructionStack[i]) {
            case 1: setFont(); break;
            case 2: setPaint(); break;
            case 3: setStroke(); break;
            case 4: setOpacity(); break;
            case 5: drawShape(); break;
            case 6: fillShape(); break;
            case 7: clipShape(); break;
            case 8: drawImage(); break;
            case 9: drawImage2(); break;
            case 10: drawString(); break;
            case 11: strokeString(); break;
            case 12: transform(); break;
            case 13: setTransform(); break;
            case 14: save(); break;
            case 15: restore(); break;
            case 16: clearRect(); break;
            case 17: setImageQuality(); break;
            default: console.log("CJDom.js-paintStacks: Unknown instruction"); break;
        }
    }
}

function setFont() { _cntx.font = getNative(); }

function setPaint()
{
    var cstr = getNative();
    _cntx.fillStyle = cstr;
    _cntx.strokeStyle = cstr;
}

function setStroke()
{
    // Set line width
    _cntx.lineWidth = getDouble();

    // set line dash
    var dashArrayLen = getInt();
    var dashArray = [];
    for (var i = 0; i < dashArrayLen; i++)
        dashArray.push(getDouble());
    _cntx.setLineDash(dashArray);

    // Set line dash offset
    _cntx.lineDashOffset = dashArrayLen > 0 ? getDouble() : 0;

    // Set line cap
    var lineCap = getInt();
    _cntx.lineCap = lineCap === 0 ? 'round' : lineCap === 1 ? 'butt' : 'square';

    // Set line join
    var lineJoin = getInt();
    _cntx.lineJoin = lineJoin === 0 ? 'round' : lineJoin === 1 ? 'bevel' : 'miter';
    if (lineJoin === 2)
        _cntx.miterLimit = getDouble();
}

function setOpacity(){ _cntx.globalAlpha = getDouble(); }

function drawShape()
{
    setShape();
    _cntx.stroke();
}

function fillShape()
{
    setShape();
    _cntx.fill();
}

function clipShape()
{
    setShape();
    _cntx.clip();
}

function drawImage2()
{
    var image = getNative();
    _cntx.save();
    setTransform();
    if (image != null)
        _cntx.drawImage(image, 0, 0);
    _cntx.restore();
}

function drawImage()
{
    var image = getNative();
    var srcX = getDouble();
    var srcY = getDouble();
    var srcW = getDouble();
    var srcH = getDouble();
    var dx = getDouble();
    var dy = getDouble();
    var dw = getDouble();
    var dh = getDouble();

    // Correct source width/height for image dpi
    // double scaleX = anImg.getDpiX() / 72;
    // double scaleY = anImg.getDpiY() / 72;
    // if (scaleX != 1 || scaleY != 1) {
    //     srcX *= scaleX;
    //     srcW *= scaleX;
    //     srcY *= scaleY;
    //     srcH *= scaleY;
    // }

    if (image != null)
        _cntx.drawImage(image, srcX, srcY, srcW, srcH, dx, dy, dw, dh);
}

/** Draw string at location with char spacing. */
function drawString()
{
    var str = getString();
    var x = getDouble();
    var y = getDouble();
    var cs = getDouble();
    if (cs === 0)
        _cntx.fillText(str, x, y);
    else {
        let charX = x;
        for (let i = 0; i < str.length; i++) {
            const char = str[i];
            _cntx.fillText(char, charX, y);
            charX += _cntx.measureText(char).width + cs;
        }
    }
}

/** Stroke string at location with char spacing. */
function strokeString()
{
    var str = getString();
    var x = getDouble();
    var y = getDouble();
    var cs = getDouble();
    if (cs === 0)
        _cntx.strokeText(str, x, y);
    else {
        let charX = x;
        for (let i = 0; i < str.length; i++) {
            const char = str[i];
            _cntx.strokeText(char, charX, y);
            charX += _cntx.measureText(char).width + cs;
        }
    }
}

/**
 * Transform by transform.
 */
function setTransform()
{
    var m0 = getDouble(); var m1 = getDouble();
    var m2 = getDouble(); var m3 = getDouble();
    var m4 = getDouble(); var m5 = getDouble();
    _cntx.setTransform(m0 * _cntxScale, m1, m2, m3 * _cntxScale, m4, m5);
}

/** Transform by transform. */
function transform()
{
    var m0 = getDouble(); var m1 = getDouble();
    var m2 = getDouble(); var m3 = getDouble();
    var m4 = getDouble(); var m5 = getDouble();
    _cntx.transform(m0, m1, m2, m3, m4, m5);
}

function save()  { _cntx.save(); }

function restore()  { _cntx.restore(); }

function clearRect()
{
    var x = getDouble(); var y = getDouble();
    var w = getDouble(); var h = getDouble();
    _cntx.clearRect(x, y, w, h);
}

function setImageQuality()
{
    var quality = getDouble();
    var qualityStr = quality > .67 ? "high" : quality >.33 ? "medium" : "low";
    _cntx.imageSmoothingQuality = qualityStr;
    _cntx.imageSmoothingEnabled = quality > .33;
}

function setShape()
{
    var opCount = getInt();

    _cntx.beginPath();

    // Handle rect shape
    if (opCount === -1) {
        _cntx.rect(getDouble(), getDouble(), getDouble(), getDouble());
        return;
    }

    // Handle path shape: Iterate over path ops and add to context
    for (var i = 0; i < opCount; i++) {
        var op = getInt();
        switch (op) {
            case 0: _cntx.moveTo(getDouble(), getDouble()); break;
            case 1: _cntx.lineTo(getDouble(), getDouble()); break;
            case 2: _cntx.bezierCurveTo(getDouble(), getDouble(), getDouble(), getDouble(), getDouble(), getDouble()); break;
            case 3: _cntx.closePath(); break;
        }
    }
}

// Get stack values
function getInt()  { return _intStack[_intIndex++]; }
function getDouble()  { return _doubleStack[_doubleIndex++]; }
function getString()  { return _stringStack[_stringIndex++]; }
function getNative()  { return _nativeStack[_nativeIndex++]; }
            """;
}
