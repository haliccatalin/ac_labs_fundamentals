package com.endava;

public abstract class Vehicul {
     int numarRoti;
     boolean hasBrake;
     String color;

     public Vehicul(){}

    public Vehicul(int numarRoti, boolean hasBrake, String color) {
        this.numarRoti = numarRoti;
        this.hasBrake = hasBrake;
        this.color = color;
    }
}
