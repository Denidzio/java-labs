package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.Tariff;
import edu.lunhu.taxi.repository.TariffRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TariffService {

    private final TariffRepository tariffRepository;

    public List<Tariff> getAll() {
        return tariffRepository.findAll();
    }

    public Tariff getOne(Long id) {
        var tariff = tariffRepository.findById(id);
        return tariff.isEmpty() ? null : tariff.get();
    }

    public Tariff create(Tariff tariff) {
        return tariffRepository.save(tariff);
    }

    public Tariff update(Long id, Tariff tariff) {
        tariff.setId(id);
        return tariffRepository.save(tariff);
    }

    public Tariff delete(Long id) {
        var tariff = getOne(id);
        tariffRepository.deleteById(id);
        return tariff;
    }

}
