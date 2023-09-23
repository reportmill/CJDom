

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
 * JSObject method: getMemberBooleanImpl()
 */
function Java_cjdom_CJObject_getMemberBooleanImpl(lib, jsObj, aName)  { return jsObj[aName] ? 1 : 0; }

/**
 * JSObject method: setMemberBooleanImpl()
 */
function Java_cjdom_CJObject_setMemberBooleanImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

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
function Java_cjdom_CJObject_callImpl(lib, jsObj, aName)  { jsObj[aName].call(jsObj); }

/**
 * JSObject method: callWithObjectImpl().
 */
function Java_cjdom_CJObject_callWithObjectImpl(lib, jsObj, aName, theArg)  { jsObj[aName].call(jsObj, theArg); }

/**
 * JSObject method: callWithObject2Impl().
 */
function Java_cjdom_CJObject_callWithObject2Impl(lib, jsObj, aName, arg1, arg2)  { jsObj[aName].call(jsObj, arg1, arg2); }

/**
 * JSObject method: callWithStringImpl().
 */
function Java_cjdom_CJObject_callWithStringImpl(lib, jsObj, aName, strArg)  { jsObj[aName].call(jsObj, strArg); }

/**
 * JSObject method: callWithString2Impl().
 */
function Java_cjdom_CJObject_callWithString2Impl(lib, jsObj, aName, arg1, arg2)
{
    jsObj[aName].call(jsObj, arg1, arg2);
}

/**
 * JSObject method: callWithIntImpl().
 */
function Java_cjdom_CJObject_callWithIntImpl(lib, jsObj, aName, arg1)
{
    jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callWithInt2Impl().
 */
function Java_cjdom_CJObject_callWithInt2Impl(lib, jsObj, aName, arg1, arg2)
{
    jsObj[aName].call(jsObj, arg1, arg2);
}

/**
 * JSObject method: callWithInt3Impl().
 */
function Java_cjdom_CJObject_callWithInt3Impl(lib, jsObj, aName, arg1, arg2, arg3, arg4)
{
    jsObj[aName].call(jsObj, arg1, arg2, arg3, arg4);
}

/**
 * JSObject method: callWithInt4Impl().
 */
function Java_cjdom_CJObject_callWithInt4Impl(lib, jsObj, aName, arg1, arg2, arg3, arg4)
{
    jsObj[aName].call(jsObj, arg1, arg2, arg3, arg4);
}

/**
 * JSObject method: callWithDoubleImpl().
 */
function Java_cjdom_CJObject_callWithDoubleImpl(lib, jsObj, aName, arg1)
{
    jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callWithDouble2Impl().
 */
function Java_cjdom_CJObject_callWithDouble2Impl(lib, jsObj, aName, arg1, arg2)
{
    jsObj[aName].call(jsObj, arg1, arg2);
}

/**
 * JSObject method: callWithDouble4Impl().
 */
function Java_cjdom_CJObject_callWithDouble4Impl(lib, jsObj, aName, arg1, arg2, arg3, arg4)
{
    jsObj[aName].call(jsObj, arg1, arg2, arg3, arg4);
}

/**
 * JSObject method: callWithDouble6Impl().
 */
function Java_cjdom_CJObject_callWithDouble6Impl(lib, jsObj, aName, arg1, arg2, arg3, arg4, arg5, arg6)
{
    jsObj[aName].call(jsObj, arg1, arg2, arg3, arg4, arg5, arg6);
}

/**
 * JSObject method: callWithArgsImpl().
 */
function Java_cjdom_CJObject_callWithArgsImpl(lib, jsObj, aName, arrayJS)
{
    switch (arrayJS.length) {
        case 1: jsObj[aName].call(jsObj, arrayJS[0]); break;
        case 2: jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1]); break;
        case 3: jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2]); break;
        case 4: jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3]); break;
        case 5: jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3], arrayJS[4]); break;
        case 6: jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3], arrayJS[4], arrayJS[5]); break;
        default: console.log("callWithArgs: Too many args: " + arrayJS.length);
    }
}

