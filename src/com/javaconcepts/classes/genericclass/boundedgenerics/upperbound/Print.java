package com.javaconcepts.classes.genericclass.boundedgenerics.upperbound;

public class Print<T extends Number> {
    T value;

    public T getPrintValue() {
        return value;
    }

    public void setPrintValue(T value) {
        this.value = value;
    }
}
