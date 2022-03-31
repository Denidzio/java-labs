package edu.lunhu.taxi.controller;

import edu.lunhu.taxi.entity.Car;
import edu.lunhu.taxi.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<Car> getAll(@RequestParam(required = false, defaultValue = "10") Integer size,
                            @RequestParam(required = false, defaultValue = "0") Integer page,
                            @RequestParam(required = false, defaultValue = "") String model) {
        return carService.getAll(size, page, model);
    }

    @GetMapping("/{id}")
    public Car getOne(@PathVariable Long id) {
        return carService.getOne(id);
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carService.create(car);
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable Long id, @RequestBody Car car) {
        return carService.update(id, car);
    }

    @DeleteMapping("/{id}")
    public Car delete(@PathVariable Long id) {
        return carService.delete(id);
    }

}
