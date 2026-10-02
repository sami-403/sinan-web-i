package com.ifpb.cz.sinanapi.model.entity.enums;

public enum Zone {
    URBANA(1),
    RURAL(2),
    PERIURBANA(3),
    IGNORADO(9);

    private final Integer code;
    Zone(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
