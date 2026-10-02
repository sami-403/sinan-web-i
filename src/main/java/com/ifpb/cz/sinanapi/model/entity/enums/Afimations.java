package com.ifpb.cz.sinanapi.model.entity.enums;

public enum Afimations {
    SIM(1),
    NAO(2),
    INDETERMIDO(2);

    private final Integer code;

    Afimations(Integer code){
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }
}
