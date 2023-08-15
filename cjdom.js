

/**
 * JSObject method: getMemberImpl()
 */
function Java_cjdom_CJObject_getMemberImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * JSObject method: setMemberImpl()
 */
function Java_cjdom_CJObject_setMemberImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * JSObject method: getMemberStringImpl()
 */
function Java_cjdom_CJObject_getMemberStringImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * JSObject method: setMemberStringImpl()
 */
function Java_cjdom_CJObject_setMemberStringImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * JSObject method: getMemberIntImpl()
 */
function Java_cjdom_CJObject_getMemberIntImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * JSObject method: setMemberIntImpl()
 */
function Java_cjdom_CJObject_setMemberIntImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * JSObject method: getMemberFloatImpl()
 */
function Java_cjdom_CJObject_getMemberFloatImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * JSObject method: setMemberFloatImpl()
 */
function Java_cjdom_CJObject_setMemberFloatImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * JSObject method: getMemberDoubleImpl()
 */
function Java_cjdom_CJObject_getMemberDoubleImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * JSObject method: setMemberDoubleImpl()
 */
function Java_cjdom_CJObject_setMemberDoubleImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * JSObject method: callImpl().
 */
function Java_cjdom_CJObject_callImpl(lib, jsObj, aName)
{
    jsObj[aName].call(jsObj, null);
}

/**
 * JSObject method: callWithObjectImpl().
 */
function Java_cjdom_CJObject_callWithObjectImpl(lib, jsObj, aName, theArg)
{
    return jsObj[aName].call(jsObj, theArg);
}

/**
 * JSObject method: callWithStringImpl().
 */
function Java_cjdom_CJObject_callWithStringImpl(lib, jsObj, aName, strArg)
{
    return jsObj[aName].call(jsObj, strArg);
}

/**
 * JSObject method: call().
 */
function Java_cjdom_CJObject_callForStringWithStringImpl(lib, jsObj, aName, theArg)
{
    return jsObj[aName].call(jsObj, theArg);
}

/**
 * JSObject method: call().
 */
function Java_cjdom_CJObject_callForStringWithStringStringImpl(lib, jsObj, Name, arg1, arg2)
{
    return jsObj[aName].call(jsObj, arg1, arg2);
}

/**
 * JSObject method: callWithDoubleImpl().
 */
