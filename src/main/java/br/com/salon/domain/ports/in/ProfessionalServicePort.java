package br.com.salon.domain.ports.in;

import br.com.salon.domain.entities.Person;
import br.com.salon.domain.entities.Professional;

import java.util.List;
import java.util.UUID;

public interface ProfessionalServicePort {

    Professional save(Professional person);

    Professional update(Professional person);

    void delete(UUID id);

    Professional findById(UUID id);

    List<Professional> findAll();

}
