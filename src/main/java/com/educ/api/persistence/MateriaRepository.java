package com.educ.api.persistence;

import com.educ.api.persistence.crud.MateriaCrudRepository;
import com.educ.api.persistence.entity.Materia;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MateriaRepository {
    private MateriaCrudRepository materiaCrudRepository;

    public List<Materia> getAll(){
        return (List<Materia>) materiaCrudRepository.findAll();
    }

    public List<Materia> getByMaterias(int idMateria){
        return materiaCrudRepository.findByNivelesIdNivele(idMateria);
    }

    public Optional<Materia> getMateria(int idMateria){
        return materiaCrudRepository.findById(idMateria);
    }

    public  Materia save(Materia materia){
        return materiaCrudRepository.save(materia);
    }

    public void delete(int idMateria){
        materiaCrudRepository.deleteById(idMateria);
    }
}
