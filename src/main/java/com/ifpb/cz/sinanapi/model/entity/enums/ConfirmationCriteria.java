package com.ifpb.cz.sinanapi.model.entity.enums;

public enum ConfirmationCriteria {
    LABORATORIAL(1),
    CLINICO_EPIDEMIOLOGICO(2);

    private final Integer code;

    ConfirmationCriteria(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
