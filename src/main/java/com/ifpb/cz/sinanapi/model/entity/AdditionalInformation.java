package com.ifpb.cz.sinanapi.model.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class AdditionalInformation {

    private String additionalObservation;

    public AdditionalInformation(){


    }

    public AdditionalInformation(String additionalObservation) {
        this.additionalObservation = additionalObservation;
    }

    public String getAdditionalObservation() {
        return additionalObservation;
    }

    public void setAdditionalObservation(String additionalObservation) {
        this.additionalObservation = additionalObservation;
    }
}
