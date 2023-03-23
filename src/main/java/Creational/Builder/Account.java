package Creational.Builder;

import java.util.List;

public class Account {
    private int id;
    private String Email;
    private String firstname;
    private List<String> middleNames;
    private String sureName;
    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;

    public Account(int id, String email, String firstname, List<String> middleNames, String sureName, int houseNumber, String street, String zipCode, String city) {
        this.id = id;
        Email = email;
        this.firstname = firstname;
        this.middleNames = middleNames;
        this.sureName = sureName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middleNames=" + middleNames +
                ", sureName='" + sureName + '\'' +
                ", houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
