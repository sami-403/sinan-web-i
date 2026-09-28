package com.ifpb.cz.sinanapi.model.entity.enums;

public enum NotificationType {
    NEGATIVA(1),
    INDIVIDUAL(2),
    SURTO(3),
    TRACOMA(4);

    private final  int code;

    NotificationType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }


}
