package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.Service;
import edu.lunhu.taxi.repository.ServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.util.Streamable;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public List<Service> getAll() {
        return serviceRepository.findAll();
    }

    public Service getOne(Long id) {
        var service = serviceRepository.findById(id);
        return service.isEmpty() ? null : service.get();
    }

    public Service create(Service service) {
        return serviceRepository.save(service);
    }

    public Service update(Long id, Service service) {
        service.setId(id);
        return serviceRepository.save(service);
    }

    public Service delete(Long id) {
        var service = getOne(id);
        serviceRepository.deleteById(id);
        return service;
    }

}
