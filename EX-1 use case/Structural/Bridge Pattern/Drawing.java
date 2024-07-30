import java.util.Scanner;

public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose API (1 or 2):");
        DrawingAPI drawingAPI = (scanner.nextInt() == 1) ? new DrawingAPI1() : new DrawingAPI2();
        
        System.out.println("Choose shape (1. Circle, 2. Square):");
        Shape shape = null;
        switch (scanner.nextInt()) {
            case 1:
                System.out.print("Enter x, y, radius: ");
                shape = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), drawingAPI);
                break;
            case 2:
                System.out.print("Enter x, y, side length: ");
                shape = new Square(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), drawingAPI);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        
        shape.draw();
        scanner.close();
    }
}
