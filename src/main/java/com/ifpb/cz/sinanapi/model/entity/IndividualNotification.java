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


}
