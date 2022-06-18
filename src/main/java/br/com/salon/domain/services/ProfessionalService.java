package br.com.salon.domain.services;

import br.com.salon.domain.entities.Professional;
import br.com.salon.domain.ports.in.ProfessionalServicePort;
import br.com.salon.domain.ports.out.ProfessionalRepositoryPort;

import java.util.List;
import java.util.UUID;

public class ProfessionalService implements ProfessionalServicePort {

    public final ProfessionalRepositoryPort professionalRepository;

    public ProfessionalService(ProfessionalRepositoryPort professionalRepository){
        this.professionalRepository = professionalRepository;
    }

    @Override
    public Professional save(Professional person) {
        return null;
    }

    @Override
    public Professional update(Professional person) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public Professional findById(UUID id) {
        return null;
    }

    @Override
    public List<Professional> findAll() {
        return null;
    }
}
