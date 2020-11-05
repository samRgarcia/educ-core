package com.educ.api.persistence.crud;

import com.educ.api.persistence.entity.Materia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MateriaCrudRepository extends CrudRepository<Materia,Integer> {
    List<Materia> findByNivelesIdNivele(int nivelesIdNivele);
}
