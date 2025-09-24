package jxbrowser;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.dom.event.EventType;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.engine.RenderingMode;
import com.teamdev.jxbrowser.event.Observer;
import com.teamdev.jxbrowser.frame.Frame;
import com.teamdev.jxbrowser.js.JsAccessible;
import com.teamdev.jxbrowser.js.JsArray;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import webapi.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import com.teamdev.jxbrowser.js.JsObject;
import webapi.Window;
import javax.swing.*;

/**
 * This class is an adapter for this package, implementing the fundamental functionality to make it work with
 * CheerpJ, TeaVM, JxBrowser.
 */
public class JxWebEnv extends WebEnv<JsObject> {

    // The engine
    private Engine _engine;

    // The browser
    private Browser _browser;

    // The current frame
    private Frame _frame;

    // The current Window
    private Window _window;

    // The current Console
    private Console _console;

    /**
     * Constructor.
     */
    public JxWebEnv()
    {
        super();
        init();
    }

    private void init()
    {
        System.setProperty("jxbrowser.license.key", "");

        // Create the Engine + Browser
        EngineOptions engineOptions = EngineOptions.newBuilder(RenderingMode.HARDWARE_ACCELERATED).remoteDebuggingPort(8888).build();
        _engine = Engine.newInstance(engineOptions);
        _browser = _engine.newBrowser();

        _browser.navigation().loadHtml("<html><body></body></html>");

        // Load a page with a JS function
        _frame = _browser.mainFrame().get();

        // After load, call the function
        JsObject window = _frame.executeJavaScript("window");
        _window = new Window(window);
        JsObject console = _frame.executeJavaScript("console");
        _console = new Console(console);

        SwingUtilities.invokeLater(() -> showFrame(_engine, _browser));

//        String debugUrl = _browser.devTools().remoteDebuggingUrl().get();
//        try { Desktop.getDesktop().browse(new URI(debugUrl)); }
//        catch (Exception e) { e.printStackTrace(); }
//        try { Thread.sleep(300_000); } // 5 minutes to play with DevTools
//        catch (InterruptedException ignored) {}
    }

