package com.ifpb.cz.sinanapi.model.entity;

import com.ifpb.cz.sinanapi.model.entity.enums.FederativeUnit;
import com.ifpb.cz.sinanapi.model.entity.enums.NotificationType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Embeddable
public class GeneralData {

    @Enumerated(EnumType.ORDINAL)
    private NotificationType type;

    private String agravo;
    private String cid;
    private LocalDate notificationDate;

    @Enumerated(EnumType.STRING)
    private FederativeUnit notifyingUf;

    private String notifyingMunicipe;
    private Integer notifyingIbgeCode;
    private String notificationSource;
    private Integer cnes;
    private LocalDate symptomStartDate;

    public GeneralData() {
    }

    public GeneralData(NotificationType type, String agravo, String cid, LocalDate notificationDate, FederativeUnit notifyingUf, String notifyingMunicipe, Integer notifyingIbgeCode, String notificationSource) {
        this.type = type;
        this.agravo = agravo;
        this.cid = cid;
        this.notificationDate = notificationDate;
        this.notifyingUf = notifyingUf;
        this.notifyingMunicipe = notifyingMunicipe;
        this.notifyingIbgeCode = notifyingIbgeCode;
        this.notificationSource = notificationSource;
    }


    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public String getAgravo() {
        return agravo;
    }

    public void setAgravo(String agravo) {
        this.agravo = agravo;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public LocalDate getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(LocalDate notificationDate) {
        this.notificationDate = notificationDate;
    }

    public FederativeUnit getNotifyingUf() {
        return notifyingUf;
    }

    public void setNotifyingUf(FederativeUnit notifyingUf) {
        this.notifyingUf = notifyingUf;
    }

    public String getNotifyingMunicipe() {
        return notifyingMunicipe;
    }

    public void setNotifyingMunicipe(String notifyingMunicipe) {
        this.notifyingMunicipe = notifyingMunicipe;
    }

    public Integer getNotifyingIbgeCode() {
        return notifyingIbgeCode;
    }

    public void setNotifyingIbgeCode(Integer notifyingIbgeCode) {
        this.notifyingIbgeCode = notifyingIbgeCode;
    }

    public String getNotificationSource() {
        return notificationSource;
    }

    public void setNotificationSource(String notificationSource) {
        this.notificationSource = notificationSource;
    }

    public Integer getCnes() {
        return cnes;
    }

    public void setCnes(Integer cnes) {
        this.cnes = cnes;
    }

    public LocalDate getSymptomStartDate() {
        return symptomStartDate;
    }

    public void setSymptomStartDate(LocalDate symptomStartDate) {
        this.symptomStartDate = symptomStartDate;
    }
}