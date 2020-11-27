package com.educ.api.domain;

public class Level {
    private int idLevel;
    private String nameLevel;
    private String description;
    private String complexity;

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

}
