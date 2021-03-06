package com.example.ruyahal.model;

import java.util.Objects;

public class AppUser {

    private int userId;
    private String name;
    private String lastname;

    private String dateOfBirth;
    private String gender;
    private String sexualOrientation;
    private String occupation;
    private String maritalStatus;
    private String zodiacSign;
    private String religion;
    private String email;
    private boolean enabled;

    private String dream;

    public AppUser(int userId, String name, String lastname, String dateOfBirth, String gender, String sexualOrientation, String occupation, String maritalStatus, String religion, String email, boolean enabled, String dream) {
        this.userId = userId;
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.sexualOrientation = sexualOrientation;
        this.occupation = occupation;
        this.maritalStatus = maritalStatus;
        this.religion = religion;
        this.email = email;
        this.enabled = enabled;
        this.dream = dream;
    }

    public AppUser() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getDream(){return dream;}
    public void setDream(String dream){this.dream = dream;}
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ) return false;
        AppUser appUser = (AppUser) obj;
        return userId == appUser.userId &&
                Objects.equals(name, appUser.name) &&
                Objects.equals(lastname, appUser.lastname) &&
                Objects.equals(dateOfBirth, appUser.dateOfBirth) &&
                Objects.equals(gender, appUser.gender) &&
                Objects.equals(sexualOrientation, appUser.sexualOrientation) &&
                Objects.equals(occupation, appUser.occupation) &&
                Objects.equals(maritalStatus, appUser.maritalStatus) &&
                Objects.equals(religion, appUser.religion) &&
                Objects.equals(email, appUser.email) &&
                Objects.equals(enabled, appUser.enabled) &&
                Objects.equals(dream, appUser.dream);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", sexualOrientation='" + sexualOrientation + '\'' +
                ", occupation='" + occupation + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", religion='" + religion + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled + '\'' +
                ", dream=" + dream +
                '}';
    }
}
