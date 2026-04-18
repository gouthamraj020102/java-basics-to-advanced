package com.javaconcepts.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.setColour("Brown");
        System.out.println("Labrador Retriever's Colour: " + labrador.getColour());

        BankAccount account = new BankAccount("Goutham", 1000);

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000); // invalid case

        System.out.println("Final Balance: " + account.getBalance());
    }
}