package com.ifpb.cz.sinanapi.model.entity.enums;

public enum RaceOrColor {
    BRANCA(1),
    PRETA(2),
    AMARELA(3),
    PARDA(4),
    INDIGENA(5),
    IGNORADO(9);

    private final Integer code;

    RaceOrColor(Integer code) {
        this.code = code;
    }
}
