package com.endava.abstraction;

public class Android extends Phone implements Contract {
    private int osVersion;

    public Android(String marca, String model, String culoare, int osVersion) {
        // apelam constructorul clasei parinte
        super(marca, model, culoare);
//        super(); // apelul constructorului default
//        super.setMarca(marca);
//        super.setModel(model);
//        super.setCuloare(culoare);

        this.osVersion = osVersion;
    }

    @Override
    public void turnOn() {
        System.out.println("Start Android: " + super.getMarca() + " " + super.getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Off Android: " + super.getMarca() + " " + super.getModel());
    }

    @Override
    public void printMessage(String message) {
        System.out.println("Message: "  + message);
    }
}
