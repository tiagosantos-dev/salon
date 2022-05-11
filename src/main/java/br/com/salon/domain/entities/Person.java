package br.com.salon.domain.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private Long id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private LocalDate birthdate;

    public Person(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getName(), person.getName()) && Objects.equals(getCpf(), person.getCpf()) && Objects.equals(getPhone(), person.getPhone()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getBirthdate(), person.getBirthdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCpf(), getPhone(), getEmail(), getBirthdate());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
