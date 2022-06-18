package br.com.salon.domain.services;

import br.com.salon.domain.entities.Procedure;
import br.com.salon.domain.ports.in.ProcedureServicePort;
import br.com.salon.domain.ports.out.ProcedureRepositoryPort;

import java.util.List;
import java.util.UUID;

public class ProcedureService implements ProcedureServicePort {


    public final ProcedureRepositoryPort procedureRepository;

    public ProcedureService(ProcedureRepositoryPort procedureRepository){
        this.procedureRepository = procedureRepository;
    }

    @Override
    public Procedure save(Procedure person) {
        return procedureRepository.save(person);
    }

    @Override
    public Procedure update(Procedure person) {
        return procedureRepository.save(person);
    }

    @Override
    public void delete(UUID id) {
        procedureRepository.delete(id);
    }

    @Override
    public Procedure findById(UUID id) {
        return procedureRepository.findById(id);
    }

    @Override
    public List<Procedure> findAll() {
        return procedureRepository.findAll();
    }
}
