package com.company;

public class Cat extends Pet{

    Cat(String type, int nlegs, boolean haswool, String owner) {
        super(type, nlegs, haswool, owner);
    }
    @Override
    public void say(){
        System.out.println("кот мяукает");
    }
}

