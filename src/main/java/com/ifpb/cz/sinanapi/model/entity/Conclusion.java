package com.ifpb.cz.sinanapi.model.entity;

import com.ifpb.cz.sinanapi.model.entity.enums.*;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Embeddable
public class Conclusion {
    private LocalDate investigationDate;

    @Enumerated(EnumType.ORDINAL)
    private Classification finalClassification;

    @Enumerated(EnumType.ORDINAL)
    private ConfirmationCriteria confirmationCriteria;

    @Enumerated(EnumType.ORDINAL)
    private Affirmations fromResidenceMunicipality;

    @Enumerated(EnumType.STRING)
    private FederativeUnit uf;
    private String conutry;

    private String municipe;

    private Integer ibgeCode;
    private String district;

    private String neighbo;

    @Enumerated(EnumType.ORDINAL)
    private Affirmations workRalationedDisease;

    @Enumerated(EnumType.ORDINAL)
    private CaseEvolution caseEvolution;

    private LocalDate deathDate;

    private LocalDate endedDate;

    public Conclusion(){


    }

    public Conclusion(LocalDate investigationDate, Classification finalClassification, ConfirmationCriteria confirmationCriteria, Affirmations fromResidenceMunicipality, FederativeUnit uf, String conutry, String municipe, Integer ibgeCode, String district, String neighbo, Affirmations workRalationedDisease, CaseEvolution caseEvolution, LocalDate deathDate, LocalDate endedDate) {
        this.investigationDate = investigationDate;
        this.finalClassification = finalClassification;
        this.confirmationCriteria = confirmationCriteria;
        this.fromResidenceMunicipality = fromResidenceMunicipality;
        this.uf = uf;
        this.conutry = conutry;
        this.municipe = municipe;
        this.ibgeCode = ibgeCode;
        this.district = district;
        this.neighbo = neighbo;
        this.workRalationedDisease = workRalationedDisease;
        this.caseEvolution = caseEvolution;
        this.deathDate = deathDate;
        this.endedDate = endedDate;
    }

    public LocalDate getInvetigationDate() {
        return investigationDate;
    }

    public void setInvetigationDate(LocalDate investigationDate) {
        this.investigationDate = investigationDate;
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

    public Affirmations getFromResidenceMunicipality() {
        return fromResidenceMunicipality;
    }

    public void setFromResidenceMunicipality(Affirmations fromResidenceMunicipality) {
        this.fromResidenceMunicipality = fromResidenceMunicipality;
    }

    public FederativeUnit getUf() {
        return uf;
    }

    public void setUf(FederativeUnit uf) {
        this.uf = uf;
    }

    public String getConutry() {
        return conutry;
    }

    public void setConutry(String conutry) {
        this.conutry = conutry;
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

    public Affirmations getWorkRalationedDisease() {
        return workRalationedDisease;
    }

    public void setWorkRalationedDisease(Affirmations workRalationedDisease) {
        this.workRalationedDisease = workRalationedDisease;
    }

    public CaseEvolution getCaseEvolutioin() {
        return caseEvolution;
    }

    public void setCaseEvolutioin(CaseEvolution caseEvolution) {
        this.caseEvolution = caseEvolution;
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
