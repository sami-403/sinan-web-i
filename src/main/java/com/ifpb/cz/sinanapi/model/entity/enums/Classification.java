package com.ifpb.cz.sinanapi.model.entity.enums;

public enum Classification {

    COMFIRMADO(1),
    DESCARTADO(2);

    private final Integer code;

    Classification(Integer code){
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }
}
