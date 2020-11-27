package com.educ.api.persistence.mapper;

import com.educ.api.domain.Level;
import com.educ.api.persistence.entity.Nivel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LevelMapper {
    @Mappings({
            @Mapping(source = "idNivele", target = "idLevel"),
            @Mapping(source = "nombreNivel", target = "nameLevel"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "complejidad", target = "complexity")


    })

    Level toLevel(Nivel nivel);
    @InheritInverseConfiguration
    @Mapping(target = "materias",ignore = true)
    Nivel toNivel(Level level);

}

