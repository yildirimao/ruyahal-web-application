package com.example.ruyahal.controller;

import com.example.ruyahal.dao.InterpreterDao;
import com.example.ruyahal.model.Interpreter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class InterpreterController {

    private InterpreterDao interpreterDao;

    public InterpreterController(InterpreterDao interpreterDao) {
        this.interpreterDao = interpreterDao;
    }

    @RequestMapping(path = "/interpreters", method = RequestMethod.GET)
    public List<Interpreter> listAllInterpreters() {return interpreterDao.listAll();}


}

