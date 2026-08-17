package com.javaconcepts.collections.collectionspart2.queue.comparator.approachthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Approach 3: Using DTO class
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suv", "petrol"));
        cars.add(new Car("sedan", "diesel"));
        cars.add(new Car("hatchback", "cng"));

        Collections.sort(cars, new Car());
        cars.forEach((Car carObj) -> System.out.println(carObj.carName + ".." + carObj.carType));
    }
}
