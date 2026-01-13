
# CJDom

This Java library provides a set of WebAPI wrapper classes that are a bridge to the
[browser WebAPIs](https://developer.mozilla.org/en-US/docs/Web/API).
This allows Java developers to directly manipulate the DOM when running in the browser. The browser WebAPIs provide functionality
for native graphics rendering, WebGL 3D rendering, system clipboard/drag-and-drop and more.

Here are some demos of **[Java WebAPI programming](https://github.com/reportmill/SnapKit/tree/master/src/snap/webapi)**, running live in a Java browser IDE **[(SnapCode)](https://reportmill.com/SnapCode)** that is itself running on WebAPI:

<a href="https://reportmill.com/SnapCode/app/#sample:DOMTests.zip" align="center">
<img width="285" height="240" alt="DomSamples" src="https://github.com/user-attachments/assets/3b8b1790-7b6d-4039-9479-42dad2d33bef" />
<p>WebAPI Demos in SnapCode</p>
</a>

## Why Java needs WebAPI

Java UI development is disappearing. Both Swing and JavaFX still have attractive development models, but deployment is mostly
limited to the desktop. Increasingly, platform vendors and users are less enthusiastic about installing desktop applications unless
the benefits are overwhelming.

To make Java UI development attractive again, Java must support deployment in the browser, support integration with the browser and
support more browser standards and paradigms. The ideal modern Java UI framework should include these features:

    - Run in browser and desktop
    - Support modern graphics, audio, video, animation and 3D
    - Interoperable with other web technologies and services
    - Leverage familiarity and ubiquity of browser programming
    - Leverage skills most front-end developers have and want
    - Not require years of development and excessive funding

If you accept any of that, then it follows that Java UI should fundamentally be built on WebAPI. There is no need to
rewrite this vast functionality, WebAPIs are readily available everywhere: in every browser and on the desktop via [Chrome
packaging](https://github.com/chromiumembedded/java-cef). Web APIs are the new "AWT" - and Java doesn't have to play an
impossible game of catch up.

## How to use

Since the WebAPI framework is a wrapper, it needs access to a real WebAPI implementation. In the browser, this can be done
with [CheerpJ](https://cheerpj.com). To run this library in the browser with [CheerpJ](https://cheerpj.com):

    - Include SnapKit gradle/maven dependency: "com.reportmill:snapkit:2025.12"
    - Copy cjdom.js and cjdom.html from CJDom repo to build/libs dir
    - Run some http-server in that directory
    - Go to http://localhost:8080/cjdom.html in your browser
