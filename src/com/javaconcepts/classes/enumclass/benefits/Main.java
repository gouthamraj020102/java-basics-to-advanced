package com.javaconcepts.classes.enumclass.benefits;

// 6. Benefits of Enum over Class Constants
public class Main {
    public static void main(String[] args) {
        System.out.println("Deriving from Class Constants in Java");
        isWeekend(2);
        isWeekend(6);
        isWeekend(100);

        System.out.println("Deriving from Enum Constants in Java");
        isWeekend(EnumSample.WEDNESDAY);
        isWeekend(EnumSample.SUNDAY);
    }

    public static boolean isWeekend(int day) {
        if (day == WeekConstants.SATURDAY || day == WeekConstants.SUNDAY) {
            System.out.println("It's a weekend!");
            return true;
        } else {
            System.out.println("It's a weekday");
            return false;
        }
    }

    public static boolean isWeekend(EnumSample day) {
        if (day == EnumSample.SATURDAY || day == EnumSample.SUNDAY) {
            System.out.println("It's a weekend!");
            return true;
        } else {
            System.out.println("It's a weekday");
            return false;
        }
    }
}
