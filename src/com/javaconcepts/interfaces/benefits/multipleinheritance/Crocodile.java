package com.javaconcepts.interfaces.benefits.multipleinheritance;

// DIAMOND PROBLEM:
// public class Crocodile extends LandAnimal, WaterAnimal {
//     @Override
//     public boolean canBreathe() {
//         return true;
//     }
// }

// In Java, Multiple Inheritance is possible only through Interface
public class Crocodile implements LandAnimal, WaterAnimal {
    @Override
    public boolean canBreathe() {
        return true;
    }
}
