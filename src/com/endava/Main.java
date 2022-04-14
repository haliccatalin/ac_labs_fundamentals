package com.endava;

public class Main {

    public static void main(String[] args) {
        // String este clasa care face exceptie de la folosirea lui "new"
        String name = "Ana";
        String lastName = new String("Popescu");

        // instantierea se face folosing keywordul "new"
        Person person = new Person();

        int age = 10; // primitiva
        Integer age2 = 10; // clasa (obiect)

        Dog dog = new Dog();
        dog.makeSound();
        dog.showAnimalType();

        Animal animal = new Animal();
        animal.makeSound();

        // clasa Animal poate sa fie instantiata cu constructorul clasei Dog, pentru ca clasa Dog mosteneste clasa Animal
        Animal rex = new Dog();

        // Clasa Dog NU poate fi instantiata cu clasa Animal, pentru ca in clasa Dog, avem metode care nu sunt definite in clasa Animal
//        Dog rex2 = new Animal();
//        rex2.printMessage();
    }
}
