package com.example.ruyahal.dao;

import com.example.ruyahal.model.Interpreter;

import java.util.List;

public interface InterpreterDao {

    List<Interpreter> listAll();

    Interpreter getInterpreterById(int interpreterId);
}
