package com.javaconcepts.collections.collectionspart2.queue.comparable;

public class Car implements Comparable<Car> {

    String carName;
    String carType;

    Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compareTo(Car obj2) {

        // Ascending Order
        return this.carName.compareTo(obj2.carName);

        // Descending Order
        // return obj2.carName.compareTo(this.carName);
    }
}
