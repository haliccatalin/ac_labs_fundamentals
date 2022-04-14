package com.endava;

public class Person {
    // atribute / proprietati
    private String firstName;
    private String lastName;

    // constructorul
    public Person() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            System.out.println("Numele este invalid!");
        }
    }
}
