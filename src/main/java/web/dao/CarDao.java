package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDao {
    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "Black", 800));
        cars.add(new Car("KIA", "Red", 900));
        cars.add(new Car("Cherry", "Yellow", 300));
        cars.add(new Car("Toyota", "Purple", 500));
        cars.add(new Car("Audi", "Orange", 600));

        if (count == null) count = 0;

        if (count > 0 && count < 5) {
            cars = cars.stream().limit(count).collect(Collectors.toCollection(ArrayList::new));
        }

        return cars;
    }
}
