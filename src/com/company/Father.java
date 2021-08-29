package com.company;

public class Father extends Human implements Doctor{

    Father(String name, int age, String surname) {
        super(name, age, surname);
    }
    public void cure(){
        System.out.println("Папа ухаживает за дедушкой. Ему нужен покой");
    }
}
