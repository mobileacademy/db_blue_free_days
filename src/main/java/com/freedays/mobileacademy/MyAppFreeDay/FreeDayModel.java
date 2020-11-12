package com.freedays.mobileacademy.MyAppFreeDay;

import java.util.List;

/**
 * {
 *       "date":"2017-01-01",
 *       "localName":"Neujahr",
 *       "name":"New Year's Day",
 *       "countryCode":"AT",
 *       "fixed":true,
 *       "global":true,
 *       "counties":null,
 *       "launchYear":1967,
 *       "type":"Public"
 *    },
 */
public class FreeDayModel {

    private String date;
    private String localName;
    private String name;
    private String countryCode;
    private Boolean fixed;
    private Boolean global;
    private String type;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    public Boolean getGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
