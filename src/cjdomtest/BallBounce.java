package cjdomtest;
import cjdom.*;

/**
 * A simple app to bounce balls around page.
 */
public class BallBounce {

    // The list of balls
    private Ball[] _balls = new Ball[MAX_BALL_COUNT];

    // The number of balls
    private int _ballCount;

    // The main element to hold balls
    private HTMLElement _mainEmt;

    // Whether animation is playing
    private int _playing = -1;

    // Whether mouse button is pressed
    private boolean _mouseDown;

    // Last add time
    private long _lastAddTime;

    // Max number of balls
    private static final int MAX_BALL_COUNT = 1000;

    /**
     * Create new BouncePane.
     */
    public BallBounce()
    {
        // Not using any Swing - maybe this is helpful
        try { System.setProperty("java.awt.headless", "true"); }
        catch(Throwable e) { System.err.println("Headless error: " + e); }

        // Get document and body
        HTMLDocument doc = HTMLDocument.getDocument();
        HTMLBodyElement body = doc.getBody();

        // Get main element and register mouse listeners
        _mainEmt = body;
        _mainEmt.addEventListener("mousedown", e -> mouseDown((MouseEvent) e));
        _mainEmt.addEventListener("mousemove", e -> mouseMove((MouseEvent) e));
        _mainEmt.addEventListener("mouseup", e -> _mouseDown = false);

        // Add Touch Listeners
        _mainEmt.addEventListener("touchstart", e -> touchStart((TouchEvent) e));
        _mainEmt.addEventListener("touchmove", e -> touchMove((TouchEvent) e));
        _mainEmt.addEventListener("touchend", e -> touchEnd((TouchEvent) e));

        // Add button
        HTMLElement btn = doc.createElement("button");
        btn.getStyle().setCssText("position:fixed;bottom:8px;right:8px;");
        btn.setInnerHTML("Clear Balls");
        body.appendChild(btn);

        // Seed some starter balls
        for (int i = 0; i < 10; i++)
            addBall(30, 30);
        body.getStyle().setCssText("margin:0;");
    }

    /**
     * Returns page width.
     */
    public int getWidth()  { return Window.current().getInnerWidth(); }

    /**
     * Returns page height.
     */
    public int getHeight()  { return Window.current().getInnerHeight(); }

    /**
     * Add ball.
     */
    public void addBall(double aX, double aY)
    {
        // If too many balls, just return
        if (_ballCount >= MAX_BALL_COUNT) return;

        // Add ball
        Ball ball = new Ball(aX, aY);
        _mainEmt.appendChild(ball.img);
        _balls[_ballCount++] = ball;
        play();
    }

    /**
     * Remove ball.
     */
    public void removeBall(Ball aBall)
    {
        _mainEmt.removeChild(aBall.img);
    }

    /**
     * Clears balls.
     */
    public void clearBalls()
    {
        for (int i = 0; i < _ballCount; i++) {
            removeBall(_balls[i]);
            _balls[i] = null;
        }
        _ballCount = 0;
        stop();
    }

    /**
     * Start animation.
     */
    public void play()
    {
        if (_playing >= 0) return;
        _playing = Window.setInterval(() -> moveBalls(), 25);
    }

    /**
     * Stop animation.
     */
    public void stop()
    {
        if (_playing < 0) return;
        Window.clearInterval(_playing);
        _playing = -1;
    }

    /**
     * Move balls.
     */
    void moveBalls()
    {
        for (int i = 0; i < _ballCount; i++)
            _balls[i].moveBall();
    }

    /**
     * Handle mouse down event.
     */
    public void mouseDown(MouseEvent anEvent)
    {
        mouseDown(anEvent.getClientX(), anEvent.getClientY());
        anEvent.preventDefault(); // Stop browser from potentially dragging hit image
    }

    /**
     * Handle mouse down event.
     */
    public void mouseDown(double aX, double aY)
    {
        // Set MouseDown
        _mouseDown = true;

        // If hit button, clear balls
        if (aX > getWidth() - 80 && aY > getHeight() - 40)
            clearBalls();

        // Otherwise, add ball
        else {
            addBall(aX, aY);
            _lastAddTime = System.currentTimeMillis();
        }
    }

