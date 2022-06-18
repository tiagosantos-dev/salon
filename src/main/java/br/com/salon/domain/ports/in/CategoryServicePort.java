package br.com.salon.domain.ports.in;

import br.com.salon.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryServicePort {

    Category save(Category person);

    Category update(Category person);

    void delete(UUID id);

    Category findById(UUID id);

    List<Category> findAll();

}
