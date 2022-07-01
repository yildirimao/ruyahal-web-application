package com.example.ruyahal.dao;

import com.example.ruyahal.model.Interpreter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class jdbcInterpreterDao implements InterpreterDao{

    JdbcTemplate jdbcTemplate;

    public jdbcInterpreterDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Interpreter> listAll() {

        List<Interpreter> interpreters = new ArrayList<>();
        String sql = "SELECT interpreter_id, interpreter_name, interpreter_age\n" +
                     "FROM interpreters;";
        SqlRowSet results =jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Interpreter interpreter = mapRowToInterpreter(results);
            interpreters.add(interpreter);
        }
        return interpreters;
    }

    @Override
    public Interpreter getInterpreterById(int interpreterId) {
        return null;
    }

    private Interpreter mapRowToInterpreter(SqlRowSet rs){
        Interpreter interpreter = new Interpreter();
        interpreter.setId(rs.getInt("interpreter_id"));
        interpreter.setName(rs.getString("interpreter_name"));
        interpreter.setAge(rs.getInt("interpreter_age"));
        return interpreter;
    }
}


