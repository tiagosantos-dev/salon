package br.com.salon.domain.services;

import br.com.salon.domain.entities.Person;
import br.com.salon.domain.entities.Procedure;
import br.com.salon.domain.ports.in.PersonServicePort;
import br.com.salon.domain.ports.in.ProcedureServicePort;
import br.com.salon.domain.ports.out.PersonRepositoryPort;
import br.com.salon.domain.ports.out.ProcedureRepositoryPort;

import java.util.List;
import java.util.UUID;

public class PersonService implements PersonServicePort {

    public final PersonRepositoryPort personRepository;

    public PersonService(PersonRepositoryPort personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Person findById(UUID id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }
}
