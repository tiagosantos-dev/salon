package br.com.salon.domain.entities;

import java.util.Objects;

public class Professional {

    private Long id;
    private Person person;

    public Long getId() {
        return id;
    }
    public Person getPerson(){
        return person;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professional that = (Professional) o;
        return Objects.equals(id, that.id) && Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person);
    }
}
