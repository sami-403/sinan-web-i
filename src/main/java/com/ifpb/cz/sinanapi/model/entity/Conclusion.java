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
    private FederativeUnit conclusionUf;
    private String conclusionCountry;

    private String conclusionMunicipe;

    private Integer conclusionIbgeCode;
    private String conclusionDistrict;

    private String conclusionNeighbo;

    @Enumerated(EnumType.ORDINAL)
    private Affirmations workRalationedDisease;

    @Enumerated(EnumType.ORDINAL)
    private CaseEvolution caseEvolution;

    private LocalDate deathDate;

    private LocalDate endedDate;

    public Conclusion(){


    }

    public Conclusion(LocalDate investigationDate, Classification finalClassification, ConfirmationCriteria confirmationCriteria, Affirmations fromResidenceMunicipality, FederativeUnit conclusionUf, String conclusionCountry, String conclusionMunicipe, Integer conclusionIbgeCode, String conclusionDistrict, String conclusionNeighbo, Affirmations workRalationedDisease, CaseEvolution caseEvolution, LocalDate deathDate, LocalDate endedDate) {
        this.investigationDate = investigationDate;
        this.finalClassification = finalClassification;
        this.confirmationCriteria = confirmationCriteria;
        this.fromResidenceMunicipality = fromResidenceMunicipality;
        this.conclusionUf = conclusionUf;
        this.conclusionCountry = conclusionCountry;
        this.conclusionMunicipe = conclusionMunicipe;
        this.conclusionIbgeCode = conclusionIbgeCode;
        this.conclusionDistrict = conclusionDistrict;
        this.conclusionNeighbo = conclusionNeighbo;
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

    public FederativeUnit getConclusionUf() {
        return conclusionUf;
    }

    public void setConclusionUf(FederativeUnit conclusionUf) {
        this.conclusionUf = conclusionUf;
    }

    public String getConclusionCountry() {
        return conclusionCountry;
    }

    public void setConclusionCountry(String conclusionCountry) {
        this.conclusionCountry = conclusionCountry;
    }

    public String getConclusionMunicipe() {
        return conclusionMunicipe;
    }

    public void setConclusionMunicipe(String conclusionMunicipe) {
        this.conclusionMunicipe = conclusionMunicipe;
    }

    public Integer getConclusionIbgeCode() {
        return conclusionIbgeCode;
    }

    public void setConclusionIbgeCode(Integer conclusionIbgeCode) {
        this.conclusionIbgeCode = conclusionIbgeCode;
    }

    public String getConclusionDistrict() {
        return conclusionDistrict;
    }

    public void setConclusionDistrict(String conclusionDistrict) {
        this.conclusionDistrict = conclusionDistrict;
    }

    public String getConclusionNeighbo() {
        return conclusionNeighbo;
    }

    public void setConclusionNeighbo(String conclusionNeighbo) {
        this.conclusionNeighbo = conclusionNeighbo;
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
