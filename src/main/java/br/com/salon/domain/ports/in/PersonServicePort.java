package br.com.salon.domain.ports.in;

import br.com.salon.domain.entities.Person;

import java.util.List;
import java.util.UUID;

public interface PersonServicePort {

    Person save(Person person);

    Person update(Person person);

    void delete(UUID id);

    Person findById(UUID id);

    List<Person> findAll();

}
