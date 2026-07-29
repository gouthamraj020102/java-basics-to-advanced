package com.javaconcepts.annotations.onjavacode.suppresswarning;

import com.javaconcepts.annotations.onjavacode.Mobile;

public class Main1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Mobile mobileObj = new Mobile();
        mobileObj.dummyMethod();
    }
}
