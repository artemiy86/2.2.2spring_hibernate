package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarServiceImpl implements CarService{

    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl(){
        cars.add(new Car("vaz",111,"white"));
        cars.add(new Car("gaz",222,"black"));
        cars.add(new Car("uaz",333,"red"));
        cars.add(new Car("taz",444,"yellow"));
        cars.add(new Car("kraz",555,"grey"));
    }

    @Override
    public List<Car> getCarList(int count) {
        List<Car> newCars = new ArrayList<>();
        for(int i=0; i<count; i++){
            newCars.add(cars.get(i));
        }
        return newCars;
    }
}
