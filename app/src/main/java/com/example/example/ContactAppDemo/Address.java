package com.example.example.ContactAppDemo;

public class Address {

    String city;
    String state;
    String country;
    String postalCode;

    Address(){

    }

    Address(String city,String state,String country,String postalCode){
        this.city = city;
        this.state = state;
        this.country=country;
        this.postalCode=postalCode;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
