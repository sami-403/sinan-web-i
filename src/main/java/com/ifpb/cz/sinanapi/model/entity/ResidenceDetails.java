package com.ifpb.cz.sinanapi.model.entity;

import com.ifpb.cz.sinanapi.model.entity.enums.FederativeUnit;
import com.ifpb.cz.sinanapi.model.entity.enums.Zone;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
@Embeddable
public class ResidenceDetails {
    private FederativeUnit uf;
    private String residenceMunicipe;
    private Integer ibgeCode;
    private String district;
    private String neighbo;
    private String street;
    private Integer code;
    private String houseNumber;
    private double lat;
    private double lon;
    private String referencePoint;
    private String cep;
    private String phoneNumber;
    @Enumerated(EnumType.ORDINAL)
    private Zone zone;
    private String country;

    public ResidenceDetails(){

    }

    public ResidenceDetails(FederativeUnit uf, String residenceMunicipe, Integer ibgeCode, String district, String neighbo, String street, Integer code, String houseNumber, double lat, double lon, String referencePoint, String cep, String phoneNumber, Zone zone, String country) {
        this.uf = uf;
        this.residenceMunicipe = residenceMunicipe;
        this.ibgeCode = ibgeCode;
        this.district = district;
        this.neighbo = neighbo;
        this.street = street;
        this.code = code;
        this.houseNumber = houseNumber;
        this.lat = lat;
        this.lon = lon;
        this.referencePoint = referencePoint;
        this.cep = cep;
        this.phoneNumber = phoneNumber;
        this.zone = zone;
        this.country = country;
    }


    public FederativeUnit getUf() {
        return uf;
    }

    public void setUf(FederativeUnit uf) {
        this.uf = uf;
    }

    public String getResidenceMunicipe() {
        return residenceMunicipe;
    }

    public void setResidenceMunicipe(String residenceMunicipe) {
        this.residenceMunicipe = residenceMunicipe;
    }

    public Integer getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(Integer ibgeCode) {
        this.ibgeCode = ibgeCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbo() {
        return neighbo;
    }

    public void setNeighbo(String neighbo) {
        this.neighbo = neighbo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
