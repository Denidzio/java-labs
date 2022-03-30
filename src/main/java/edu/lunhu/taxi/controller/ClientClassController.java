package edu.lunhu.taxi.controller;

import edu.lunhu.taxi.entity.ClientClass;
import edu.lunhu.taxi.service.ClientClassService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client-classes")
@AllArgsConstructor
public class ClientClassController {

    private final ClientClassService clientClassService;

    @GetMapping
    public List<ClientClass> getAll() {
        return clientClassService.getAll();
    }

    @GetMapping("/{id}")
    public ClientClass getOne(@PathVariable Long id) {
        return clientClassService.getOne(id);
    }

    @PostMapping
    public ClientClass create(@RequestBody ClientClass clientClass) {
        return clientClassService.create(clientClass);
    }

    @PutMapping("/{id}")
    public ClientClass update(@PathVariable Long id, @RequestBody ClientClass clientClass) {
        return clientClassService.update(id, clientClass);
    }

    @DeleteMapping("/{id}")
    public ClientClass delete(@PathVariable Long id) {
        return clientClassService.delete(id);
    }

}
