package com.educ.api.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "niveles")
public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nivel")
    private Integer idNivele;
    @Column(name = "nombre_nivel")
    private String nombreNivel;
    private String descripcion;
    private String complejidad;

    @OneToMany(mappedBy = "nivel")
    private List<Materia> materias;

    /*public List<Materia> getMaterias() {
        return materias;
    }*/

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Integer getIdNivele() {
        return idNivele;
    }

    public void setIdNivele(Integer idNivele) {
        this.idNivele = idNivele;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }
}
