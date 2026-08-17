package com.javaconcepts.collections.collectionspart2.queue.comparator.approachthree;

import java.util.Comparator;

public class Car implements Comparator<Car> {

    String carName;
    String carType;

    Car() {};

    Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compare(Car obj1, Car obj2) {
        return obj1.carName.compareTo(obj2.carName);
    }
}
