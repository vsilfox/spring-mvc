package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Kia Rio 1.4", 1110022993388L, 1396));
        cars.add(new Car("Mazda 2 1.5", 9996677726351L, 1496));
        cars.add(new Car("BMW i3", 198273654788L, 647));
        cars.add(new Car("Ford Focus 1.0", 9076546787L, 998));
        cars.add(new Car("Ford Kuga 1.5 Tdci", 112233445566L, 1499));
    }

    public List<Car> getCars(Integer count) {
        if (count == null) {
            return cars;
        } else {
            return cars.stream()
                    .limit(count)
                    .toList();
        }
    }
}
