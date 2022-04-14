package com.endava.abstraction;

public abstract class Phone {

    private String marca;
    private String model;
    private String culoare;

    public Phone(String marca, String model, String culoare) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void makeSound() {
        System.out.println("Soooooundddd");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
