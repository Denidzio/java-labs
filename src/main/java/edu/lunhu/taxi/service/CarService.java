package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.Car;
import edu.lunhu.taxi.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService  {

    private final CarRepository carRepository;

    public List<Car> getAll(Integer size, Integer page) {
        Pageable paging = PageRequest.of(page, size);
        var carList =  carRepository.findAll(paging);
        return carList.toList();
    }

    public Car getOne(Long id) {
        var car = carRepository.findById(id);
        return car.isEmpty() ? null : car.get();
    }

    public Car create(Car car) {
        return carRepository.save(car);
    }

    public Car update(Long id, Car car) {
        car.setId(id);
        return carRepository.save(car);
    }

    public Car delete(Long id) {
        var car = getOne(id);
        carRepository.deleteById(id);
        return car;
    }

}
