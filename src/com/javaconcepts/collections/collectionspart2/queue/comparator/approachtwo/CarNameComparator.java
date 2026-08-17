package com.javaconcepts.collections.collectionspart2.queue.comparator.approachtwo;

import com.javaconcepts.collections.collectionspart2.queue.Car;
import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car obj1, Car obj2) {
        return obj2.carName.compareTo(obj1.carName);
    }
}
