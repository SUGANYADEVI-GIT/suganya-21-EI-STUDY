public class PremiumSoundSystemDecorator extends CarDecorator {
    public PremiumSoundSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Premium Sound System";
    }

    @Override
    public double getCost() {
        return car.getCost() + 800.00;
    }
}
