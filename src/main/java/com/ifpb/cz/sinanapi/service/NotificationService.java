package com.ifpb.cz.sinanapi.service;

import com.ifpb.cz.sinanapi.dto.NotificationRequestDTO;
import com.ifpb.cz.sinanapi.model.entity.*;
import com.ifpb.cz.sinanapi.model.entity.enums.Gender;
import com.ifpb.cz.sinanapi.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public Notification create(NotificationRequestDTO dto) {
        validate(dto);
        Notification notification = new Notification();
        mapDtoToEntity(dto, notification);
        return repository.save(notification);
    }

    public Notification update(Long id, NotificationRequestDTO dto) {
        Notification existing = findById(id);
        validate(dto);
        mapDtoToEntity(dto, existing);
        return repository.save(existing);
    }

    public Notification findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Notificação não encontrada com o ID: " + id));
    }

    public void delete(Long id) {
        Notification notification = findById(id);
        repository.delete(notification);
    }

    public List<Notification> findAll(boolean duplicadas, String agravo, String paciente) {
        List<Notification> all = repository.findAll();

        return all.stream()
                .filter(n1 -> !duplicadas || all.stream().anyMatch(n2 -> isDuplicate(n1, n2)))
                .filter(n -> agravo == null || agravo.isBlank() ||
                        (n.getGeneralData() != null &&
                                n.getGeneralData().getAgravo() != null &&
                                n.getGeneralData().getAgravo().equalsIgnoreCase(agravo.trim())))
                .filter(n -> paciente == null || paciente.isBlank() ||
                        (n.getIndividualNotification() != null &&
                                n.getIndividualNotification().getFullName() != null &&
                                n.getIndividualNotification().getFullName().toLowerCase().contains(paciente.trim().toLowerCase())))
                .toList();
    }

    public void validate(NotificationRequestDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("Os dados da notificação não podem ser vazios.");
        }
        if (dto.agravo() == null || dto.agravo().isBlank()) {
            throw new IllegalArgumentException("O agravo/doença é obrigatório.");
        }
        if (dto.fullName() == null || dto.fullName().isBlank()) {
            throw new IllegalArgumentException("O nome do paciente é obrigatório.");
        }
        if (dto.notificationDate() == null) {
            throw new IllegalArgumentException("A data de notificação é obrigatória.");
        }


        if (dto.birthDate() == null && dto.ageValue() == null) {
            throw new IllegalArgumentException("A idade é obrigatória quando a data de nascimento não é informada.");
        }

        if (dto.gender() == Gender.F && dto.pregnancyStatus() == null) {
            throw new IllegalArgumentException("O status gestacional é obrigatório para pacientes do sexo feminino.");
        }


        boolean residaNoBrasil = dto.country() == null || dto.country().isBlank() || dto.country().equalsIgnoreCase("Brasil");
        if (residaNoBrasil) {
            if (dto.ufResidencia() == null) {
                throw new IllegalArgumentException("A UF de residência é obrigatória para residentes no Brasil.");
            }
            if (dto.residenceMunicipe() == null || dto.residenceMunicipe().isBlank()) {
                throw new IllegalArgumentException("O município de residência é obrigatório quando a UF é informada.");
            }
        } else {
            if (dto.country().isBlank()) {
                throw new IllegalArgumentException("O país de residência é obrigatório para pacientes residentes no exterior.");
            }
        }
    }

    private boolean isDuplicate(Notification n1, Notification n2) {
        if (n1.getId() != null && n1.getId().equals(n2.getId())) {
            return false;
        }

        if (n1.getGeneralData() == null || n2.getGeneralData() == null ||
                n1.getIndividualNotification() == null || n2.getIndividualNotification() == null) {
            return false;
        }

        String motherName1 = n1.getIndividualNotification().getMotherName();
        String motherName2 = n2.getIndividualNotification().getMotherName();
        if (motherName1 == null || motherName1.isBlank() || motherName2 == null || motherName2.isBlank()) {
            return false;
        }

        String agravo1 = n1.getGeneralData().getAgravo();
        String agravo2 = n2.getGeneralData().getAgravo();
        boolean sameAgravo = agravo1 != null && agravo2 != null && agravo1.trim().equalsIgnoreCase(agravo2.trim());

        String fullName1 = n1.getIndividualNotification().getFullName();
        String fullName2 = n2.getIndividualNotification().getFullName();
        boolean sameFullName = fullName1 != null && fullName2 != null && fullName1.trim().equalsIgnoreCase(fullName2.trim());

        boolean sameBirthDate = n1.getIndividualNotification().getBirthDate() != null &&
                n1.getIndividualNotification().getBirthDate().equals(n2.getIndividualNotification().getBirthDate());

        boolean sameMotherName = motherName1.trim().equalsIgnoreCase(motherName2.trim());

        boolean withinThreeDays = false;
        if (n1.getGeneralData().getNotificationDate() != null && n2.getGeneralData().getNotificationDate() != null) {
            long daysBetween = Math.abs(ChronoUnit.DAYS.between(
                    n1.getGeneralData().getNotificationDate(),
                    n2.getGeneralData().getNotificationDate()
            ));
            withinThreeDays = daysBetween <= 3;
        }

        return sameAgravo && sameFullName && sameBirthDate && sameMotherName && withinThreeDays;
    }

    private void mapDtoToEntity(NotificationRequestDTO dto, Notification notification) {
        GeneralData generalData = new GeneralData();
        generalData.setType(dto.type());
        generalData.setAgravo(dto.agravo());
        generalData.setCid(dto.cid());
        generalData.setNotificationDate(dto.notificationDate());
        generalData.setNotifyingUf(dto.federativeUnit());
        generalData.setNotifyingMunicipe(dto.municipe());
        generalData.setNotifyingIbgeCode(dto.ibgeCode());
        generalData.setNotificationSource(dto.notificationSource());
        generalData.setSymptomStartDate(dto.symptomStartDate());

        IndividualNotification individual = new IndividualNotification();
        individual.setFullName(dto.fullName());
        individual.setBirthDate(dto.birthDate());
        individual.setAgeUnit(dto.ageUnit());
        individual.setAgeValue(dto.ageValue());
        individual.setGender(dto.gender());
        individual.setPregnancyStatus(dto.pregnancyStatus());
        individual.setRaceOrColor(dto.raceOrColor());
        individual.setSchoolLevels(dto.schoolLevels());
        individual.setSusCardNumber(dto.susCardNumber());
        individual.setMotherName(dto.motherName());

        ResidenceDetails residence = new ResidenceDetails();
        residence.setResidenceUf(dto.ufResidencia());
        residence.setResidenceMunicipe(dto.residenceMunicipe());
        residence.setResidenceIbgeCode(dto.residenceIbgeCode());
        residence.setResidenceDistrict(dto.district());
        residence.setResidenceNeighbo(dto.neighborhood());
        residence.setStreet(dto.street());
        residence.setHouseNumber(dto.houseNumber());
        residence.setCep(dto.cep());
        residence.setPhoneNumber(dto.phoneNumber());
        residence.setZone(dto.zone());
        residence.setResidenceCountry(dto.country());

        notification.setGeneralData(generalData);
        notification.setIndividualNotification(individual);
        notification.setResidenceDetails(residence);
    }
}