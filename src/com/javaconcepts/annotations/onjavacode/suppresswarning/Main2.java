package com.javaconcepts.annotations.onjavacode.suppresswarning;

import com.javaconcepts.annotations.onjavacode.Mobile;

@SuppressWarnings("deprecation")
public class Main2 {
    public static void main(String[] args) {
        Mobile mobileObj = new Mobile();
        mobileObj.dummyMethod();
    }
}