/**
 * JSObject method: callForObjectWithArgsImpl().
 */
function Java_cjdom_CJObject_callForObjectWithArgsImpl(lib, jsObj, aName, arrayJS)
{
    switch (arrayJS.length) {
        case 1: return jsObj[aName].call(jsObj, arrayJS[0]);
        case 2: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1]);
        case 3: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2]);
        case 4: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3]);
        case 5: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3], arrayJS[4]);
        case 6: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3], arrayJS[4], arrayJS[5]);
        default: console.log("callWithArgs: Too many args: " + arrayJS.length); return null;
    }
}

/**
 * JSObject method: callForStringWithArgsImpl().
 */
function Java_cjdom_CJObject_callForStringWithArgsImpl(lib, jsObj, aName, arrayJS)
{
    var string = Java_cjdom_CJObject_callForObjectWithArgsImpl(lib, jsObj, aName, arrayJS);
    return string != null ? string : "SNAP_NULL";
}

/**
 * JSObject method: callForIntWithArgsImpl().
 */
function Java_cjdom_CJObject_callForIntWithArgsImpl(lib, jsObj, aName, arrayJS)
{
    switch (arrayJS.length) {
        case 1: return jsObj[aName].call(jsObj, arrayJS[0]);
        case 2: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1]);
        case 3: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2]);
        case 4: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3]);
        case 5: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3], arrayJS[4]);
        case 6: return jsObj[aName].call(jsObj, arrayJS[0], arrayJS[1], arrayJS[2], arrayJS[3], arrayJS[4], arrayJS[5]);
        default: console.log("callWithArgs: Too many args: " + arrayJS.length); return null;
    }
}

/**
 * JSObject method: callForObjectImpl().
 */
function Java_cjdom_CJObject_callForObjectImpl(lib, jsObj, aName)  { return jsObj[aName].call(jsObj); }

/**
 * JSObject method: callForObjectWithObjectImpl().
 */
