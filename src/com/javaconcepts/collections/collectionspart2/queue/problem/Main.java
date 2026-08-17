package com.javaconcepts.collections.collectionspart2.queue.problem;

import com.javaconcepts.collections.collectionspart2.queue.Car;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. Primitive collection sorting
        int[] array = {1, 2, 3, 4};
        Arrays.sort(array);
        for (int element : array) {
            System.out.println(element);
        }

        // 2. Object collection sorting
        Car[] carArray = new Car[3];
        carArray[0] = new Car("SVV", "Petrol");
        carArray[1] = new Car("Sedan", "Diesel");
        carArray[2] = new Car("HatchBack", "CNG");
        Arrays.sort(carArray);
    }
}
