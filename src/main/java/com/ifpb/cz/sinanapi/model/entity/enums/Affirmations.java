package com.ifpb.cz.sinanapi.model.entity.enums;

public enum Affirmations {
    SIM(1),
    NAO(2),
    INDETERMINADO(3);

    private final Integer code;

    Affirmations(Integer code){
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }
}
