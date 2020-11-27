package com.educ.api.domain.service;

import com.educ.api.domain.Subject;
import com.educ.api.domain.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAll(){
        return subjectRepository.getAll();
    }

    public Optional<Subject> getSubject(int subjectId){
        return subjectRepository.getSubject(subjectId);
    }

    public Optional<List<Subject>> getByLevel(int levelId ){
        return subjectRepository.getByLevel(levelId);
    }

    public Subject save(Subject subject){
        return subjectRepository.save(subject);
    }

    public boolean delete(int subjectId){
        return getSubject(subjectId).map(subject -> {
            subjectRepository.delete(subjectId);
            return true;
        }).orElse(false);
    }
}
