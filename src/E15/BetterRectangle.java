package E15;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public int getPerimeter(){
        return 2*(width + height);
    }
    public int getArea(){
        return width * height;
    }
}
