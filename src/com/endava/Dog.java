package com.endava;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(String name) {

    }

    public Dog(int age, String name) {

    }

    public Dog(String name, int age) {

    }

    @Override
    void makeSound() {
//        super.makeSound();
        System.out.println("makeSound() - Dog");
    }

    // NU SE CONSIDERA OVERLOAD DACA DOAR TIPUL RETURNAT ESTE DIFERIT
//    public void printMessage() {
//
//    }
//
    public String printMessage() {
        return "mesaj";
    }


}
