package com.educ.api.domain.repository;

import com.educ.api.domain.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository{
    List<Subject> getAll();
    Optional<List<Subject>> getByLevel(int levelId );

    Optional<Subject> getSubject(int subjectId);
    Subject save(Subject subject);
    void delete(int subjectId);
}
