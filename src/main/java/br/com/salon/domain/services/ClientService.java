package br.com.salon.domain.services;

import br.com.salon.domain.entities.Client;
import br.com.salon.domain.ports.in.ClientServicePort;
import br.com.salon.domain.ports.out.ClientRepositoryPort;

import java.util.List;
import java.util.UUID;

public class ClientService implements ClientServicePort {

    public final ClientRepositoryPort clientRepository;

    public ClientService(ClientRepositoryPort clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.update(client);
    }

    @Override
    public void delete(UUID id) {
        clientRepository.delete(id);
    }

    @Override
    public Client findById(UUID id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }
}
