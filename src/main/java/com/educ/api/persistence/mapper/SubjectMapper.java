package com.educ.api.persistence.mapper;


import com.educ.api.domain.Subject;
import com.educ.api.persistence.entity.Materia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {LevelMapper.class})
public interface SubjectMapper {
    @Mappings({
            @Mapping(source = "idMateria",target = "idSubject"),
            @Mapping(source = "nombreMateria",target = "nameSubject"),
            @Mapping(source = "nivelesIdNivele",target = "levelIdLevel"),
            @Mapping(source = "nivel",target = "nivel")
    })
    Subject toSubject(Materia materia);
    List<Subject> toSubjects(List<Materia> materias);
    @InheritInverseConfiguration
    Materia toMateria(Subject subject);
}
