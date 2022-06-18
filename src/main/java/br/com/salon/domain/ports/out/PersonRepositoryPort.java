package br.com.salon.domain.ports.out;

import br.com.salon.domain.entities.Person;

public interface PersonRepositoryPort {

    Person save(Person person);

    Person update(Person person);

    void delete(Person person);

    Person findByCPF(String cpf);

}
