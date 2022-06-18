package br.com.salon.domain.ports.out;

import br.com.salon.domain.entities.Procedure;

import java.util.List;
import java.util.UUID;

public interface ProcedureRepositoryPort {

    Procedure save(Procedure procedure);

    Procedure update(Procedure procedure);

    void delete(UUID id);

    Procedure findById(UUID id);

    List<Procedure> findAll();

}
