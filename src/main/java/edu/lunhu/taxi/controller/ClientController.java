package edu.lunhu.taxi.controller;

import edu.lunhu.taxi.dto.ClientOrderDto;
import edu.lunhu.taxi.entity.Client;
import edu.lunhu.taxi.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable Long id) {
        return clientService.getOne(id);
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @PutMapping("/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client) {
        return clientService.update(id, client);
    }

    @DeleteMapping("/{id}")
    public Client delete(@PathVariable Long id) {
        return clientService.delete(id);
    }

    @GetMapping("/order")
    public ClientOrderDto makeOrder() {
        return clientService.makeOrder();
    }

}
