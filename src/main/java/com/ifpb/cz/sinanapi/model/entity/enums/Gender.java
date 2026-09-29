package com.ifpb.cz.sinanapi.model.entity.enums;

public enum Gender {
    M("Masculino"),
    F("Feminino"),
    I("Ignorado");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}