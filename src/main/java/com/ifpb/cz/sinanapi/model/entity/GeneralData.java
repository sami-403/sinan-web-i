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
    private FederativeUnit federativeUnit;

    private String municipe;
    private Integer ibgeCode;
    private String notificationSource;
    private Integer cnes;
    private LocalDate symptomStartDate;

    public GeneralData() {
    }

    public GeneralData(NotificationType type, String agravo, String cid, LocalDate notificationDate, FederativeUnit federativeUnit, String municipe, Integer ibgeCode, String notificationSource) {
        this.type = type;
        this.agravo = agravo;
        this.cid = cid;
        this.notificationDate = notificationDate;
        this.federativeUnit = federativeUnit;
        this.municipe = municipe;
        this.ibgeCode = ibgeCode;
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

    public FederativeUnit getFederativeUnit() {
        return federativeUnit;
    }

    public void setFederativeUnit(FederativeUnit federativeUnit) {
        this.federativeUnit = federativeUnit;
    }

    public String getMunicipe() {
        return municipe;
    }

    public void setMunicipe(String municipe) {
        this.municipe = municipe;
    }

    public Integer getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(Integer ibgeCode) {
        this.ibgeCode = ibgeCode;
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