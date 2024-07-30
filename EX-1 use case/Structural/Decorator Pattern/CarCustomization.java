import java.util.Scanner;

public class CarCustomization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new BasicCar();
        String[] options = {
            "1. Sunroof ($1500)",
            "2. Leather Seats ($1200)",
            "3. Premium Sound System ($800)"
        };

        System.out.println("Welcome to the Car Customization Shop!");
        System.out.println("Choose add-ons for your car:");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Enter the numbers of your choices separated by space (e.g., 1 2):");

        String[] choices = scanner.nextLine().split(" ");
        for (String choice : choices) {
            switch (choice) {
                case "1": car = new SunroofDecorator(car); break;
                case "2": car = new LeatherSeatsDecorator(car); break;
                case "3": car = new PremiumSoundSystemDecorator(car); break;
                default: System.out.println("Invalid choice: " + choice);
            }
        }

        System.out.println("Your customized car: " + car.getDescription());
        System.out.println("Total cost: $" + car.getCost());

        scanner.close();
    }
}
