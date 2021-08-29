package com.company;

public class Main {

    public static void main(String[] args) {
	Mom myMom = new Mom("Olga", 56, "Vasilenko");
	myMom.cure();
	Father myFather = new Father("Vladimir", 62, "Vasilenko");
	myFather.cure();
	Dog myDog = new Dog("Шарик", 4, true, "Sergey");
	Son mySon = new Son("Sergey", 26, "Vasilenko", myDog);
    mySon.belong();
    mySon.getMyDog().say();
	mySon.cure();
	mySon.wedding();
	Daughter myDaughter = new Daughter("Ksenia", 14, "Vasilenko");
	myDaughter.childhood();
	myDaughter.studing();
    }
}
