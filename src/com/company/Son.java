package com.company;

public class Son extends Human implements Doctor, Husband, AnimalLover {
    Dog myDog;
   public Son(String name, int age, String surname, Dog myDog) {
        super(name, age, surname);
        this.myDog = myDog;
    }
    public void cure() {

       System.out.println("Я врач - интерн");
    }
   public void wedding(){

       System.out.println("Я будущий муж");
   }
    Dog getMyDog() {
        return myDog;
    }
    public void belong(){
        System.out.println("У Сергея есть собака");
    }
}
