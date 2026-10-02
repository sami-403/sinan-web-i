package com.ifpb.cz.sinanapi.model.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Investigator {

    private String municipeOrUbs;
    private Integer investigatorCnes;

    private String invetigatorName;
    private String function;
    private String signature;

    public Investigator(){

    }

    public Investigator(String municipeOrUbs, Integer investigatorCnes, String invetigatorName, String function, String signature) {
        this.municipeOrUbs = municipeOrUbs;
        this.investigatorCnes = investigatorCnes;
        this.invetigatorName = invetigatorName;
        this.function = function;
        this.signature = signature;
    }


    public String getMunicipeOrUbs() {
        return municipeOrUbs;
    }

    public void setMunicipeOrUbs(String municipeOrUbs) {
        this.municipeOrUbs = municipeOrUbs;
    }

    public Integer getInvestigatorCnes() {
        return investigatorCnes;
    }

    public void setInvestigatorCnes(Integer investigatorCnes) {
        this.investigatorCnes = investigatorCnes;
    }

    public String getInvetigatorName() {
        return invetigatorName;
    }

    public void setInvetigatorName(String invetigatorName) {
        this.invetigatorName = invetigatorName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }



}
