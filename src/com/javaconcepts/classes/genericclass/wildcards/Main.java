package com.javaconcepts.classes.genericclass.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bus());

        List<Bus> busList = new ArrayList<>();
        // vehicleList = busList; // This will give compile time error because List<Bus> is not a subtype of List<Vehicle>
        // busList = vehicleList; // This will give compile time error because List<Vehicle> is not a subtype of List<Bus>

        Vehicle vehicleObj = new Vehicle();
        Bus busObj = new Bus();
        vehicleObj = busObj; // This is valid because Bus is a subtype of Vehicle


        // 1. Upper Bound Wild Card
        Print printObj = new Print();
        printObj.setUpperBoundPrintValues(busList);
        printObj.setUpperBoundPrintValues(vehicleList);


        // 2. Lower Bound Wild Card
        List<Object> objectList = new ArrayList<>();
        printObj.setLowerBoundPrintValues(objectList);


        // 3. Unbounded Wild Card
        List<?> wildCardList = new ArrayList<>();
        wildCardList = busList;
        wildCardList = vehicleList;
        System.out.println("Wild Card List Size: " + wildCardList.size());


        // Difference bwn Wild Card Method and Generic Type Method
        List<Integer> wildCardIntegerSourceList = new ArrayList<>();
        List<Float> wildCardIntegerDestinationList = new ArrayList<>();
        printObj.computeList(wildCardIntegerSourceList, wildCardIntegerDestinationList);

        // Since computeList1 is a generic type method, the source and destination list should be of same type. So, below line will give compile time error
        // printObj.computeList1(wildCardIntegerSourceList, wildCardIntegerDestinationList);
        printObj.computeList1(wildCardIntegerSourceList, wildCardIntegerSourceList);
    }
}
