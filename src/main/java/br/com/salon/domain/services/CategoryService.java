package br.com.salon.domain.services;

import br.com.salon.domain.entities.Category;
import br.com.salon.domain.ports.in.CategoryServicePort;
import br.com.salon.domain.ports.out.CategoryRepositoryPort;

import java.util.List;
import java.util.UUID;

public class CategoryService implements CategoryServicePort {

    public final CategoryRepositoryPort categoryRepository;

    public CategoryService(CategoryRepositoryPort categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category save(Category person) {
        return null;
    }

    @Override
    public Category update(Category person) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Category findById(UUID id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }
}
