package needForSpeed.entities.cars;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {

    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns = new ArrayList<>();
    }

    @Override
    public void tuneCar(int index, String addOn) {
        this.addOns.add(addOn);
        super.tuneCar(index, addOn);
    }

    @Override
    protected void setSuspension(int suspension) {
        int decreaseSubspension = suspension - ((suspension * 25) / 100);
        super.setSuspension(decreaseSubspension);
    }

    @Override
    protected void setHorsepower(int horsepower) {
        int increaseHoresepower = ((horsepower * 50) / 100) + horsepower;
        super.setHorsepower(increaseHoresepower);
    }

    @Override
    public String toString() {
        return String.format("%sAdd-ons: %s", super.toString(),
                this.addOns.size() == 0 ? "None" : String.join(", ", this.addOns));
    }
}
