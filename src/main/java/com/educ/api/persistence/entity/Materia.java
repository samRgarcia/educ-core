package com.educ.api.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Integer idMateria;
    @Column(name = "nombre_materia")
    private String nombreMateria;
    @Column(name = "niveles_id_nivele")
    private Integer nivelesIdNivele;

    @ManyToOne
    @JoinColumn(name = "id_nivel", insertable = false,updatable = false)
    private Nivel nivel;

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Integer getNivelesIdNivele() {
        return nivelesIdNivele;
    }

    public void setNivelesIdNivele(Integer nivelesIdNivele) {
        this.nivelesIdNivele = nivelesIdNivele;
    }
}
