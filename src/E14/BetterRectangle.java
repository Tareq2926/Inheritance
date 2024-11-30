package E14;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    public int getPerimeter(){
        return 2*(width + height);
    }
    public int getArea(){
        return width * height;
    }
}
