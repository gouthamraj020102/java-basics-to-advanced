package com.javaconcepts.annotations.userdefinedannotations.withmethodbody;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
    String name();
}
