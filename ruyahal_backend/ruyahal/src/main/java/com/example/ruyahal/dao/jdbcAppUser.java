package com.example.ruyahal.dao;

import com.example.ruyahal.model.AppUser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class jdbcAppUser implements AppUserDao {

    JdbcTemplate jdbctemplate;

    public jdbcAppUser(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }

    @Override
    public List<AppUser> getAllUsers() {
        List<AppUser> appUsers = new ArrayList<>();
        String sql = "SELECT user_id, user_name, user_lastname, user_age, gender, sexual_orientation, user_occupation, marital_status, zodiac_sign, religion, email, enabled " +
                     "FROM users;";
        SqlRowSet results = jdbctemplate.queryForRowSet(sql);
        while(results.next()) {
            AppUser appUser = mapRowToAppUser(results);
            appUsers.add(appUser);
        }
        return appUsers;
    }



    @Override
    public void createAppUser(int id, String name, String lastName, String dateOfBirth, String gender, String sexualOrientation, String occupation, String maritalStatus, String zodiacSign, String religion, String email) {

        String sql = "INSERT INTO users(user_id, user_name,  user_lastname, user_age, gender, sexual_orientation, user_occupation, marital_status, zodiac_sign, religion, email) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                "RETURNING user_name,  user_lastname, user_age, gender, sexual_orientation, user_occupation, marital_status, zodiac_sign, religion, email";
        jdbctemplate.queryForObject(sql, int.class, name, lastName, age, gender, sexualOrientation, occupation, maritalStatus, zodiacSign, religion, email);


    }

    @Override
    public void updateAppUser(int userId, String name, String lastname, int age, String gender, String sexualOrientation, String occupation, String maritalStatus, String zodiacSign, String religion, String email, boolean enabled) {

    }

    @Override
    public void deleteAppUser(AppUser user) {

    }

    private AppUser mapRowToAppUser(SqlRowSet rs) {
        AppUser appUser = new AppUser();
        appUser.setUserId(rs.getInt("user_id"));
        appUser.setName(rs.getString("user_name"));
        appUser.setLastname(rs.getString("user_lastname"));
        appUser.setDateOfBirth(rs.getString("date_of_birth"));
        appUser.setGender(rs.getString("gender"));
        appUser.setSexualOrientation(rs.getString("sexual_orientation"));
        appUser.setOccupation(rs.getString("user_occupation"));
        appUser.setMaritalStatus(rs.getString("marital_status"));
        appUser.setZodiacSign(rs.getString("zodiac_sign"));
        appUser.setReligion(rs.getString("religion"));
        appUser.setEmail(rs.getString("email"));
        appUser.setEnabled(rs.getBoolean("enabled"));
        return appUser;
    }
}
