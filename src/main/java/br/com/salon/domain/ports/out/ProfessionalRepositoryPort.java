package br.com.salon.domain.ports.out;

import br.com.salon.domain.entities.Person;
import br.com.salon.domain.entities.Professional;

public interface ProfessionalRepositoryPort {

    Professional save(Professional person);

    Professional update(Professional person);

    void delete(Professional person);

    Professional findByCPF(String cpf);

}
