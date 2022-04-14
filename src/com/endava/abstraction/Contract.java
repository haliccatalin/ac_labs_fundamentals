package com.endava.abstraction;

/**
 * 1. Tip de data care contin DOAR metode abstracte, incepand cu JAVA 8 nu mai este valabila afirmatia
 * 2. Pot contine proprietati daca sunt: STATICE, FINAL si PUBLIC
 * 3. toate metodele sunt prin definitie publice si abstracte
 * 4. de la Java 8 incoace -> avem metode cu bloc de cod in interfete
 * 5. NU avem constructori, pentru ca nu se pot instantia!!!!
 * 6. avem keyword-ul default!!!! CARE nu este modificator de access!
 */
public interface Contract {

    void printMessage(String message);

    default void printMessage(String message, String location) {
        System.out.println("Message: " + message);
        System.out.println("Location: " + location);
    }
}
