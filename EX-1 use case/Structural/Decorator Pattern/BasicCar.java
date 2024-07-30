public class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 20000.00;
    }
}
