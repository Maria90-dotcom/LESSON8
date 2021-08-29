package com.company;

public class Fish extends Pet{
    Fish(String type, int nlegs, boolean haswool, String owner) {
        super(type, nlegs, haswool, owner);
    }
    @Override
    public void say(){
        System.out.println("рыбка молчит");
    }
}
