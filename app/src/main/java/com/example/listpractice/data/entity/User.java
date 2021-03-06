package com.example.listpractice.data.entity;

public class User {
    private long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private Address address;
    private Company company;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }

    public Address getAddress() {
        return address;
    }

    public Company getCompany() {
        return company;
    }
}
