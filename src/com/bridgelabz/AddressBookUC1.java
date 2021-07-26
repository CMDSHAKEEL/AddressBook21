package com.bridgelabz;

public class AddressBookUC1 {
    public static void main(String[] args) {
        AddinBook b = new AddinBook();
        System.out.println("Welcome to Address Book Program");

        b.setFirstName("CMD");
        b.setLastName("SHAKEEL");
        b.setCellNum("9581477386");
        b.setEmail("cmdshakeel21@.com");
        b.setCity("ADONI");
        b.setZip("518301");
        b.setState("Andhra Pradesh");

        System.out.println(" First Name: " + b.getFirstName()                 +
                "\n Last Name: " + b.getLastName()        +
                "\n Cell Num: " + b.getCellNum()      +
                "\n Email-id: " + b.getEmail()     +
                "\n City: " + b.getCity()       +
                " \n Pin: " + b.getZip()    +
                "\n State: " + b.getState());

    }
}
