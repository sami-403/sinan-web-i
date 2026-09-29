package com.ifpb.cz.sinanapi.model.entity.enums;

public enum SchoolLevels {
    ANALFABETO(0),
    PRIMEIRA_A_QUARTA_INCOMPLETO_EF(1),
    QUARTA_COMPLETA_EF(2),
    QUINTA_A_OITAVA_INCOMPLETO_EF(3),
    ENSINO_FUNDAMENTAL_COMPLETO(4),
    ENSINO_MEDIO_INCOMPRETO(5),
    ENSINO_MEDIO_COMPLETO(6),
    EDUCACAO_SUPERIOR_INCOMPLETA(7),
    EDUCACAO_SUPERIOR_COMPLETA(8),
    IGNORADO(9),
    NAO_SE_APLICA(10);

    private final int codigo;

    SchoolLevels(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

}
