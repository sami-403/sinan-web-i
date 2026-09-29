package com.ifpb.cz.sinanapi.model.entity.enums;

public enum AgeUnit {
    HORA(1),
    DIA(2),
    MES(3),
    ANO(4);

    private final int code;

    AgeUnit(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}