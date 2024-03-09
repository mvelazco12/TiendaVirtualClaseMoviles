package com.mateovelazco.tiendavirtual;

public class User {

    private String name;

    private String email;

    private String password;

    private String urlImageProfile;

    private String Phone;

    public User() {
    }

    public User(String name, String email, String password, String urlImageProfile, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.urlImageProfile = urlImageProfile;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrlImageProfile() {
        return urlImageProfile;
    }

    public String getPhone() {
        return Phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrlImageProfile(String urlImageProfile) {
        this.urlImageProfile = urlImageProfile;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
