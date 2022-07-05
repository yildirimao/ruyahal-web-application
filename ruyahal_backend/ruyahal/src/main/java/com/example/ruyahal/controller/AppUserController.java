package com.example.ruyahal.controller;


import com.example.ruyahal.dao.AppUserDao;
import com.example.ruyahal.dao.jdbcAppUser;
import com.example.ruyahal.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class AppUserController {
    @Autowired
    AppUserDao appUserDao;

    public AppUserController(AppUserDao appUserDao) {
        this.appUserDao = appUserDao;
    }

    @GetMapping(path = "/users")
    public List<AppUser> listAppUsers() {return appUserDao.getAllUsers();}

//    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/users")
    public AppUser createUser(@RequestBody AppUser appUser){
        return appUserDao.createAppUser(appUser);
    }

}
