package com.javaconcepts.annotations.onannotations.repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Categories {
    Category[] value();
}
