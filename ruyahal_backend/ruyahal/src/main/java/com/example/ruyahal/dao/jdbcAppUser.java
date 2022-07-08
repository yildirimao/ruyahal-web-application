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
    public void createAppUser(int id, String name, String lastName, String dateOfBirth, String gender, String sexualOrientation, String occupation, String maritalStatus, String religion, String email, String dream) {

        String sql = "INSERT INTO users(user_name,  user_lastname, date_of_birth, gender, sexual_orientation, user_occupation, marital_status, religion, email, dream) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                "RETURNING user_name,  user_lastname, date_of_birth, gender, sexual_orientation, user_occupation, marital_status, religion, email";
        jdbctemplate.queryForObject(sql, int.class, name, lastName, dateOfBirth, gender, sexualOrientation, occupation, maritalStatus, religion, email, dream);


    }

    @Override
    public void updateAppUser(String name, String lastname, String date_of_birth, String gender, String sexualOrientation, String occupation, String maritalStatus, String religion, String email, boolean enabled, String dream) {

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
        appUser.setReligion(rs.getString("religion"));
        appUser.setEmail(rs.getString("email"));
        appUser.setEnabled(rs.getBoolean("enabled"));
        appUser.setDream(rs.getString("dream"));
        return appUser;
    }
}
