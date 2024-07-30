public class SunroofDecorator extends CarDecorator {
    public SunroofDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Sunroof";
    }

    @Override
    public double getCost() {
        return car.getCost() + 1500.00;
    }
}
