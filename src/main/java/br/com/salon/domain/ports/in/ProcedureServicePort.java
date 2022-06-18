package br.com.salon.domain.ports.in;

import br.com.salon.domain.entities.Procedure;

import java.util.List;
import java.util.UUID;

public interface ProcedureServicePort {

    Procedure save(Procedure person);

    Procedure update(Procedure person);

    void delete(UUID id);

    Procedure findById(UUID id);

    List<Procedure> findAll();

}
