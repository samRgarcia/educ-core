package com.educ.api.persistence;

import com.educ.api.domain.Subject;
import com.educ.api.domain.repository.SubjectRepository;
import com.educ.api.persistence.crud.MateriaCrudRepository;
import com.educ.api.persistence.entity.Materia;
import com.educ.api.persistence.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MateriaRepository implements SubjectRepository {
    @Autowired
    private MateriaCrudRepository materiaCrudRepository;
    @Autowired
    private SubjectMapper mapper;

    @Override
    public List<Subject> getAll(){
    List<Materia> materias=(List<Materia>) materiaCrudRepository.findAll();
        return mapper.toSubjects(materias);
    }

    @Override
    public Optional<List<Subject>> getByLevel(int levelId){
        List<Materia> materias =materiaCrudRepository.findByNivelesIdNivele(levelId);
        return Optional.of(mapper.toSubjects(materias));
    }

    @Override
    public Optional<Subject> getSubject(int subjectId){
        return materiaCrudRepository.findById(subjectId).map(materia -> mapper.toSubject(materia));
    }

    public Subject save(Subject subject){
        Materia materia = mapper.toMateria(subject);
        return mapper.toSubject(materiaCrudRepository.save(materia));
    }

    @Override
    public void delete(int subjectId){
        materiaCrudRepository.deleteById(subjectId);
    }

    /* public Optional<Materia> getMateria(int idMateria){
        return materiaCrudRepository.findById(idMateria);
    }

   public  Materia save(Subject subject){
        return materiaCrudRepository.save(subject);
    }
    public void delete(int idMateria){
        materiaCrudRepository.deleteById(idMateria);
    }*/
}
