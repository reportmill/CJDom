

/**
 * CJObject method: getMemberImpl()
 */
function Java_cjdom_CJObject_getMemberImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * CJObject method: setMemberImpl()
 */
function Java_cjdom_CJObject_setMemberImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * CJObject method: getMemberStringImpl()
 */
function Java_cjdom_CJObject_getMemberStringImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * CJObject method: setMemberStringImpl()
 */
function Java_cjdom_CJObject_setMemberStringImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * CJObject method: getMemberBooleanImpl()
 */
function Java_cjdom_CJObject_getMemberBooleanImpl(lib, jsObj, aName)  { return jsObj[aName] ? 1 : 0; }

/**
 * CJObject method: setMemberBooleanImpl()
 */
function Java_cjdom_CJObject_setMemberBooleanImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * CJObject method: getMemberIntImpl()
 */
function Java_cjdom_CJObject_getMemberIntImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * CJObject method: setMemberIntImpl()
 */
function Java_cjdom_CJObject_setMemberIntImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * CJObject method: getMemberFloatImpl()
 */
function Java_cjdom_CJObject_getMemberFloatImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * CJObject method: setMemberFloatImpl()
 */
function Java_cjdom_CJObject_setMemberFloatImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * CJObject method: getMemberDoubleImpl()
 */
function Java_cjdom_CJObject_getMemberDoubleImpl(lib, jsObj, aName)  { return jsObj[aName]; }

/**
 * CJObject method: setMemberDoubleImpl()
 */
function Java_cjdom_CJObject_setMemberDoubleImpl(lib, jsObj, aName, aValue)  { jsObj[aName] = aValue; }

/**
 * CJObject: newObjectImpl()
 */
function Java_cjdom_CJObject_newObjectImpl(lib)  { return { }; }

/**
 * CJObject method: awaitForPromise()
 */
