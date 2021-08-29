package com.company;

public class Mom extends Human implements Doctor{
    Mom(String name, int age, String surname) {
        super(name, age, surname);
    }
public void cure(){
    System.out.println("Мама лечит пациентов. Она палатный врач");
}

}
