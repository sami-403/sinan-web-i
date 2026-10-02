package com.ifpb.cz.sinanapi.model.entity;

import com.ifpb.cz.sinanapi.model.entity.enums.*;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Embeddable
public class IndividualNotification {
    private String fullName;
    private LocalDate birthDate;

    @Enumerated(EnumType.ORDINAL)
    private AgeUnit ageUnit;

    private Integer ageValue;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.ORDINAL)
    private PregnancyStatus pregnancyStatus;

    @Enumerated(EnumType.ORDINAL)
    private RaceOrColor raceOrColor;

    @Enumerated(EnumType.ORDINAL)
     private SchoolLevels schoolLevels;

    private String susCardNumber;

    private String motherName;

    public IndividualNotification(){

    }

    public IndividualNotification(String fullName, LocalDate birthDate, AgeUnit ageUnit, Integer ageValue, Gender gender, PregnancyStatus pregnancyStatus, RaceOrColor raceOrColor, SchoolLevels schoolLevels, String susCardNumber, String motherName) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.ageUnit = ageUnit;
        this.ageValue = ageValue;
        this.gender = gender;
        this.pregnancyStatus = pregnancyStatus;
        this.raceOrColor = raceOrColor;
        this.schoolLevels = schoolLevels;
        this.susCardNumber = susCardNumber;
        this.motherName = motherName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public AgeUnit getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(AgeUnit ageUnit) {
        this.ageUnit = ageUnit;
    }

    public Integer getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(Integer ageValue) {
        this.ageValue = ageValue;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public PregnancyStatus getPregnancyStatus() {
        return pregnancyStatus;
    }

    public void setPregnancyStatus(PregnancyStatus pregnancyStatus) {
        this.pregnancyStatus = pregnancyStatus;
    }

    public RaceOrColor getRaceOrColor() {
        return raceOrColor;
    }

    public void setRaceOrColor(RaceOrColor raceOrColor) {
        this.raceOrColor = raceOrColor;
    }

    public SchoolLevels getSchoolLevels() {
        return schoolLevels;
    }

    public void setSchoolLevels(SchoolLevels schoolLevels) {
        this.schoolLevels = schoolLevels;
    }

    public String getSusCardNumber() {
        return susCardNumber;
    }

    public void setSusCardNumber(String susCardNumber) {
        this.susCardNumber = susCardNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