async function Java_cjdom_CJObject_awaitForPromise(lib, promiseJS)
{
    return await promiseJS;
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
 * Int8Array method: newArrayForByteArray().
 */
function Java_cjdom_Int8Array_newArrayForByteArray(lib, byteArray)  { return byteArray; }

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
function Java_cjdom_Int32Array_newArrayForJavaArray(lib, javaArray, length)  { return javaArray; }

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
 * Uint8ClampedArray: newArrayForShortsArray().
 */
function Java_cjdom_Uint8ClampedArray_newArrayForShortsArray(lib, uint16_Array)
{
    return Uint8ClampedArray.from(uint16_Array);
}

/**
 * Uint8ClampedArray: getShortsArrayImpl().
 */
function Java_cjdom_Uint8ClampedArray_getShortsArrayImpl(lib, uint8_Array)  { return Int16Array.from(uint8_Array); }

/**
 * Uint8ClampedArray: getShortsArrayForChannelIndexAndCountImpl().
 */
function Java_cjdom_Uint8ClampedArray_getShortsArrayForChannelIndexAndCountImpl(lib, uint8_Array, channelIndex, channelCount)
{
    var length = uint8_Array.length / channelCount;
    var int16_Array = new Int16Array(length);
    for (let i = 0, j = channelIndex; i < length; i++, j = j + channelCount)
        int16_Array[i + 1] = uint8_Array[j];
    return int16_Array;
}

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
function Java_cjdom_Uint16Array_newArrayForJavaArray(lib, javaArray, length)  { return javaArray; }

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
function Java_cjdom_Uint32Array_newArrayForJavaArray(lib, javaArray, length)  { return javaArray; }

/**
 * Float32Array: setImpl().
 */
function Java_cjdom_Float32Array_setImpl(lib, array, index, aValue)  { array[index] = aValue; }

/**
 * Float32Array: newArrayForLengthImpl().
 */
function Java_cjdom_Float32Array_newArrayForLengthImpl(lib, length)  { return new Float32Array(length); }

/**
 * Float32Array: newArrayForFloatArray().
 */
function Java_cjdom_Float32Array_newArrayForFloatArray(lib, floatArray)  { return floatArray; }

/**
 * Float32Array: fromImpl().
 */
function Java_cjdom_Float32Array_fromImpl(lib, arrayLike)  { return Float32Array.from(arrayLike); }

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

// An element that needs a click
var _needsClickElement;

/**
 * HTMLElement setNeedsClickElement(): Called to set an element that needs a click.
 */
function Java_cjdom_HTMLElement_setNeedsClickElement(lib, needsClickElement)
{
    _needsClickElement = needsClickElement;
}

// Clipboard.read() ClipboardItems - read upon meta+v key press, write() upon meta-c
var clipboardReadItems;
var clipboardWriteItems;

/**
 * Clipboard: readClipboardItemsImpl()
 */
async function Java_cjdom_Clipboard_readClipboardItemsImpl(lib)
{
    // If clipboardReadItems set, clear and return
    if (clipboardReadItems != null) {
        var temp = clipboardReadItems;
        clipboardReadItems = null;
        return temp;
    }

    // Try to read items
    try {
        var clipboardReadPromise = navigator.clipboard.read()
            .catch((e) => { console.log("Clipboard.readClipboardItemsImpl: Ignoring error: " + e); return [ ]; });
        return await clipboardReadPromise;
    }

    // Can happen on Safari iOS with localhost
    catch (e) { console.log("Clipboard.readClipboardItemsImpl:" + e); return [ ]; }
}

/**
 * Clipboard: writeClipboardItemsImpl().
 */
async function Java_cjdom_Clipboard_writeClipboardItemsImpl(lib, clipboardItems)
{
    // Will fail on Safari because this is not directly triggered from user event
    try {
        navigator.clipboard.write(clipboardItems).catch((e) => clipboardWriteItems = clipboardItems);
        clipboardReadItems = clipboardItems;
    }

    // Can happen on Safari iOS with localhost
    catch (e) { console.log("Clipboard.writeClipboardItemsImpl:" + e); }
}

/**
 * delayedClipboardWrite(): Called a moment after meta+C to try to write lingering clipboard items.
 */
function delayedClipboardWrite()
{
    if (clipboardWriteItems != null) {
        try { navigator.clipboard.write(clipboardWriteItems); }
        catch (e) { console.log("delayedClipboardWrite:" + e); }
        clipboardReadItems = clipboardWriteItems;
        clipboardWriteItems = null;
    }

    // If NeedsClickElement is set, tell it to click (Safari)
    if (_needsClickElement != null) {
        _needsClickElement.click();
        _needsClickElement = null;
    }
}

/**
 * eagerClipboardRead(): Called on meta+V (paste) to try to read items.
 */
async function eagerClipboardRead()
{
    try {
        clipboardReadItems = await navigator.clipboard.read().catch((e) => console.log("Ignoring: " + e));
    }

    // Can happen on Safari iOS with localhost
    catch (e) { console.log("eagerClipboardRead:" + e); }
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

// Cached drag drop data
var _dragDataTransferTypes;
var _dropDataTransfer;
var _dropDataTransferFiles

/**
 * DataTransfer: getDropDataTransferImpl().
 */
function Java_cjdom_DataTransfer_getDropDataTransferImpl(lib)  { return _dropDataTransfer; }

/**
 * DataTransfer: getDropDataTransferTypesImpl().
 */
function Java_cjdom_DataTransfer_getDropDataTransferTypesImpl(lib)  { return _dragDataTransferTypes; }

/**
 * DataTransfer: getDropDataTransferFilesImpl().
 */
function Java_cjdom_DataTransfer_getDropDataTransferFilesImpl(lib)  { return _dropDataTransferFiles; }

// Drag gesture data transfer
var _dragGestureDataTransfer = null;
var _dragGestureDragImage;
var _dragGestureDragImageX;
var _dragGestureDragImageY;

/**
 * DataTransfer: startDragImpl().
 */
function Java_cjdom_DataTransfer_startDragImpl(lib, dataTransfer, dragImage, dx, dy)
{
    _dragGestureDataTransfer = dataTransfer;
    _dragGestureDragImage = dragImage;
    _dragGestureDragImageX = dx;
    _dragGestureDragImageY = dy;
}

/**
 * Called when 'dragstart' called to configure dragGestureEvent.dataTransfer if values set in mousedown.
 */
function handleDragstart(dragEvent)
{
    // If dragGestureDataTransfer not set, just suppress and return
    if (_dragGestureDataTransfer === null) {
        dragEvent.preventDefault();
        dragEvent.stopPropagation();
        return;
    }

    // Copy _dragGestureDataTransfer to dragEvent.dataTransfer and image and return
    for (var type of _dragGestureDataTransfer.types) {
        var dataStr = _dragGestureDataTransfer.getData(type);
        dragEvent.dataTransfer.setData(type, dataStr);
    }

    // Set DragImage, add to body (and register to remove later), and clear dataTransfer / dragImage
    var dragImage = _dragGestureDragImage;
    dragEvent.dataTransfer.setDragImage(dragImage, _dragGestureDragImageX, _dragGestureDragImageY);
    document.body.appendChild(dragImage);
    setTimeout(() => dragImage.parentNode.removeChild(dragImage), 1000);
    _dragGestureDataTransfer = null; _dragGestureDragImage = null;
}

/**
 * Called on 'drop' event to cache data transfer, since it gets reset before CJ can use it.
 */
function handleDrop(dropEvent)
{
    // Create new DataTransfer to persist after drop DataTransfer is reset
    var dropDataTransfer = dropEvent.dataTransfer;
    var dropTypes = dropDataTransfer.types;
    _dropDataTransfer = new DataTransfer();

    // Copy data types to cached DataTransfer
    for (var type of dropTypes) {
        var dataStr = dropDataTransfer.getData(type);
        _dropDataTransfer.setData(type, dataStr);
    }

    // Copy files to cached DataTransfer
    _dropDataTransferFiles = [ ];
    for (var dropFile of dropDataTransfer.files)
        _dropDataTransferFiles.push(dropFile);
}

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

async function fireEvent(name, callback, arg1, arg2)
{
    // Assume we want to steal all events, since preventDefault won't work with async event delivery)
    if (arg1 instanceof Event) {

        // If KeyboardEvent, suppress some browser keys and do some copy/paste
        if (arg1 instanceof KeyboardEvent) {
            if (arg1.metaKey) {
                var key = arg1.key;

                // Ignore meta+l (select address bar) and meta+alt+i (show dev tools)
                if (key == "l" || arg1.altKey)
                    return;

                // If meta+C (copy) or meta+X (cut), write clipboardWriteItems
                if (key == 'c' || key =='x')
                    setTimeout(delayedClipboardWrite, 100);

                // If meta+V (paste), read and set clipboardReadItems
                else if (key == 'v')
                    eagerClipboardRead();
            }
        }

        // If MouseEvent, do some copy/paste
        if (arg1 instanceof MouseEvent) {
            if (arg1.type === 'mouseup') {
                setTimeout(delayedClipboardWrite, 100);
                _dragGestureDataTransfer = null; _dragGestureDragImage = null;
            }
        }

        // Handle DragStart: Forward to handleDragstart() and return (_dragGestureDataTransfer needs to be set in mousedown)
        var type = arg1.type;
        if (type === 'dragstart') {
            handleDragstart(arg1);
            return;
        }

        // Handle DragEnd
        if (type === 'dragend') {
            if (_dragGestureDataTransfer === null) {
                arg1.preventDefault();
                arg1.stopPropagation();
            }
        }

        // Stop default/propagation for most events
        else if (type !== 'mousedown' && type !== 'mousemove' && type !== 'mouseup' && type !== 'click' && type !== 'pointerdown') { // && type != "wheel") {
            arg1.preventDefault();
            arg1.stopPropagation();
        }

        // Special support for drag/drop
        if (arg1 instanceof DragEvent) {
            _dragDataTransferTypes = arg1.dataTransfer.types;
            if (arg1.type === 'drop')
                handleDrop(arg1);
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
    if (name !== 'load')
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
 * EventQueue: addMutationObserverImpl().
 */
function Java_cjdom_EventQueue_addMutationObserverImpl(lib, mutationObserverJS, nodeJS, callback, optionsObj)
{
    mutationObserverJS.observe(nodeJS, optionsObj);
}

/**
 * Called when mutation observed. Have to wrap mutation records, since event array is returned as Object[] and JNI doesn't know
 * whether to convert the array to JSObject or Object[].
 */
function mutationObserved(callback, mutationRecords)
{
    fireEvent("mutation", callback, { value : mutationRecords }, null);
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
 * MutationObserver: newMutationObserverImpl().
 */
function Java_cjdom_MutationObserver_newMutationObserverImpl(lib, aCallback)
{
    return new MutationObserver((mutationRecords, observer) => mutationObserved(aCallback, mutationRecords));
}

// This wrapped promise is used to trigger getNextEvent
var _loadEventNotifyMutex = null;

// This array holds event records (which are also arrays of name, lambda func and optional arg)
let _loadEventQueue = [ ];

function createLoadMutex()
{
    let fulfill = null;
    let promise = new Promise(f => { fulfill = f; });
    return { fulfill, promise };
}

async function fireLoadEvent(name, callback, arg1, arg2)
{
    // Add event to queue
    _loadEventQueue.push([ name, callback, arg1, arg2 ]);

    // If mutex set, trigger it
    if (_loadEventNotifyMutex != null) {
        _loadEventNotifyMutex.fulfill();
        _loadEventNotifyMutex = null;
    }
}

/**
 * LoadEventQueue: getNextEvent().
 */
async function Java_cjdom_LoadEventQueue_getNextEvent(lib)
{
    // If event already in queue, just return it
    if (_loadEventQueue.length > 0)
        return _loadEventQueue.shift();

    // Otherwise create mutex and wait for next event
    _loadEventNotifyMutex = createLoadMutex();
    await _loadEventNotifyMutex.promise;

    // Clear mutex and return event
    _loadEventNotifyMutex = null;
    return _loadEventQueue.shift();
}

/**
 * Registers a load event handler on the EventTarget
 */
function Java_cjdom_LoadEventQueue_addLoadEventListenerImpl(lib, eventTargetJS, eventLsnr)
{
    let lsnrJS = e => fireLoadEvent('load', eventLsnr, e, null);
    eventTargetJS.addEventListener('load', lsnrJS);
}

/**
 * CanvasRenderingContext2D: setLineDashImpl().
 */
function Java_cjdom_CanvasRenderingContext2D_setLineDashImpl(lib, cntxJS, doubleArray)
{
    var dashArray = Array.from(doubleArray);
    cntxJS.setLineDash(dashArray);
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

var _cntx;
var _cntxScale;
var _instructionStack;
var _intStack; var _intIndex;
var _doubleStack; var _doubleIndex;
var _stringStack; var _stringIndex;
var _nativeStack; var _nativeIndex;

/**
 * CanvasRenderingContext2D: paintStacks().
 */
function Java_cjdom_CanvasRenderingContext2D_paintStacksImpl(lib, contextJS, contextScale, instructionStack, instructionStackSize, intStack, doubleStack, stringStack, objectStack)
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
            default: System.out.println("Executor.exec: Unknown instruction"); break;
        }
    }
}

function setFont(){ _cntx.font = getNative(); }

function setPaint()
{
    cstr = getNative();
    _cntx.fillStyle = cstr;
    _cntx.strokeStyle = cstr;
}

function setStroke()
{
    _cntx.lineWidth = getDouble();
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
            ctx.fillText(char, charX, y);
            charX += ctx.measureText(char).width + cs;
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
            ctx.strokeText(char, charX, y);
            charX += ctx.measureText(char).width + cs;
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
    Java_cjdom_CJObject_newObjectImpl,
    Java_cjdom_CJObject_awaitForPromise,

    Java_cjdom_CJDom_logJS,
    Java_cjdom_CJDom_logImpl,
    Java_cjdom_CJDom_getViewportWidth, Java_cjdom_CJDom_getViewportHeight,
    Java_cjdom_CJDom_getDevicePixelRatio,

    Java_cjdom_Array_getImpl, Java_cjdom_Array_setImpl,
    Java_cjdom_Array_newArrayForLengthImpl,

    Java_cjdom_Int8Array_getImpl, Java_cjdom_Int8Array_setImpl,
    Java_cjdom_Int8Array_newArrayForLengthImpl,
    Java_cjdom_Int8Array_newArrayForByteArray,
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

    Java_cjdom_Float32Array_setImpl,
    Java_cjdom_Float32Array_newArrayForLengthImpl,
    Java_cjdom_Float32Array_newArrayForFloatArray,
    Java_cjdom_Float32Array_fromImpl,

    Java_cjdom_Uint8ClampedArray_getImpl, Java_cjdom_Uint8ClampedArray_setImpl,
    Java_cjdom_Uint8ClampedArray_newArrayForLengthImpl,
    Java_cjdom_Uint8ClampedArray_newArrayForShortsArray,
    Java_cjdom_Uint8ClampedArray_getShortsArrayImpl,
    Java_cjdom_Uint8ClampedArray_getShortsArrayForChannelIndexAndCountImpl,

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

    Java_cjdom_HTMLElement_setNeedsClickElement,

    Java_cjdom_Clipboard_readClipboardItemsImpl,
    Java_cjdom_Clipboard_writeClipboardItemsImpl,

    Java_cjdom_DataTransfer_getDropDataTransferImpl,
    Java_cjdom_DataTransfer_getDropDataTransferTypesImpl,
    Java_cjdom_DataTransfer_getDropDataTransferFilesImpl,
    Java_cjdom_DataTransfer_startDragImpl,

    Java_cjdom_ClipboardItem_newClipboardItemForTypeAndString,
    Java_cjdom_ClipboardItem_newClipboardItemForBlob,

    Java_cjdom_DataTransfer_newDataTransfer,

    Java_cjdom_FileReader_newFileReader,

    Java_cjdom_EventQueue_getNextEvent,
    Java_cjdom_EventQueue_setTimeoutImpl, Java_cjdom_EventQueue_setIntervalImpl,
    Java_cjdom_EventQueue_addEventListenerImpl, Java_cjdom_EventQueue_removeEventListenerImpl,

    Java_cjdom_EventQueue_addMutationObserverImpl,

    Java_cjdom_EventQueue_setPromiseThenImpl,

    Java_cjdom_MutationObserver_newMutationObserverImpl,

    Java_cjdom_LoadEventQueue_getNextEvent,
    Java_cjdom_LoadEventQueue_addLoadEventListenerImpl,

    Java_cjdom_CanvasRenderingContext2D_setLineDashImpl,
    Java_cjdom_CanvasRenderingContext2D_fillTextImpl, Java_cjdom_CanvasRenderingContext2D_fillTextImpl2,
    Java_cjdom_CanvasRenderingContext2D_strokeTextImpl, Java_cjdom_CanvasRenderingContext2D_strokeTextImpl2,
    Java_cjdom_CanvasRenderingContext2D_drawImageImpl, Java_cjdom_CanvasRenderingContext2D_drawImageImpl2, Java_cjdom_CanvasRenderingContext2D_drawImageImpl3,
    Java_cjdom_CanvasRenderingContext2D_getImageDataImpl, Java_cjdom_CanvasRenderingContext2D_putImageDataImpl,
    Java_cjdom_CanvasRenderingContext2D_createLinearGradientImpl, Java_cjdom_CanvasRenderingContext2D_createRadialGradientImpl,
    Java_cjdom_CanvasRenderingContext2D_createPatternImpl,
    Java_cjdom_CanvasRenderingContext2D_paintStacksImpl,

    Java_cjdom_ImageData_newImageDataForArrayAndWidthAndHeight,

    Java_cjdom_CanvasGradient_addColorStopImpl
};
