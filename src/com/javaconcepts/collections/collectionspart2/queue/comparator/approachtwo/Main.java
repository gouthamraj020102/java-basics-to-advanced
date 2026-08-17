package com.javaconcepts.collections.collectionspart2.queue.comparator.approachtwo;

import com.javaconcepts.collections.collectionspart2.queue.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Approach 2: Using car name comparator class
public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suv", "petrol"));
        cars.add(new Car("sedan", "diesel"));
        cars.add(new Car("hatchback", "cng"));

        Collections.sort(cars, new CarNameComparator());
        cars.forEach((Car carObj) -> System.out.println(carObj.carName + ".." + carObj.carType));

    }
}
