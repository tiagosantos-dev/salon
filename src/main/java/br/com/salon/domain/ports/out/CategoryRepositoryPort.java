package br.com.salon.domain.ports.out;

import br.com.salon.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryRepositoryPort {

    Category save(Category category);

    Category update(Category category);

    void delete(Category category);

    Category findById(UUID id);

    List<Category> findAll();

}
