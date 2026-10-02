package com.ifpb.cz.sinanapi.model.entity;

import com.ifpb.cz.sinanapi.model.entity.enums.FederativeUnit;
import com.ifpb.cz.sinanapi.model.entity.enums.Zone;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
@Embeddable
public class ResidenceDetails {
    private FederativeUnit residenceUf;
    private String residenceMunicipe;
    private Integer residenceIbgeCode;
    private String residenceDistrict;
    private String residenceNeighbo;
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
    private String residenceCountry;

    public ResidenceDetails(){

    }

    public ResidenceDetails(FederativeUnit residenceUf, String residenceMunicipe, Integer residenceIbgeCode, String residenceDistrict, String residenceNeighbo, String street, Integer code, String houseNumber, double lat, double lon, String referencePoint, String cep, String phoneNumber, Zone zone, String residenceCountry) {
        this.residenceUf = residenceUf;
        this.residenceMunicipe = residenceMunicipe;
        this.residenceIbgeCode = residenceIbgeCode;
        this.residenceDistrict = residenceDistrict;
        this.residenceNeighbo = residenceNeighbo;
        this.street = street;
        this.code = code;
        this.houseNumber = houseNumber;
        this.lat = lat;
        this.lon = lon;
        this.referencePoint = referencePoint;
        this.cep = cep;
        this.phoneNumber = phoneNumber;
        this.zone = zone;
        this.residenceCountry = residenceCountry;
    }


    public FederativeUnit getResidenceUf() {
        return residenceUf;
    }

    public void setResidenceUf(FederativeUnit residenceUf) {
        this.residenceUf = residenceUf;
    }

    public String getResidenceMunicipe() {
        return residenceMunicipe;
    }

    public void setResidenceMunicipe(String residenceMunicipe) {
        this.residenceMunicipe = residenceMunicipe;
    }

    public Integer getResidenceIbgeCode() {
        return residenceIbgeCode;
    }

    public void setResidenceIbgeCode(Integer residenceIbgeCode) {
        this.residenceIbgeCode = residenceIbgeCode;
    }

    public String getResidenceDistrict() {
        return residenceDistrict;
    }

    public void setResidenceDistrict(String residenceDistrict) {
        this.residenceDistrict = residenceDistrict;
    }

    public String getResidenceNeighbo() {
        return residenceNeighbo;
    }

    public void setResidenceNeighbo(String residenceNeighbo) {
        this.residenceNeighbo = residenceNeighbo;
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

    public String getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry;
    }
}
