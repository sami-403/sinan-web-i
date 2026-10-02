package com.ifpb.cz.sinanapi.model.entity.enums;

public enum PregnancyStatus {
    PRIMERIO_TRIMESTRE(1),
    SEGUNDO_TRIMESTRE(2),
    TERCEIRO_TRIMESTRE(3),
    IDADE_IGNORADA(4),
    NAO(5),
    NAO_SE_APLICA(6),
    IGNORADO(9);

    private final int code;

    PregnancyStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
