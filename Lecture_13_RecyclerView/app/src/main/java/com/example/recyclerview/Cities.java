package com.example.recyclerview;


public class Cities {
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cities(String city, String country) {
        this.city = city;
        this.country = country;
    }

    String city;
    String country;

    @Override
    public String toString() {
        return "Friends{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

