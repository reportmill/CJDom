
This is the proof of concept websocket server for boardspace.  It runs
on the unmodified live server and bridges websockets from cheerpj.

the basic configuration is to run 

	websockify boardspace.net:12345 boardspace.net:12245

12345 is a random open socket (open it in the firewall)
22245 is the customary server port for the test server. 

for testing purposes, you can use echoserver as the target, or netcat

in principle, whatever service you normally provide on 12245 (or whatever)
can run unchanged.  The java program that normally used java sockets
can instead use something based on "WebSocket.java" and connect
to port 123345 (or whatever) and be otherwise unchanged.

Login.html provides an example of adding a few native methods which
connect with the WebSocket class.

Websockify.c is derived from https://github.com/novnc/websockify-other
which proports to be a port of the original websockify.py, but has
been somewhat modified.  The main known deficiency is that it doesn't
handle SSL

echo.c is a simple echo server cribbed from a random internet page.


so summary: the server runs unmodified
	    websockify runs as a proxy between 
	    java usage of sockets is unchanged except for using "WebSocker.java" 
		(instead of native java sockets.)

the .html file that launches the cheerpj mediated java application needs
to contain a few native javascript methods.

