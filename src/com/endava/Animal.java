package com.endava;

public class Animal {

    public Animal() {

    }

    public Animal(String name) {
        System.out.println(name);
    }

    void makeSound() {
        System.out.println("makeSound() - Animal");
    }

    public void showAnimalType() {
        System.out.println("Animal Type");
    }
}
