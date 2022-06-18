package br.com.salon.domain.entities;

import java.util.Objects;
import java.util.UUID;

public class Category {

    private UUID id;
    private String name;
    private String tag;
    private String color;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name) && Objects.equals(tag, category.tag) && Objects.equals(color, category.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tag, color);
    }
}
