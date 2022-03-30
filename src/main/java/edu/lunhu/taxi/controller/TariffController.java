package edu.lunhu.taxi.controller;

import edu.lunhu.taxi.entity.Tariff;
import edu.lunhu.taxi.service.TariffService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tariffs")
@AllArgsConstructor
public class TariffController {

    private final TariffService tariffService;

    @GetMapping
    public List<Tariff> getAll() {
        return tariffService.getAll();
    }

    @GetMapping("/{id}")
    public Tariff getOne(@PathVariable Long id) {
        return tariffService.getOne(id);
    }

    @PostMapping
    public Tariff create(@RequestBody Tariff tariff) {
        return tariffService.create(tariff);
    }

    @PutMapping("/{id}")
    public Tariff update(@PathVariable Long id, @RequestBody Tariff tariff) {
        return tariffService.update(id, tariff);
    }

    @DeleteMapping("/{id}")
    public Tariff delete(@PathVariable Long id) {
        return tariffService.delete(id);
    }

}
