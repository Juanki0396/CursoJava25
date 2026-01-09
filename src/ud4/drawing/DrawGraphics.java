package ud4.drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<ClosingEye> eyes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(2, 2);
        eyes = new ArrayList<>();
        eyes.add(new ClosingEye(50, 150, 100));
        eyes.add(new ClosingEye(150, 150, 100));
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        box.draw(surface);
        eyes.forEach(e -> {e.draw(surface);});
        surface.drawArc(100, 100, 100, 100, 60, 0);
    }
}
