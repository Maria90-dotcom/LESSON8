package com.company;

public class Pet {
    String type;
    int nlegs;
    boolean haswool;
    String owner;

    Pet (String type,int nlegs, boolean haswool, String owner)
    {
        this.type = type;
        this.nlegs = nlegs;
        this.haswool = haswool;
        this.owner = owner;
    }
    public void say(){
        System.out.println("Домашние питомцы");
    }
}
