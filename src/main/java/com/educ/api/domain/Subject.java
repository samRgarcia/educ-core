package com.educ.api.domain;

import com.educ.api.persistence.entity.Nivel;

public class Subject {
    private int idSubject;
    private String nameSubject;
    private int levelIdLevel;
    private Nivel nivel;



    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getLevelIdLevel() {
        return levelIdLevel;
    }

    public void setLevelIdLevel(int levelIdLevel) {
        this.levelIdLevel = levelIdLevel;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

}
