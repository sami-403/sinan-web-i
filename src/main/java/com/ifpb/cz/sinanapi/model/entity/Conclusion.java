package com.ifpb.cz.sinanapi.model.entity;

import com.ifpb.cz.sinanapi.model.entity.enums.*;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Embeddable
public class Conclusion {
    private LocalDate invetigationDate;

    @Enumerated(EnumType.ORDINAL)
    private Classification finalClassification;

    @Enumerated(EnumType.ORDINAL)
    private ConfirmationCriteria confirmationCriteria;

    @Enumerated(EnumType.ORDINAL)
    private Afimations fomTheResidenceMunice;

    @Enumerated(EnumType.STRING)
    private FederativeUnit uf;
    private String contry;

    private String municipe;

    private Integer ibgeCode;
    private String district;

    private String neighbo;

    @Enumerated(EnumType.ORDINAL)
    private Afimations workRalationedDisease;

    @Enumerated(EnumType.ORDINAL)
    private CaseEvolutioin caseEvolutioin;

    private LocalDate deathDate;

    private LocalDate endedDate;

    public Conclusion(){


    }

    public Conclusion(LocalDate invetigationDate, Classification finalClassification, ConfirmationCriteria confirmationCriteria, Afimations fomTheResidenceMunice, FederativeUnit uf, String contry, String municipe, Integer ibgeCode, String district, String neighbo, Afimations workRalationedDisease, CaseEvolutioin caseEvolutioin, LocalDate deathDate, LocalDate endedDate) {
        this.invetigationDate = invetigationDate;
        this.finalClassification = finalClassification;
        this.confirmationCriteria = confirmationCriteria;
        this.fomTheResidenceMunice = fomTheResidenceMunice;
        this.uf = uf;
        this.contry = contry;
        this.municipe = municipe;
        this.ibgeCode = ibgeCode;
        this.district = district;
        this.neighbo = neighbo;
        this.workRalationedDisease = workRalationedDisease;
        this.caseEvolutioin = caseEvolutioin;
        this.deathDate = deathDate;
        this.endedDate = endedDate;
    }

    public LocalDate getInvetigationDate() {
        return invetigationDate;
    }

    public void setInvetigationDate(LocalDate invetigationDate) {
        this.invetigationDate = invetigationDate;
    }

    public Classification getFinalClassification() {
        return finalClassification;
    }

    public void setFinalClassification(Classification finalClassification) {
        this.finalClassification = finalClassification;
    }

    public ConfirmationCriteria getConfirmationCriteria() {
        return confirmationCriteria;
    }

    public void setConfirmationCriteria(ConfirmationCriteria confirmationCriteria) {
        this.confirmationCriteria = confirmationCriteria;
    }

    public Afimations getFomTheResidenceMunice() {
        return fomTheResidenceMunice;
    }

    public void setFomTheResidenceMunice(Afimations fomTheResidenceMunice) {
        this.fomTheResidenceMunice = fomTheResidenceMunice;
    }

    public FederativeUnit getUf() {
        return uf;
    }

    public void setUf(FederativeUnit uf) {
        this.uf = uf;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbo() {
        return neighbo;
    }

    public void setNeighbo(String neighbo) {
        this.neighbo = neighbo;
    }

    public Afimations getWorkRalationedDisease() {
        return workRalationedDisease;
    }

    public void setWorkRalationedDisease(Afimations workRalationedDisease) {
        this.workRalationedDisease = workRalationedDisease;
    }

    public CaseEvolutioin getCaseEvolutioin() {
        return caseEvolutioin;
    }

    public void setCaseEvolutioin(CaseEvolutioin caseEvolutioin) {
        this.caseEvolutioin = caseEvolutioin;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public LocalDate getEndedDate() {
        return endedDate;
    }

    public void setEndedDate(LocalDate endedDate) {
        this.endedDate = endedDate;
    }
}
