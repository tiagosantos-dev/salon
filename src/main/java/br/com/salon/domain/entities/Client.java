package br.com.salon.domain.entities;

import java.util.Objects;

public class Client {

    private Long id;

    private Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId()) && Objects.equals(getPerson(), client.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPerson());
    }


}
