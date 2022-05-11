package br.com.salon.domain.ports;

import br.com.salon.domain.entities.Person;

public interface PersonPortRepository {

    Person save(Person person);

    Person update(Person person);

    void delete(Person person);

    Person findByCPF(String cpf);

}
