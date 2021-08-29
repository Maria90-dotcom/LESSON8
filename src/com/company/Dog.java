package com.company;

public class Dog extends Pet{

    Dog(String type, int nlegs, boolean haswool, String owner) {
        super(type, nlegs, haswool, owner);
    }
        @Override
        public void say(){
            System.out.println("Cобака лает");
        }
}
