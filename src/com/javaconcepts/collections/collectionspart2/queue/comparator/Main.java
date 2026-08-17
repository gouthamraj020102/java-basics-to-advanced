package com.javaconcepts.collections.collectionspart2.queue.comparator;

import com.javaconcepts.collections.collectionspart2.queue.Car;
import java.util.Arrays;

// Uses compare() method
public class Main {
    public static void main(String[] args) {

        Integer a[] = {6, 4, 1, 9, 2, 11};

        // Ascending order
        Arrays.sort(a, (Integer val1, Integer val2) -> val1 - val2);
        for(int v:a) {
            System.out.println(v);
        }

        System.out.println("--");

        // Descending order
        Arrays.sort(a, (Integer val1, Integer val2) -> val2 - val1);
        for(int v:a) {
            System.out.println(v);
        }

        System.out.println("--------------");

        Car[] carArray = new Car[3];
        carArray[0] = new Car("suv", "petrol");
        carArray[1] = new Car("sedan", "diesel");
        carArray[2] = new Car("hatchback", "cng");

        // Ascending order
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj1.carType.compareTo(obj2.carType));
        for (Car car : carArray) {
            System.out.println(car.carName + ".." + car.carType);
        }

        System.out.println("-----------");

        // Descending order
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.carType.compareTo(obj1.carType));
        for (Car car : carArray) {
            System.out.println(car.carName + ".." + car.carType);
        }

    }
}
