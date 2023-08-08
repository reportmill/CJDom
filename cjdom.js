

async function Java_cjdom_CJDom_printString(lib, str)
{
    // 'str' is an opaque Java object as used by the CheerpJ VM, convert it a usable object
    var strWrapper = lib.getObjectWrapper(str);

    // 'toString' is specially handled in wrapper objects to return a JS string
    console.log(await strWrapper.toString());
}

/**
 * CJDom method log().
 */
function Java_cjdom_CJDom_logImpl(lib, anObj)
{
    console.log(anObj);
}

/**
 * Int8Array methods.
 */
function Java_cjdom_Int8Array_setImpl(lib, int8Array, index, aValue)
{
    int8Array[index] = aValue;
}

/**
 * Int8Array methods.
 */
function Java_cjdom_Int8Array_newArrayForLengthImpl(lib, length)
{
    return new Int8Array(length);
}

/**
 * Int8Array methods.
 */
function Java_cjdom_Uint16Array_setImpl(lib, array, index, aValue)
{
    array[index] = aValue;
}

/**
 * Int8Array methods.
 */
function Java_cjdom_Uint16Array_newArrayForLengthImpl(lib, length)
{
    return new Uint16Array(length);
}

/**
 * Window methods.
 */
function Java_cjdom_Window_currentImpl(lib)
{
    return window;
}

/**
 * Window methods.
 */
async function Java_cjdom_Window_openImpl(lib, winJS, url, target, windowFeatures)
{
    var urlJS = await lib.getObjectWrapper(url).toString();
    var targetJS = await lib.getObjectWrapper(target).toString();
    var windowFeaturesJS = null; //await lib.getObjectWrapper(windowFeatures).toString();
    window.open(urlJS, targetJS, windowFeaturesJS);
}

var cjdomNativeMethods = {
    Java_cjdom_CJDom_logImpl,
    Java_cjdom_Int8Array_newArrayForLengthImpl, Java_cjdom_Int8Array_setImpl,
    Java_cjdom_Uint16Array_newArrayForLengthImpl, Java_cjdom_Uint16Array_setImpl,
    Java_cjdom_Window_currentImpl, Java_cjdom_Window_openImpl,
};
