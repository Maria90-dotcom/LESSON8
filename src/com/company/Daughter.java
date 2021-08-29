package com.company;

public class Daughter extends Human implements Child, Pupil{
    Daughter(String name, int age, String surname) {
        super(name, age, surname);
    }
    public void childhood(){
        System.out.println("Дочь еще ребенок");
    }

    @Override
    public void studing() {
        System.out.println("Я учусь в школе");
    }
}
