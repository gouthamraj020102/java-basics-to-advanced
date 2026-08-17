package com.javaconcepts.collections.collectionspart2.queue.comparator.approachone;

import com.javaconcepts.collections.collectionspart2.queue.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Approach 1: Using lambda on lists
public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("suv", "petrol"));
        cars.add(new Car("sedan", "diesel"));
        cars.add(new Car("hatchback", "cng"));

        Collections.sort(cars, (Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName));
        cars.forEach((Car carObj) -> System.out.println(carObj.carName + ".." + carObj.carType));

    }
}
