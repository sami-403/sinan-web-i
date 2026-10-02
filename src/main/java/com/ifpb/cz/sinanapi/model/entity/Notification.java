package com.ifpb.cz.sinanapi.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private GeneralData generalData;

    @Embedded
    private IndividualNotification individualNotification;

    @Embedded
    private ResidenceDetails residenceDetails;

    @Embedded
    private Conclusion conclusion;

    @Embedded
    private AdditionalInformation additionalInformation;

    @Embedded
    private Investigator investigator;

    public Notification() {
    }


    public Notification(GeneralData generalData, IndividualNotification individualNotification,
                        ResidenceDetails residenceDetails, Conclusion conclusion,
                        AdditionalInformation additionalInformation, Investigator investigator) {
        this.generalData = generalData;
        this.individualNotification = individualNotification;
        this.residenceDetails = residenceDetails;
        this.conclusion = conclusion;
        this.additionalInformation = additionalInformation;
        this.investigator = investigator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GeneralData getGeneralData() {
        return generalData;
    }

    public void setGeneralData(GeneralData generalData) {
        this.generalData = generalData;
    }

    public IndividualNotification getIndividualNotification() {
        return individualNotification;
    }

    public void setIndividualNotification(IndividualNotification individualNotification) {
        this.individualNotification = individualNotification;
    }

    public ResidenceDetails getResidenceDetails() {
        return residenceDetails;
    }

    public void setResidenceDetails(ResidenceDetails residenceDetails) {
        this.residenceDetails = residenceDetails;
    }

    public Conclusion getConclusion() {
        return conclusion;
    }

    public void setConclusion(Conclusion conclusion) {
        this.conclusion = conclusion;
    }

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Investigator getInvestigator() {
        return investigator;
    }

    public void setInvestigator(Investigator investigator) {
        this.investigator = investigator;
    }
}
