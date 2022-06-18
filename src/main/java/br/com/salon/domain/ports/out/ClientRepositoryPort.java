package br.com.salon.domain.ports.out;

import br.com.salon.domain.entities.Client;

import java.util.List;
import java.util.UUID;

public interface ClientRepositoryPort {

    Client save(Client client);

    Client update(Client client);

    void delete(UUID id);

    Client findById(UUID id);

    List<Client> findAll();

}
