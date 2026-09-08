package com.javaconcepts.collections.queue.comparator.approachtwo;

import java.util.Comparator;

import com.javaconcepts.collections.queue.Car;

public class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car obj1, Car obj2) {
        return obj2.carName.compareTo(obj1.carName);
    }
}