function Java_cjdom_CJObject_callForObjectWithObjectImpl(lib, jsObj, aName, arg1)
{
    return jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callForObjectWithStringImpl().
 */
function Java_cjdom_CJObject_callForObjectWithStringImpl(lib, jsObj, aName, arg1)
{
    return jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callForObjectWithIntImpl().
 */
function Java_cjdom_CJObject_callForObjectWithIntImpl(lib, jsObj, aName, arg1)
{
    return jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callForStringWithStringImpl().
 */
function Java_cjdom_CJObject_callForStringWithStringImpl(lib, jsObj, aName, arg1)
{
    return jsObj[aName].call(jsObj, arg1);
}

/**
 * JSObject method: callForStringWithString2Impl().
 */
function Java_cjdom_CJObject_callForStringWithString2Impl(lib, jsObj, aName, arg1, arg2)
{
    return jsObj[aName].call(jsObj, arg1, arg2);
}

/**
 * CJDom: logJS().
 */
function Java_cjdom_CJDom_logJS(lib, anObj)  { console.log(anObj); }

/**
 * CJDom: logImpl().
 */
function Java_cjdom_CJDom_logImpl(lib, anObj)  { console.log(anObj); }

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
 * Array: getImpl()
 */
function Java_cjdom_Array_getImpl(lib, array, index)  { return array[index]; }

/**
 * Array: setImpl()
 */
function Java_cjdom_Array_setImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Array: setStringImpl()
 */
function Java_cjdom_Array_setStringImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Array: setBooleanImpl()
 */
function Java_cjdom_Array_setBooleanImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Array: setIntImpl()
 */
function Java_cjdom_Array_setIntImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Array: setFloatImpl()
 */
function Java_cjdom_Array_setFloatImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Array: setDoubleImpl()
 */
function Java_cjdom_Array_setDoubleImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Array: getObjectImpl()
 */
function Java_cjdom_Array_getObjectImpl(lib, array, index)  { return array[index]; }

/**
 * Array: getStringImpl()
 */
function Java_cjdom_Array_getStringImpl(lib, array, index)  { return array[index]; }

/**
 * Array: newArrayForLength()
 */
function Java_cjdom_Array_newArrayForLengthImpl(lib, length)  { return new Array(length); }

/**
 * Int8Array: getImpl().
 */
function Java_cjdom_Int8Array_getImpl(lib, int8Array, index)  { return int8Array[index]; }

/**
 * Int8Array: setImpl().
 */
function Java_cjdom_Int8Array_setImpl(lib, int8Array, index, aValue)  { int8Array[index] = aValue; }

/**
 * Int8Array: newArrayForLengthImpl().
 */
function Java_cjdom_Int8Array_newArrayForLengthImpl(lib, length)  { return new Int8Array(length); }

/**
 * Int8Array: newArrayForArrayBuffer().
 */
function Java_cjdom_Int8Array_newArrayForArrayBuffer(lib, arrayBufferJS)  { return new Int8Array(arrayBufferJS); }

/**
 * Int32Array: setImpl().
 */
function Java_cjdom_Int32Array_setImpl(lib, int8Array, index, aValue)  { int8Array[index] = aValue; }

/**
 * Int32Array: newArrayForLengthImpl().
 */
function Java_cjdom_Int32Array_newArrayForLengthImpl(lib, length)  { return new Int8Array(length); }

/**
 * Int32Array: newArrayForJavaArray().
 */
function Java_cjdom_Int32Array_newArrayForJavaArray(lib, javaArray, length)
{
    return javaArray.this.a1.subarray(1, length + 1);
}

/**
 * Uint8ClampedArray: getImpl().
 */
function Java_cjdom_Uint8ClampedArray_getImpl(lib, jsObj, index)  { return jsObj[index]; }

/**
 * Uint8ClampedArray: setImpl().
 */
function Java_cjdom_Uint8ClampedArray_setImpl(lib, jsObj, index, aValue)  { jsObj[index] = aValue; }

/**
 * Uint8ClampedArray: newArrayForLengthImpl().
 */
function Java_cjdom_Uint8ClampedArray_newArrayForLengthImpl(lib, aLen)  { return new Uint8ClampedArray(aLen); }

/**
 * Uint16Array: setImpl().
 */
function Java_cjdom_Uint16Array_setImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Uint16Array: newArrayForLengthImpl().
 */
function Java_cjdom_Uint16Array_newArrayForLengthImpl(lib, length)  { return new Uint16Array(length); }

/**
 * Uint16Array: newArrayForJavaArray().
 */
function Java_cjdom_Uint16Array_newArrayForJavaArray(lib, javaArray, length)
{
    return javaArray.this.a1.subarray(1, length + 1);
}

/**
 * Uint32Array: setImpl().
 */
function Java_cjdom_Uint32Array_setImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Uint32Array: newArrayForLengthImpl().
 */
function Java_cjdom_Uint32Array_newArrayForLengthImpl(lib, length)  { return new Uint32Array(length); }

/**
 * Uint32Array: newArrayForJavaArray().
 */
function Java_cjdom_Uint32Array_newArrayForJavaArray(lib, javaArray, length)
{
    return javaArray.this.a1.subarray(1, length + 1);
}

/**
 * Float32Array: setImpl().
 */
function Java_cjdom_Float32Array_setImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Float32Array: newArrayForLengthImpl().
 */
function Java_cjdom_Float32Array_newArrayForLengthImpl(lib, length)  { return new Float32Array(length); }

/**
 * Float32Array: newArrayForLengthImpl().
 */
function Java_cjdom_Float32Array_newArrayForJavaArray(lib, javaArray, length)
{
    return javaArray.this.a1.subarray(1, length + 1);
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
function Java_cjdom_Blob_createURL(lib, blobJS)  { return URL.createObjectURL(blobJS); }

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

/**
 * Clipboard: getReadPermissionsPromiseImpl()
 */
function Java_cjdom_Clipboard_getReadPermissionsPromiseImpl(lib)
{
    return navigator.permissions ? navigator.permissions.query({name: 'clipboard-read'}) : null;
}

/**
 * Clipboard: getClipboardReadTextPromiseImpl()
 */
function Java_cjdom_Clipboard_getClipboardReadTextPromiseImpl(lib)
{
    return navigator.clipboard.readText();
}

/**
 * Clipboard: getClipboardWriteItemsPromiseImpl().
 */
async function Java_cjdom_Clipboard_getClipboardWriteItemsPromiseImpl(lib, theItems)
{
    navigator.clipboard.write(theItems);
}

/**
 * ClipboardItem: newClipboardItemForTypeAndString()
 */
function Java_cjdom_ClipboardItem_newClipboardItemForTypeAndString(lib, type, string)
{
    var blob = new Blob([ string ], { type });
    var entry = { [blob.type]: blob };
    return new ClipboardItem(entry);
}

/**
 * ClipboardItem: newClipboardItemForBlob()
 */
function Java_cjdom_ClipboardItem_newClipboardItemForBlob(lib, blob)
{
    var entry = { [blob.type]: blob };
    return new ClipboardItem(entry);
}

/**
 * DataTransfer: newDataTransfer().
 */
function Java_cjdom_DataTransfer_newDataTransfer(lib)  { return new DataTransfer(); }

/**
 * FileReader: newFileReader().
 */
function Java_cjdom_FileReader_newFileReader(lib)  { return new FileReader(); }

// This wrapped promise is used to trigger getNextEvent
var _eventNotifyMutex = null;

// This array holds event records (which are also arrays of name, lambda func and optional arg)
let _eventQueue = [ ];

function createMutex()
{
    let fulfill = null;
    let promise = new Promise(f => { fulfill = f; });
    return { fulfill, promise };
}

function fireEvent(name, callback, arg1, arg2)
{
    // Assume we want to steal all events, since preventDefault won't work with async event delivery)
    if (arg1 instanceof Event) {
        if (arg1 instanceof KeyboardEvent) {
            if (arg1.metaKey) {
                var key = arg1.key;
                if (key == "l" || arg1.altKey)
                    return;
            }
        }
        var type = arg1.type;
        if (type != "click" && type != "pointerdown") { // && type != "wheel") {
            arg1.preventDefault();
            arg1.stopPropagation();
        }
    }

    // Add event to queue
    _eventQueue.push([ name, callback, arg1, arg2 ]);

    // If mutex set, trigger it
    if (_eventNotifyMutex != null) {
        _eventNotifyMutex.fulfill();
        _eventNotifyMutex = null;
    }
}

/**
 * EventQueue: getNextEvent().
 */
async function Java_cjdom_EventQueue_getNextEvent(lib)
{
    // If event already in queue, just return it
    if (_eventQueue.length > 0)
        return _eventQueue.shift();

    // Otherwise create mutex and wait for next event
    _eventNotifyMutex = createMutex();
    await _eventNotifyMutex.promise;

    // Clear mutex and return event
    _eventNotifyMutex = null;
    return _eventQueue.shift();
}

/**
 * EventQueue: setTimeoutImpl().
 */
function Java_cjdom_EventQueue_setTimeoutImpl(lib, aName, aRun, aDelay)
{
    setTimeout(() => fireEvent(aName, aRun, null), aDelay);
}

/**
 * EventQueue: setIntervalImpl().
 */
function Java_cjdom_EventQueue_setIntervalImpl(lib, aName, aRun, aDelay)
{
    return setInterval(() => fireEvent(aName, aRun, null), aDelay);
}

// This dictionary holds all addEventListener() listeners with the JS mapped version so removeEventListener() can work
let _listenerDict = { };

/**
 * Registers an event handler of a specific event type on the EventTarget
 */
function Java_cjdom_EventQueue_addEventListenerImpl(lib, eventTargetJS, name, eventLsnr, lsnrId, useCapture)
{
    let lsnrJS = e => fireEvent(name, eventLsnr, e, null);
    _listenerDict[lsnrId] = lsnrJS;
    eventTargetJS.addEventListener(name, lsnrJS, useCapture);
}

/**
 * Removes an event handler of a specific event type from the EventTarget
 */
function Java_cjdom_EventQueue_removeEventListenerImpl(lib, eventTarget, aName, eventLsnr, lsnrId, useCapture)
{
    let lsnrJS = _listenerDict[lsnrId];
    if (lsnrJS != null) {
        eventTarget.removeEventListener(aName, lsnrJS, useCapture);
        _listenerDict[lsnrId] = null;
    }
}

/**
 * EventQueue: setPromiseThenImpl().
 */
function Java_cjdom_EventQueue_setPromiseThenImpl(lib, promiseWrapper, aFunc)
{
    let promise = promiseWrapper[0]; // Could pass a mutex in to supported chained promises with a fireEventAndWait() method
    return [ promise.then(value => fireEvent("promise", aFunc, value, null)) ];
}

/**
 * CanvasRenderingContext2D: fillTextImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_fillTextImpl(lib, cntxJS, aString, aX, aY)  { cntxJS.fillText(aString, aX, aY); }

/**
 * CanvasRenderingContext2D: fillTextImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_fillTextImpl2(lib, cntxJS, aString, aX, aY, maxWidth)  { cntxJS.fillText(aString, aX, aY, maxWidth); }

/**
 * CanvasRenderingContext2D: strokeText().
 */
function Java_cjdom_CanvasRenderingContext2D_strokeTextImpl(lib, cntxJS, aString, aX, aY)  { cntxJS.strokeText(aString, aX, aY); }

/**
 * CanvasRenderingContext2D: strokeText().
 */
function Java_cjdom_CanvasRenderingContext2D_strokeTextImpl2(lib, cntxJS, aString, aX, aY, maxWidth)  { cntxJS.strokeText(aString, aX, aY, maxWidth); }

/**
 * CanvasRenderingContext2D: drawImageImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_drawImageImpl(lib, cntxJS, imageJS, aX, aY)  { cntxJS.drawImage(imageJS, aX, aY); }

/**
 * CanvasRenderingContext2D: drawImageImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_drawImageImpl2(lib, cntxJS, imageJS, aX, aY, aW, aH)  { cntxJS.drawImage(imageJS, aX, aY, aW, aH); }

/**
 * CanvasRenderingContext2D: drawImageImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_drawImageImpl3(lib, cntxJS, imageJS, srcX, srcY, srcW, srcH, destX, destY, destW, destH)
{
    cntxJS.drawImage(imageJS, srcX, srcY, srcW, srcH, destX, destY, destW, destH);
}

/**
 * CanvasRenderingContext2D: getImageData().
 */
function Java_cjdom_CanvasRenderingContext2D_getImageDataImpl(lib, canvas, x, y, w, h)
{
    return canvas.getImageData(x, y, w, h);
}

/**
 * CanvasRenderingContext2D: putImageDataImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_putImageDataImpl(lib, canvas, imageDataJS, aX, aY, dirtyX, dirtyY, dirtyW, dirtyH)
{
    canvas.putImageData(imageDataJS, aX, aY, dirtyX, dirtyY, dirtyW, dirtyH);
}

/**
 * CanvasRenderingContext2D: createLinearGradientImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_createLinearGradientImpl(lib, contextJS, x0, y0, x1, y1)
{
    return contextJS.createLinearGradient(x0, y0, x1, y1);
}

/**
 * CanvasRenderingContext2D: createRadialGradientImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_createRadialGradientImpl(lib, contextJS, x0, y0, r0, x1, y1, r1)
{
    return contextJS.createRadialGradient(x0, y0, r0, x1, y1, r1);
}

/**
 * CanvasRenderingContext2D: createPatternImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_createPatternImpl(lib, contextJS, imageJS, repetition)
{
    return contextJS.createPattern(imageJS, repetition);
}

/**
 * ImageData: newImageDataForArrayAndWidthAndHeight()
 */
function Java_cjdom_ImageData_newImageDataForArrayAndWidthAndHeight(lib, uint8ClampedArrayJS, aWidth, aHeight)
{
    return new ImageData(uint8ClampedArrayJS, aWidth, aHeight);
}

/**
 * CanvasGradient: addColorStopImpl().
 */
function Java_cjdom_CanvasGradient_addColorStopImpl(lib, gradientJS, offset, color)  { gradientJS.addColorStop(offset, color); }

/**
 * Constant for registering with CJ.
 */
let cjdomNativeMethods = {

    Java_cjdom_CJObject_getMemberImpl, Java_cjdom_CJObject_setMemberImpl,
    Java_cjdom_CJObject_getMemberStringImpl, Java_cjdom_CJObject_setMemberStringImpl,
    Java_cjdom_CJObject_getMemberBooleanImpl, Java_cjdom_CJObject_setMemberBooleanImpl,
    Java_cjdom_CJObject_getMemberIntImpl, Java_cjdom_CJObject_setMemberIntImpl,
    Java_cjdom_CJObject_getMemberFloatImpl, Java_cjdom_CJObject_setMemberFloatImpl,
    Java_cjdom_CJObject_getMemberDoubleImpl, Java_cjdom_CJObject_setMemberDoubleImpl,
    Java_cjdom_CJObject_callImpl,
    Java_cjdom_CJObject_callWithObjectImpl, Java_cjdom_CJObject_callWithObject2Impl,
    Java_cjdom_CJObject_callWithStringImpl, Java_cjdom_CJObject_callWithString2Impl,
    Java_cjdom_CJObject_callWithIntImpl, Java_cjdom_CJObject_callWithInt2Impl,
    Java_cjdom_CJObject_callWithInt3Impl, Java_cjdom_CJObject_callWithInt4Impl,
    Java_cjdom_CJObject_callWithDoubleImpl, Java_cjdom_CJObject_callWithDouble2Impl,
    Java_cjdom_CJObject_callWithDouble4Impl, Java_cjdom_CJObject_callWithDouble6Impl,
    Java_cjdom_CJObject_callWithArgsImpl,
    Java_cjdom_CJObject_callForObjectWithArgsImpl,
    Java_cjdom_CJObject_callForStringWithArgsImpl,
    Java_cjdom_CJObject_callForIntWithArgsImpl,
    Java_cjdom_CJObject_callForObjectImpl, Java_cjdom_CJObject_callForObjectWithObjectImpl,
    Java_cjdom_CJObject_callForObjectWithStringImpl,
    Java_cjdom_CJObject_callForObjectWithIntImpl,
    Java_cjdom_CJObject_callForStringWithStringImpl, Java_cjdom_CJObject_callForStringWithString2Impl,

    Java_cjdom_CJDom_logJS,
    Java_cjdom_CJDom_logImpl,
    Java_cjdom_CJDom_getViewportWidth, Java_cjdom_CJDom_getViewportHeight,
    Java_cjdom_CJDom_getDevicePixelRatio,

    Java_cjdom_Array_getImpl, Java_cjdom_Array_setImpl,
    Java_cjdom_Array_setStringImpl, Java_cjdom_Array_setBooleanImpl,
    Java_cjdom_Array_setIntImpl,
    Java_cjdom_Array_setFloatImpl, Java_cjdom_Array_setDoubleImpl,
    Java_cjdom_Array_getObjectImpl,
    Java_cjdom_Array_getStringImpl,
    Java_cjdom_Array_newArrayForLengthImpl,

    Java_cjdom_Int8Array_getImpl, Java_cjdom_Int8Array_setImpl,
    Java_cjdom_Int8Array_newArrayForLengthImpl,
    Java_cjdom_Int8Array_newArrayForArrayBuffer,

    Java_cjdom_Int32Array_setImpl,
    Java_cjdom_Int32Array_newArrayForLengthImpl,
    Java_cjdom_Int32Array_newArrayForJavaArray,

    Java_cjdom_Uint16Array_setImpl,
    Java_cjdom_Uint16Array_newArrayForLengthImpl,
    Java_cjdom_Uint16Array_newArrayForJavaArray,

    Java_cjdom_Uint32Array_setImpl,
    Java_cjdom_Uint32Array_newArrayForLengthImpl,
    Java_cjdom_Uint32Array_newArrayForJavaArray,

    Java_cjdom_Float32Array_newArrayForLengthImpl,
    Java_cjdom_Float32Array_newArrayForJavaArray,
    Java_cjdom_Float32Array_setImpl,

    Java_cjdom_Uint8ClampedArray_getImpl, Java_cjdom_Uint8ClampedArray_setImpl,
    Java_cjdom_Uint8ClampedArray_newArrayForLengthImpl,

    Java_cjdom_Blob_createBlobForBytesAndType,

    Java_cjdom_Blob_createURL,

    Java_cjdom_File_createFileForNameAndTypeAndBytes,

    Java_cjdom_Node_getNodeNameImpl, Java_cjdom_Node_getParentNodeImpl,
    Java_cjdom_Node_appendChildImpl, Java_cjdom_Node_removeChildImpl,

    Java_cjdom_Element_getInnerHTMLImpl, Java_cjdom_Element_setInnerHTMLImpl,

    Java_cjdom_Document_getBodyImpl, Java_cjdom_Document_createElementImpl,

    Java_cjdom_Window_currentImpl, Java_cjdom_Window_getDocumentImpl,
    Java_cjdom_Window_getInnerWidthImpl, Java_cjdom_Window_getInnerHeightImpl,
    Java_cjdom_Window_openImpl, Java_cjdom_Window_clearInterval,

    Java_cjdom_Clipboard_getReadPermissionsPromiseImpl,
    Java_cjdom_Clipboard_getClipboardReadTextPromiseImpl,
    Java_cjdom_Clipboard_getClipboardWriteItemsPromiseImpl,

    Java_cjdom_ClipboardItem_newClipboardItemForTypeAndString,
    Java_cjdom_ClipboardItem_newClipboardItemForBlob,

    Java_cjdom_DataTransfer_newDataTransfer,

    Java_cjdom_FileReader_newFileReader,

    Java_cjdom_EventQueue_getNextEvent,
    Java_cjdom_EventQueue_setTimeoutImpl, Java_cjdom_EventQueue_setIntervalImpl,
    Java_cjdom_EventQueue_addEventListenerImpl, Java_cjdom_EventQueue_removeEventListenerImpl,

    Java_cjdom_EventQueue_setPromiseThenImpl,

    Java_cjdom_CanvasRenderingContext2D_fillTextImpl, Java_cjdom_CanvasRenderingContext2D_fillTextImpl2,
    Java_cjdom_CanvasRenderingContext2D_strokeTextImpl, Java_cjdom_CanvasRenderingContext2D_strokeTextImpl2,
    Java_cjdom_CanvasRenderingContext2D_drawImageImpl, Java_cjdom_CanvasRenderingContext2D_drawImageImpl2, Java_cjdom_CanvasRenderingContext2D_drawImageImpl3,
    Java_cjdom_CanvasRenderingContext2D_getImageDataImpl, Java_cjdom_CanvasRenderingContext2D_putImageDataImpl,
    Java_cjdom_CanvasRenderingContext2D_createLinearGradientImpl, Java_cjdom_CanvasRenderingContext2D_createRadialGradientImpl,
    Java_cjdom_CanvasRenderingContext2D_createPatternImpl,

    Java_cjdom_ImageData_newImageDataForArrayAndWidthAndHeight,

    Java_cjdom_CanvasGradient_addColorStopImpl
};
