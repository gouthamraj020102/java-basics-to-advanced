package com.javaconcepts.classes.enumclass;

public enum CustomEnumSample {
    MONDAY(101, "1st day of the week"),
    TUESDAY(102, "2nd day of the week"),
    WEDNESDAY(103, "3rd day of the week"),
    THURSDAY(104, "4th day of the week"),
    FRIDAY(105, "5th day of the week"),
    SATURDAY(106, "it's 1st weekoff"),
    SUNDAY(107, "it's 2nd weekoff");

    private int val;
    private String comment;

    CustomEnumSample(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static CustomEnumSample getEnumByValue(int value) {
        for (CustomEnumSample sample : CustomEnumSample.values()) {
            if (sample.getVal() == value) {
                return sample;
            }
        }
        return null; // or throw an exception if preferred
    }
}
