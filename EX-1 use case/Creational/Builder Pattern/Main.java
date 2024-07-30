public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .setColor("Red")
                .build();

        System.out.println(car);
    }
}
