package com.ifpb.cz.sinanapi.model.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Investigator {

    private String municipeOrUbs;
    private Integer cnes;

    private String invetigatorName;
    private String function;
    private String signature;

    public Investigator(){

    }

    public Investigator(String municipeOrUbs, Integer cnes, String invetigatorName, String function, String signature) {
        this.municipeOrUbs = municipeOrUbs;
        this.cnes = cnes;
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

    public Integer getCnes() {
        return cnes;
    }

    public void setCnes(Integer cnes) {
        this.cnes = cnes;
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
