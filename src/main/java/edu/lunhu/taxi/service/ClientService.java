package edu.lunhu.taxi.service;

import edu.lunhu.taxi.dto.ClientOrderDto;
import edu.lunhu.taxi.entity.Client;
import edu.lunhu.taxi.repository.ClientRepository;
import edu.lunhu.taxi.utils.MappingUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final OrderService orderService;
    private final MappingUtils mappingUtils;

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getOne(Long id) {
        var client = clientRepository.findById(id);
        return client.isEmpty() ? null : client.get();
    }

    public Client create(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Long id, Client client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    public Client delete(Long id) {
        var client = getOne(id);
        clientRepository.deleteById(id);
        return client;
    }

    public ClientOrderDto makeOrder() {
        var orders = orderService.getAll();

        if(orders.isEmpty()) {
            return null;
        }

        return mappingUtils.mapToClientOrderDto(orders.get(0));

    }

}
