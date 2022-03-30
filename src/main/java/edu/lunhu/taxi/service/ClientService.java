package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.Client;
import edu.lunhu.taxi.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

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

}
