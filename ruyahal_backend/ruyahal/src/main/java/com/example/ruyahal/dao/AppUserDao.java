package com.example.ruyahal.dao;

import com.example.ruyahal.model.AppUser;

import java.util.List;

public interface AppUserDao {

    List<AppUser> getAllUsers();

    void createAppUser(int id, String name, String lastName, String dateOfBirth, String gender, String sexualOrientation, String occupation, String maritalStatus, String religion, String email, String dream);


    void updateAppUser(String name, String lastname, String date_of_birth, String gender, String sexualOrientation, String occupation, String maritalStatus, String religion, String email, boolean enabled, String dream);

    void deleteAppUser(AppUser user);
}
