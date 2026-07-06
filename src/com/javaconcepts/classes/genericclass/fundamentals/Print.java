package com.javaconcepts.classes.genericclass.fundamentals;

public class Print<T> {
    private T value;

    public T getPrintValue() {
        return value;
    }

    public void setPrintValue(T value) {
        this.value = value;
    }
}
