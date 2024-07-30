public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

    @Override
    public double getCost() {
        return car.getCost();
    }
}
