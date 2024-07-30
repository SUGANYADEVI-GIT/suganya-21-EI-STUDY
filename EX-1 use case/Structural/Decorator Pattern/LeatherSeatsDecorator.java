public class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Leather Seats";
    }

    @Override
    public double getCost() {
        return car.getCost() + 1200.00;
    }
}
