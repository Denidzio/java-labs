package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.Driver;
import edu.lunhu.taxi.repository.DriverRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public List<Driver> getAll() {
        return driverRepository.findAll();
    }

    public Driver getOne(Long id) {
        var driver = driverRepository.findById(id);
        return driver.isEmpty() ? null : driver.get();
    }

    public Driver create(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver update(Long id, Driver driver) {
        driver.setId(id);
        return driverRepository.save(driver);
    }

    public Driver delete(Long id) {
        var driver = getOne(id);
        driverRepository.deleteById(id);
        return driver;
    }

}
