package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.ClientClass;
import edu.lunhu.taxi.repository.ClientClassRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientClassService {

    private final ClientClassRepository clientClassRepository;

    public List<ClientClass> getAll() {
        return clientClassRepository.findAll();
    }

    public ClientClass getOne(Long id) {
        var clientClass = clientClassRepository.findById(id);
        return clientClass.isEmpty() ? null : clientClass.get();
    }

    public ClientClass create(ClientClass clientClass) {
        return clientClassRepository.save(clientClass);
    }

    public ClientClass update(Long id, ClientClass clientClass) {
        clientClass.setId(id);
        return clientClassRepository.save(clientClass);
    }

    public ClientClass delete(Long id) {
        var clientClass = getOne(id);
        clientClassRepository.deleteById(id);
        return clientClass;
    }

}
