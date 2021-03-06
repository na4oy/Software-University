package needForSpeed.entities.races;

import needForSpeed.entities.cars.Car;

public class DragRace extends Race {

    public DragRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public int calculatePoints(Car car) {
        return car.getHorsepower() / car.getAcceleration();
    }
}