    /**
     * Handle mouse move event.
     */
    public void mouseMove(MouseEvent anEvent)
    {
        mouseMove(anEvent.getClientX(), anEvent.getClientY());
    }

    /**
     * Handle mouse move event.
     */
    public void mouseMove(double aX, double aY)
    {
        // If not mouse drag, just return
        if (!_mouseDown) return;

        // If over button, just return
        if (aX > getWidth() - 80 && aY > getHeight() - 40)
            return;

        // If 100ms has passed, add ball
        long time = System.currentTimeMillis();
        if (time > _lastAddTime + 100) {
            addBall(aX, aY);
            _lastAddTime = time;
        }
    }

    /**
     * Called when body gets TouchStart.
     */
    public void touchStart(TouchEvent anEvent)
    {
        // Get event touches and first touch
        Touch[] touches = anEvent.getTouches();
        if (touches == null || touches.length == 0) return;
        Touch touch = touches[0];
        mouseDown(touch.getClientX(), touch.getClientY());
        anEvent.stopPropagation();
        anEvent.preventDefault();
    }

    /**
     * Called when body gets touchMove.
     */
    public void touchMove(TouchEvent anEvent)
    {
        // Get event touches and first touch
        Touch[] touches = anEvent.getTouches();
        if (touches == null || touches.length == 0) return;
        Touch touch = touches[0];
        mouseMove(touch.getClientX(), touch.getClientY());
        anEvent.stopPropagation();
        anEvent.preventDefault();
    }

    /**
     * Called when body gets touchEnd.
     */
    public void touchEnd(TouchEvent anEvent)  { _mouseDown = false; }

    /**
     * Returns whether bounds contains x/y.
     */
    public boolean contains(double aX, double aY)
    {
        return (0 <= aX) && (aX <= getWidth()) && (0 <= aY) && (aY <= getHeight());
    }

    /**
     * Returns whether bounds contains rect.
     */
    public boolean contains(double aX, double aY, double aW, double aH)
    {
        return contains(aX, aY) && contains(aX + aW, aY + aH);
    }

    /**
     * Standard main method.
     */
    public static void main(String[] args)
    {
        new BallBounce();
    }

    /**
     * An inner class to model ball.
     */
    public class Ball {

        // Image for ball
        HTMLImageElement img;

        // Location of ball
        double x, y;

        // The ball velocity vector
        double vx = Math.random() * 10 - 5;
        double vy = Math.random() * 10 - 5;

        // The ball rotation
        double roll;

        /**
         * Create Ball.
         */
        public Ball(double aX, double aY)
        {
            x = aX;
            y = aY;
            img = (HTMLImageElement) HTMLDocument.getDocument().createElement("img");

            img.setSrc("http://reportmill.com/cj/PlayBall/Ball.png");
            //Blob blob = new Blob(getClass().getResourceAsStream("Ball.png"), "image/png");
            //String url = URL.createObjectURL(blob); img.setSrc(url);

            img.getStyle().setCssText("position:absolute;left:" + aX + "px;top:" + aY + "px;");
        }

        /**
         * Moves the ball.
         */
        public void moveBall()
        {
            x += vx;
            y += vy;
            roll += vx > 0 ? 4 : -4;

            // If ball hits wall, reflect velocity vector
            if (!contains(x, y, 40, 40)) {
                if (x < 0) {
                    x = 0;
                    vx = -vx;
                }
                else if (x + 40 > getWidth()) {
                    x = getWidth() - 40;
                    vx = -vx;
                }
                if (y < 0) {
                    y = 0;
                    vy = -vy;
                }
                else if (y + 40 > getHeight()) {
                    y = getHeight() - 40;
                    vy = -vy;
                }
            }

            // Move image
            int rot = (int) Math.round(roll);
            String str = "position:absolute;left:" + x + "px;top:" + y + "px;";
            str += "transform:rotate(" + rot + "deg);-webkit-transform:rotate(" + rot + "deg);";
            img.getStyle().setCssText(str);
        }
    }
}