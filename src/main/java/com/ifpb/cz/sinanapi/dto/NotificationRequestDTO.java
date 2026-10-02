package com.ifpb.cz.sinanapi.dto;

import com.ifpb.cz.sinanapi.model.entity.enums.*;
import java.time.LocalDate;

public record NotificationRequestDTO(
        NotificationType type,
        String agravo,
        String cid,
        LocalDate notificationDate,
        FederativeUnit federativeUnit,
        String municipe,
        Integer ibgeCode,
        String notificationSource,
        LocalDate symptomStartDate,
        String fullName,
        LocalDate birthDate,
        AgeUnit ageUnit,
        Integer ageValue,
        Gender gender,
        PregnancyStatus pregnancyStatus,
        RaceOrColor raceOrColor,
        SchoolLevels schoolLevels,
        String susCardNumber,
        String motherName,
        FederativeUnit ufResidencia,
        String residenceMunicipe,
        Integer residenceIbgeCode,
        String district,
        String neighborhood,
        String street,
        String houseNumber,
        String cep,
        String phoneNumber,
        Zone zone,
        String country
) {}