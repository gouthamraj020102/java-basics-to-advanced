package com.javaconcepts.annotations.userdefinedannotations.defaultvalues;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
    String name() default "hello";
}
