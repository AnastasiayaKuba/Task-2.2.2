package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {



    private List<Car> cars;
    public CarService() {
        cars  = new ArrayList<>();
        cars.add(new Car("Toyota", "white", 2010));
        cars.add(new Car("Volkswagen", "grey", 2019));
        cars.add(new Car("Lada", "black", 2012));
        cars.add(new Car("BMW", "blue", 2024));
        cars.add(new Car("Mercedes", "red", 1998));


    }

    public List<Car> getCars(int count) {
        if (count > 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
