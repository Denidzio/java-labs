package edu.lunhu.taxi.controller;

import edu.lunhu.taxi.entity.Service;
import edu.lunhu.taxi.service.ServiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("services")
@AllArgsConstructor
public class ServiceController {

    private final ServiceService serviceService;

    @GetMapping
    public List<Service> getAll() {
        return serviceService.getAll();
    }

    @GetMapping("/{id}")
    public Service getOne(@PathVariable Long id) {
        return serviceService.getOne(id);
    }

    @PostMapping
    public Service create(@RequestBody Service service) {
        return serviceService.create(service);
    }

    @PutMapping("/{id}")
    public Service update(@PathVariable Long id, @RequestBody Service service) {
        return serviceService.update(id, service);
    }

    @DeleteMapping("/{id}")
    public Service delete(@PathVariable Long id) {
        return serviceService.delete(id);
    }

}
