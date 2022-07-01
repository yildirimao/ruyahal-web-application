package com.example.ruyahal.model;

public class Interpreter {

    private int id;
    private String name;
    private int age;

    public Interpreter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Interpreter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //TODO implement the equals method
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Interpreter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
