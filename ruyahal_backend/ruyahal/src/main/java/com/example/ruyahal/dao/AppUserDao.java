package com.example.ruyahal.dao;

import com.example.ruyahal.model.AppUser;

import java.util.List;

public interface AppUserDao {

    List<AppUser> getAllUsers();

    void createAppUser(int id, String name, String lastName, String dateOfBirth, String gender, String sexualOrientation, String occupation, String maritalStatus, String religion, String email);

    void updateAppUser(int userId, String name, String lastname, int age, String gender, String sexualOrientation, String occupation, String maritalStatus, String zodiacSign, String religion, String email, boolean enabled);

    void deleteAppUser(AppUser user);
}