function Java_cjdom_CJObject_callWithDoubleImpl(lib, jsObj, aName, arg1)
{
    jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callWithDoubleDoubleImpl().
 */
function Java_cjdom_CJObject_callWithDoubleDoubleImpl(lib, jsObj, aName, arg1, arg2)
{
    jsObj[aName].call(jsObj, arg1, arg2);
}

/**
 * CJDom method: log().
 */
function Java_cjdom_CJDom_logImpl(lib, anObj)
{
    console.log(anObj);
}

/**
 * CJDom method: Returns Viewport width.
 * Web suggested: window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth
 */
function Java_cjdom_CJDom_getViewportWidth(lib)  { return document.documentElement.clientWidth; }

/**
 * CJDom method: Returns Viewport height.
 */
function Java_cjdom_CJDom_getViewportHeight(lib)  { return document.documentElement.clientHeight; }

/**
 * CJDom method: Return device pixel ratio.
 */
function Java_cjdom_CJDom_getDevicePixelRatio(lib)  { return window.devicePixelRatio; }

/**
 * Array method: getImpl()
 */
function Java_cjdom_Array_getImpl(lib, array, index)  { return array[index]; }

/**
 * Array method: setImpl()
 */
function Java_cjdom_Array_setImpl(lib, array, index, aValue)
{
    array[index] = aValue;
}

/**
 * Array method: getObjectImpl()
 */
function Java_cjdom_Array_getObjectImpl(lib, array, index)  { return array[index]; }

/**
 * Array method: getStringImpl()
 */
function Java_cjdom_Array_getStringImpl(lib, array, index)  { return array[index]; }

/**
 * Array method: newArrayForLength()
 */
function Java_cjdom_Array_newArrayForLengthImpl(lib, length)
{
    return new Array(length);
}

/**
 * Int8Array method.
 */
function Java_cjdom_Int8Array_setImpl(lib, int8Array, index, aValue)
{
    int8Array[index] = aValue;
}

/**
 * Int8Array method.
 */
function Java_cjdom_Int8Array_newArrayForLengthImpl(lib, length)
{
    return new Int8Array(length);
}

/**
 * Uint16Array method.
 */
function Java_cjdom_Uint16Array_setImpl(lib, array, index, aValue)
{
    array[index] = aValue;
}

/**
 * Uint16Array method.
 */
function Java_cjdom_Uint16Array_newArrayForLengthImpl(lib, length)
{
    return new Uint16Array(length);
}

/**
 * Float32Array method.
 */
function Java_cjdom_Float32Array_setImpl(lib, array, index, dummy, aValue)
{
    array[index] = aValue;
}

/**
 * Float32Array method.
 */
function Java_cjdom_Float32Array_newArrayForLengthImpl(lib, length)
{
    return new Float32Array(length);
}

/**
 * Blob method: Creates a Blob from given bytes in JS.
 */
function Java_cjdom_Blob_createBlobForBytesAndType(lib, int8ArrayJS, typeStr)
{
    return new Blob([ int8ArrayJS ], typeStr ? { type: typeStr } : null);
}

/**
 * Creates a URL from given blob.
 */
function Java_cjdom_Blob_createURL(lib, blobJS)
{
    return URL.createObjectURL(blobJS);
}

/**
 * Creates a File from given bytes in JS.
 */
function Java_cjdom_File_createFileForNameAndTypeAndBytes(lib, name, type, int8ArrayJS)
{
    return new File([ int8ArrayJS ], name, type ? { type: type } : null);
}

/**
 * Node method: Return node name.
 */
function Java_cjdom_Node_getNodeNameImpl(lib, nodeJS)  { return nodeJS.nodeName; }

/**
 * Node method: Return parentNode.
 */
function Java_cjdom_Node_getParentNodeImpl(lib, nodeJS)  { return nodeJS.parentNode; }

/**
 * Node method: Add given child node.
 */
function Java_cjdom_Node_appendChildImpl(lib, parentJS, childJS)  { parentJS.appendChild(childJS); }

/**
 * Node method: Remove given child node.
 */
function Java_cjdom_Node_removeChildImpl(lib, parentJS, childJS)  { parentJS.removeChild(childJS); }

/**
 * Element method: Returns the InnerHTML string.
 */
function Java_cjdom_Element_getInnerHTMLImpl(lib, elementJS)  { return elementJS.innerHTML; }

/**
 * Element method: Sets the InnerHTML string.
 */
function Java_cjdom_Element_setInnerHTMLImpl(lib, elementJS, htmlStr)  { elementJS.innerHTML = htmlStr; }

/**
 * Document method: Return document.body.
 */
function Java_cjdom_Document_getBodyImpl(lib, docObj)  { return docObj.body; }

/**
 * Document method: Create and return new element for given tag name.
 */
function Java_cjdom_Document_createElementImpl(lib, docJS, tagName)  { return docJS.createElement(tagName); }

/**
 * HTMLElement method: getOffsetTopImpl().
 */
function Java_cjdom_HTMLElement_getOffsetTopImpl(lib, elementJS)  { return elementJS.offsetTop; }

/**
 * HTMLElement method: getOffsetLeftImpl().
 */
function Java_cjdom_HTMLElement_getOffsetLeftImpl(lib, elementJS)  { return elementJS.offsetLeft; }

/**
 * HTMLElement method: Returns the htmlElement.style.
 */
function Java_cjdom_HTMLElement_getStyleImpl(lib, elementJS)  { return elementJS.style; }

/**
 * Creates a URL from given blob.
 */
function Java_cjdom_HTMLElement_setContentEditableImpl(lib, htmlElementJS, aValue)
{
    htmlElementJS.contentEditable = aValue;
    htmlElementJS.tabIndex = 0;
}

/**
 * Window method.
 */
function Java_cjdom_Window_currentImpl(lib)  { return window; }

/**
 * Window method.
 */
function Java_cjdom_Window_getDocumentImpl(lib)  { return window.document; }

/**
 * Window method: Return window InnerWidth.
 */
function Java_cjdom_Window_getInnerWidthImpl(lib, winJS)  { return winJS.innerWidth; }

/**
 * Window method: Return window InnerHeight.
 */
function Java_cjdom_Window_getInnerHeightImpl(lib, winJS)  { return winJS.innerHeight; }

/**
 * Window method.
 */
function Java_cjdom_Window_openImpl(lib, winJS, urlStr, targetStr, windowFeaturesStr)
{
    window.open(urlStr, targetStr, windowFeaturesStr);
}

/**
 * Stops intervals for given id.
 */
function Java_cjdom_Window_clearInterval(lib, anId)  { clearInterval(anId); }

// This wrapped promise is used to trigger getNextEvent
var _eventNotifyMutex = createMutex();

// This array holds event records (which are also arrays of name, lambda func and optional arg)
let _eventQueue = [ ];

function createMutex()
{
    let fulfill = null;
    let reject = null;
    let promise = new Promise((f, r) => { fulfill = f; reject = r; });
    return { fulfill, reject, promise };
}

function fireEvent(name, callback, arg)
{
    // Assume we want to steal all events, since preventDefault won't work with async event delivery)
    if (arg instanceof Event) {
        arg.preventDefault();
        arg.stopPropagation();
    }

    _eventQueue.push([ name, callback, arg ]);
    _eventNotifyMutex.fulfill();
    _eventNotifyMutex = createMutex();
}

async function Java_cjdom_EventQueue_getNextEvent(lib)
{
    // If event already in queue, just return
    if (_eventQueue.length > 0)
        return _eventQueue.shift();

    // Otherwise wait for next event
    var mutexPromise = _eventNotifyMutex.promise.then(() => null);
    await mutexPromise;
    return _eventQueue.shift();
}

function Java_cjdom_EventQueue_setTimeoutImpl(lib, aName, aRun, aDelay)
{
    setTimeout(() => fireEvent(aName, aRun), aDelay);
}

function Java_cjdom_EventQueue_setIntervalImpl(lib, aName, aRun, aDelay)
{
    return setInterval(() => fireEvent(aName, aRun), aDelay);
}

/**
 * Registers an event handler of a specific event type on the EventTarget
 */
function Java_cjdom_EventQueue_addEventListenerImpl(lib, eventTargetJS, name, eventLsnr, useCapture)
{
    eventTargetJS.addEventListener(name, e => fireEvent(name, eventLsnr, e), useCapture);
}

/**
 * Removes an event handler of a specific event type from the EventTarget
 */
function Java_cjdom_EventQueue_removeEventListenerImpl(lib, eventTarget, aName, eventLsnr, useCapture)
{
    //eventTarget.removeEventListener(e => fireEvent(aName, eventLsnr, e), useCapture);
    console.log("EventQueue.removeEventListener: Not implemented yet");
}

/**
 * CanvasRenderingContext2D_getImageData().
 */
function Java_cjdom_CanvasRenderingContext2D_getImageDataImpl(lib, canvas, x, y, w, h)
{
    return canvas.getImageData(x, y, w, h);
}

/**
 * CanvasRenderingContext2D_putImageDataImpl.
 */
function Java_cjdom_CanvasRenderingContext2D_putImageDataImpl(lib, canvas, imageDataJS, var2, var4, var6, var8, var10, var12)
{
    canvas.putImageDataImpl(imageDataJS, var2, var4, var6, var8, var10, var12);
}

/**
 * ImageData: newImageDataForArrayAndWidthAndHeight()
 */
function Java_cjdom_ImageData_newImageDataForArrayAndWidthAndHeight(lib, uint8ClampedArrayJS, aWidth, aHeight)
{
    return new ImageData(uint8ClampedArrayJS, width, height);
}


/**
 * Constant for registering with CJ.
 */
let cjdomNativeMethods = {

    Java_cjdom_CJObject_getMemberImpl, Java_cjdom_CJObject_setMemberImpl,
    Java_cjdom_CJObject_getMemberStringImpl, Java_cjdom_CJObject_setMemberStringImpl,
    Java_cjdom_CJObject_getMemberIntImpl, Java_cjdom_CJObject_setMemberIntImpl,
    Java_cjdom_CJObject_getMemberFloatImpl, Java_cjdom_CJObject_setMemberFloatImpl,
    Java_cjdom_CJObject_getMemberDoubleImpl, Java_cjdom_CJObject_setMemberDoubleImpl,
    Java_cjdom_CJObject_callImpl,
    Java_cjdom_CJObject_callWithObjectImpl,
    Java_cjdom_CJObject_callWithStringImpl,
    Java_cjdom_CJObject_callForStringWithStringImpl, Java_cjdom_CJObject_callForStringWithStringStringImpl,
    Java_cjdom_CJObject_callWithDoubleImpl, Java_cjdom_CJObject_callWithDoubleDoubleImpl,

    Java_cjdom_CJDom_logImpl,
    Java_cjdom_CJDom_getViewportWidth, Java_cjdom_CJDom_getViewportHeight,
    Java_cjdom_CJDom_getDevicePixelRatio,

    Java_cjdom_Array_getImpl, Java_cjdom_Array_setImpl,
    Java_cjdom_Array_getObjectImpl,
    Java_cjdom_Array_getStringImpl,
    Java_cjdom_Array_newArrayForLengthImpl,

    Java_cjdom_Int8Array_newArrayForLengthImpl, Java_cjdom_Int8Array_setImpl,

    Java_cjdom_Uint16Array_newArrayForLengthImpl, Java_cjdom_Uint16Array_setImpl,

    Java_cjdom_Float32Array_newArrayForLengthImpl, Java_cjdom_Float32Array_setImpl,

    Java_cjdom_Blob_createBlobForBytesAndType,

    Java_cjdom_Blob_createURL,

    Java_cjdom_File_createFileForNameAndTypeAndBytes,

    Java_cjdom_Node_getNodeNameImpl, Java_cjdom_Node_getParentNodeImpl,
    Java_cjdom_Node_appendChildImpl, Java_cjdom_Node_removeChildImpl,

    Java_cjdom_Element_getInnerHTMLImpl, Java_cjdom_Element_setInnerHTMLImpl,

    Java_cjdom_Document_getBodyImpl, Java_cjdom_Document_createElementImpl,

    Java_cjdom_HTMLElement_getOffsetTopImpl, Java_cjdom_HTMLElement_getOffsetLeftImpl,
    Java_cjdom_HTMLElement_getStyleImpl,
    Java_cjdom_HTMLElement_setContentEditableImpl,

    Java_cjdom_Window_currentImpl, Java_cjdom_Window_getDocumentImpl,
    Java_cjdom_Window_getInnerWidthImpl, Java_cjdom_Window_getInnerHeightImpl,
    Java_cjdom_Window_openImpl, Java_cjdom_Window_clearInterval,

    Java_cjdom_EventQueue_getNextEvent,
    Java_cjdom_EventQueue_setTimeoutImpl, Java_cjdom_EventQueue_setIntervalImpl,
    Java_cjdom_EventQueue_addEventListenerImpl, Java_cjdom_EventQueue_removeEventListenerImpl,

    Java_cjdom_CanvasRenderingContext2D_getImageDataImpl, Java_cjdom_CanvasRenderingContext2D_putImageDataImpl,

    Java_cjdom_ImageData_newImageDataForArrayAndWidthAndHeight,
};