    private void showFrame(Engine engine, Browser browser)
    {
        JFrame frame = new JFrame("JxBrowser Swing");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { engine.close(); }
        });
        // Create and embed Swing BrowserView component to display web content.
        BrowserView browserView = BrowserView.newInstance(browser);
        frame.add(browserView);
        frame.setSize(1280, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        _browser.devTools().show();
    }

    /**
     * Returns a named member of a JavaScript object.
     */
    public JsObject getMember(JsObject jsObj, String aName)
    {
        return (JsObject) jsObj.property(aName).get();
    }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMember(JsObject jsObj, String aName, JsObject aValue)
    {
        jsObj.putProperty(aName, aValue);
    }

    /**
     * Returns a named member of a JavaScript object.
     */
    public String getMemberString(JsObject jsObj, String aName)
    {
        return (String) jsObj.property(aName).get();
    }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberString(JsObject jsObj, String aName, String aValue)
    {
        jsObj.putProperty(aName, aValue);
    }

    /**
     * Returns a named member of a JavaScript object.
     */
    public boolean getMemberBoolean(JsObject jsObj, String aName)
    {
        return (Boolean) jsObj.property(aName).get();
    }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberBoolean(JsObject jsObj, String aName, boolean aValue)
    {
        jsObj.putProperty(aName, aValue);
    }

    /**
     * Returns a named member of a JavaScript object as int.
     */
    public int getMemberInt(JsObject jsObj, String aName)
    {
        Number number = (Number) jsObj.property(aName).get();
        return number.intValue();
    }

    /**
     * Sets a named member of a JavaScript object.
     */
    public void setMemberInt(JsObject jsObj, String aName, int aValue)
    {
        jsObj.putProperty(aName, aValue);
    }

    /**
     * Returns a named member of a JavaScript object as double.
     */
    public double getMemberDouble(JsObject jsObj, String aName)
    {
        Number number = (Number) jsObj.property(aName).get();
        return number.doubleValue();
    }

    /**
     * Sets a named member of a JavaScript object as double.
     */
    public void setMemberDouble(JsObject jsObj, String aName, double aValue)
    {
        jsObj.putProperty(aName, aValue);
    }

    /**
     * Calls a method.
     */
    public Object call(JsObject jsObj, String aName, Object... args)
    {
        return jsObj.call(aName, args);
    }

    /**
     * Returns an indexed member of a JavaScript object.
     */
    public Object getSlot(JsObject jsObj, int anIndex)
    {
        JsArray array = (JsArray) jsObj;
        return array.get(anIndex);
    }

    /**
     * Sets an indexed member of a JavaScript object.
     */
    public void setSlot(JsObject jsObj, int anIndex, Object aValue)
    {
        JsArray array = (JsArray) jsObj;
        array.set(anIndex, aValue);
    }

    /**
     * Evaluates given JavaScript string and returns result.
     */
    @Override
    public Object eval(String javaScript)  { return _frame.executeJavaScript(javaScript); }

    /**
     * Returns the current window.
     */
    public Window window()
    {
        if (_window != null) return _window;
        return _window = null;
    }

    /**
     * Returns the current console.
     */
    public Console console()
    {
        if (_console != null) return _console;
        return _console = null;
    }

    /**
     * Does await promise for given promise.
     */
    public Object awaitForPromise(JsObject aPromise)  { return null; }

    /**
     * Wrapper method for Web API method.
     */
    public void open(String url, String target, String windowFeatures)
    {
        Window window = get().window();
        window.call("open", url, target, windowFeatures);
    }

    /**
     * Request animation frame.
     */
    public int requestAnimationFrame(DoubleConsumer callback)  { return 0; }

    /**
     * Schedules a runnable to execute after a delay of given milliseconds.
     */
    public void setTimeout(Runnable aRun, int aDelay)
    {
        // Get runnable for JxBrowser
        JxRunnable jxRunnable = new JxRunnable(aRun, "javaTimeoutRun_" + System.identityHashCode(aRun));

        // Inject our Runnable under a property
        Window window = get().window();
        JsObject windowJS = (JsObject) window.getJS();
        windowJS.putProperty(jxRunnable.name, jxRunnable);

        // Use setTimeout to call it
        String javaScript = String.format("setTimeout(function() { %s.run(); }, %d);", jxRunnable.name, aDelay);
        _frame.executeJavaScript(javaScript);
    }

    /**
     * Schedules a runnable to execute every time a given number of milliseconds elapses.
     */
    public int setInterval(Runnable aRun, int aPeriod)
    {
        // Get runnable for JxBrowser
        JxRunnable jxRunnable = new JxRunnable(aRun, "javaRun_" + System.identityHashCode(aRun));

        // Inject our Runnable under a property
        JsObject windowJS = (JsObject) get().window().getJS();
        windowJS.putProperty(jxRunnable.name, jxRunnable);

        // Use setInterval to call it
        String javaScript = String.format("setInterval(function() { %s.run(); }, %d);", jxRunnable.name, aPeriod);
        Number number = _frame.executeJavaScript(javaScript);
        _intervals.put(number, jxRunnable);
        return number.intValue();
    }

    // A record to wrap a runnable
    public record JxRunnable(Runnable runnable, String name) {

        @JsAccessible
        public void run()
        {
            runnable.run();

            if (name.startsWith("javaTimeout")) {
                JsObject windowJS = (JsObject) get().window().getJS();
                windowJS.removeProperty(name);
            }
        }
    }

    // A map of current intervals
    private static Map<Number,JxRunnable> _intervals = new HashMap<>();

    @Override
    public void clearInterval(int anId)
    {
        super.clearInterval(anId);

        // Get JxRunnable for interval id and remove property
        JxRunnable jxRunnable = _intervals.remove(anId);
        if (jxRunnable != null) {
            JsObject windowJS = (JsObject) get().window().getJS();
            windowJS.removeProperty(jxRunnable.name);
        }
    }

    /**
     * Returns an array of given length.
     */
    public JsObject newArrayJSForLength(int aLength)  { return null; }

    /**
     * Returns an array of bytes for given array buffer.
     */
    public byte[] getBytesArrayForArrayBufferJS(JsObject arrayBufferJS)  { return null;}

    /**
     * Returns an array of bytes for given typed array.
     */
    public byte[] getBytesArrayForTypedArrayJS(JsObject typedArrayJS)  { return null; }

    /**
     * Returns an array of shorts for given typed array.
     */
    public short[] getShortsArrayForTypedArrayJS(JsObject typedArrayJS)  { return null; }

    /**
     * Returns an array of shorts for given typed array.
     */
    public short[] getShortsArrayForChannelIndexAndCount(JsObject typedArrayJS, int channelIndex, int channelCount)  { return null; }

    /**
     * Returns a typed array of given class for given input.
     */
    public JsObject getTypedArrayJSForClassAndObject(Class<?> aClass, Object arrayObject)  { return null; }

    /**
     * Returns new ImageData for given short array of RGBA color components and width and height.
     */
    public JsObject newImageDataJSForRgbaArrayAndWidthAndHeight(Object arrayObject, int aWidth, int aHeight)  { return null; }

    /**
     * Returns a new Blob for given byte array and type.
     */
    public JsObject newBlobJSForBytesAndType(byte[] byteArray, String aType)  { return null; }

    /**
     * Creates a URL for given blob.
     */
    public String createUrlForBlobJS(JsObject blobJS)  { return null; }

    /**
     * Returns a new File for given name, type and bytes.
     */
    public JsObject newFileJSForNameAndTypeAndBytes(String aName, String aType, byte[] byteArray)  { return null; }

    /**
     * Returns a new FileReader.
     */
    public JsObject newFileReaderJS()  { return null; }

    /**
     * Returns a new MutationObserver.
     */
    public JsObject newMutationObserver(MutationObserver.Callback aCallback)  { return null; }

    /**
     * Registers a mutation observer to observe given node for given mutations types object.
     */
    public void addMutationObserver(MutationObserver mutationObserver, Node aNode, Object optionsObjJS)  { return; }

    /**
     * Returns a new ClipboardItem for given mime type and data string.
     */
    public Object newClipboardItemForMimeTypeAndDataString(String mimeType, String dataString)  { return null; }

    /**
     * Returns a new ClipboardItem for given Blob JS.
     */
    public Object newClipboardItemForBlobJS(Object blobJS)  { return null; }

    /**
     * Returns an array of ClipboardItem JavaScript objects from clipboard.
     */
    public Object[] readClipboardItemsJS()  { return null; }

    /**
     * Writes a given JavaScript array of ClipboardItem JavaScript objects to clipboard.
     */
    public void writeClipboardItemsJS(Object clipboardItemsJS)  { }

    /**
     * Registers an event handler of a specific event type on the EventTarget.
     */
    public void addEventListener(EventTarget eventTarget, String aName, EventListener<?> eventLsnr, boolean useCapture)
    {
        JSProxy jsProxy = (JSProxy) eventTarget;
        com.teamdev.jxbrowser.dom.event.EventTarget eventTargetJS = (com.teamdev.jxbrowser.dom.event.EventTarget) jsProxy.getJS();
        EventType eventType = EventType.of(aName);
        Observer<com.teamdev.jxbrowser.dom.event.Event> observer = e -> handleEvent(e, (EventListener<Event>) eventLsnr, aName);
        eventTargetJS.addEventListener(eventType, observer, useCapture);
    }

    public void handleEvent(com.teamdev.jxbrowser.event.Event eventJS, EventListener<Event> eventLsnr, String eventType)
    {
        Event uiEvent = null;
        if (eventType.contains("mouse")) {
            com.teamdev.jxbrowser.dom.event.MouseEvent mouseEvent = (com.teamdev.jxbrowser.dom.event.MouseEvent) eventJS;
            JsObject obj = newObject();
            obj.putProperty("clientX", mouseEvent.clientLocation().x());
            obj.putProperty("clientY", mouseEvent.clientLocation().y());
            obj.putProperty("pageX", mouseEvent.pageLocation().x());
            obj.putProperty("pageY", mouseEvent.pageLocation().y());
            obj.putProperty("button", mouseEvent.button().number());
            uiEvent = new MouseEvent(obj);
        }
        eventLsnr.handleEvent(uiEvent);
    }

    /**
     * Removes an event handler of a specific event type from the EventTarget.
     */
    public void removeEventListener(EventTarget eventTarget, String aName, EventListener<?> eventLsnr, boolean useCapture)  { }

    /**
     * Registers an event handler of a specific event type on the EventTarget.
     */
    public void addLoadEventListener(EventTarget eventTarget, EventListener<?> eventLsnr)  { }

    /**
     * Returns whether current thread is event thread.
     */
    public boolean isEventThread()  { return true; }

    /**
     * Starts a new event thread.
     */
    public void startNewEventThreadAndWait()  { }

    /**
     * Stops a new event thread (after delay so this thread can finish).
     */
    public void stopEventThreadAndNotify()  { }

    /**
     * Sets a promise.then() function.
     */
    public <T,V> Promise<V> setPromiseThen(Promise<T> aPromise, Function<? super T, ? extends V> aFunc)  { return null; }

    /**
     * Returns a new DataTransfer for given DataTransfer JavaScript object.
     */
    public DataTransfer newDataTransferForDataTransferJS(JsObject jsObj)  { return null; }

    /**
     * Returns the DataTransfer from last drop.
     */
    public DataTransfer getDropDataTransfer()  { return null; }

    /**
     * Returns the rendering context object for given type string and JavaScript object.
     */
    public Object getRenderingContext(String contextType, JsObject jsObj)  { return null; }
}
