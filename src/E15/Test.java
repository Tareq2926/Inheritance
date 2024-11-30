package E15;

import E14.BetterRectangle;

public class Test {
    public static void main(String[] args) {
        E14.BetterRectangle betterRectangle = new BetterRectangle(0,0,5,10);

        System.out.println("X: "+betterRectangle.getX()+"   Y:" + betterRectangle.getY()+"  Area:"+ betterRectangle.getArea()+"  Perimeter: " + betterRectangle.getPerimeter());

    }
}
