package com.javaconcepts.collections.collectionspart2.queue.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Uses compareTo() method
public class Main {
    public static void main(String[] args) {

        Integer a[] = {1, 7, 3};
        Arrays.sort(a);
        for(int v:a) {
            System.out.println(v);
        }

        System.out.println("--------------");

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("audi", "petrol"));
        carList.add(new Car("suv", "petrol"));
        carList.add(new Car("sedan", "diesel"));
        carList.add(new Car("hatchback", "cng"));

        Collections.sort(carList);
        carList.forEach((Car carObj) -> System.out.println(carObj.carName + ".." + carObj.carType));

    }
}
