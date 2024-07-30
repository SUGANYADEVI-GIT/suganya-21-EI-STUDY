public class DrawingAPI1 implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.println("DrawingAPI1: Circle at (" + x + ", " + y + ") with radius " + radius);
    }
    public void drawSquare(double x, double y, double sideLength) {
        System.out.println("DrawingAPI1: Square at (" + x + ", " + y + ") with side length " + sideLength);
    }
}
