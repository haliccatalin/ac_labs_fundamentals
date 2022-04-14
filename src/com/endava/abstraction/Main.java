package com.endava.abstraction;

public class Main {
    public static void main(String[] args) {

        // CLASA ANONIMA
        Phone p1 = new Phone("Samsung", "S22", "Rosu") {
            public String imei = "312312312313131";

            @Override
            public void turnOn() {
                System.out.println("Phone turn on!");
                this.printImei();
            }

            @Override
            public void turnOff() {
                System.out.println("Phone turn off!");
            }

            // metoda definita in interiorul clasei anonime
            // este accesibila doar in interiorul clasei anonime
            public void printImei() {
                System.out.println("IMEI: " + this.imei);
            }
        };

        p1.turnOn();
        p1.turnOff();

        System.out.println("-------");
        Phone p2 = new Android("Xiomi", "R8", "Negru", 28);
        p2.turnOn();
        p2.turnOff();

        // INTERFETE ANONIME
        Contract orange = new Contract() {
            @Override
            public void printMessage(String message) {

            }
        };

        Contract contract1 = new Android("Samsung", "s20", "Galben", 22);
        contract1.printMessage("test");

    }
}
