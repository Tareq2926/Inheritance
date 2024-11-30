package E14;

public class Test {
    public static void main(String[] args) {
        BetterRectangle betterRectangle = new BetterRectangle(0,0,5,10);

        System.out.println("X: "+betterRectangle.getX()+"   Y:" + betterRectangle.getY()+"  Area:"+ betterRectangle.getArea()+"  Perimeter: " + betterRectangle.getPerimeter());
    }
}
