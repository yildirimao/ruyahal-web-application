package com.example.ruyahal.dao;

import com.example.ruyahal.model.AppUser;

import java.util.List;

public interface AppUserDao {

    List<AppUser> getAllUsers();

    AppUser createAppUser(AppUser appUser);

    void updateAppUser(int userId, String name, String lastname, int age, String gender, String sexualOrientation, String occupation, String maritalStatus, String zodiacSign, String religion, String email, boolean enabled);

    void deleteAppUser(AppUser user);
}
