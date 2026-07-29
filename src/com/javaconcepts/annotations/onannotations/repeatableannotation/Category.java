package com.javaconcepts.annotations.onannotations.repeatableannotation;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
@interface Category {
    String name();
}
