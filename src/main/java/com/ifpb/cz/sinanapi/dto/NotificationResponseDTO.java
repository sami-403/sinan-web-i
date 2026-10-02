package com.ifpb.cz.sinanapi.dto;

import com.ifpb.cz.sinanapi.model.entity.Notification;
import com.ifpb.cz.sinanapi.model.entity.enums.*;

import java.time.LocalDate;

public record NotificationResponseDTO(
        Long id,
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
) {

    public static NotificationResponseDTO fromEntity(Notification entity) {
        if (entity == null) return null;

        var g = entity.getGeneralData();
        var i = entity.getIndividualNotification();
        var r = entity.getResidenceDetails();

        return new NotificationResponseDTO(
                entity.getId(),
                g != null ? g.getType() : null,
                g != null ? g.getAgravo() : null,
                g != null ? g.getCid() : null,
                g != null ? g.getNotificationDate() : null,
                g != null ? g.getNotifyingUf() : null,
                g != null ? g.getNotifyingMunicipe() : null,
                g != null ? g.getNotifyingIbgeCode() : null,
                g != null ? g.getNotificationSource() : null,
                g != null ? g.getSymptomStartDate() : null,
                i != null ? i.getFullName() : null,
                i != null ? i.getBirthDate() : null,
                i != null ? i.getAgeUnit() : null,
                i != null ? i.getAgeValue() : null,
                i != null ? i.getGender() : null,
                i != null ? i.getPregnancyStatus() : null,
                i != null ? i.getRaceOrColor() : null,
                i != null ? i.getSchoolLevels() : null,
                i != null ? i.getSusCardNumber() : null,
                i != null ? i.getMotherName() : null,
                r != null ? r.getResidenceUf() : null,
                r != null ? r.getResidenceMunicipe() : null,
                r != null ? r.getResidenceIbgeCode() : null,
                r != null ? r.getResidenceDistrict() : null,
                r != null ? r.getResidenceNeighbo() : null,
                r != null ? r.getStreet() : null,
                r != null ? r.getHouseNumber() : null,
                r != null ? r.getCep() : null,
                r != null ? r.getPhoneNumber() : null,
                r != null ? r.getZone() : null,
                r != null ? r.getResidenceCountry() : null
        );
    }
}