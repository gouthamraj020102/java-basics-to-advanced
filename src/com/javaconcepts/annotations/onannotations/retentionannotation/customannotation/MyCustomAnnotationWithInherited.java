package com.javaconcepts.annotations.onannotations.retentionannotation.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Example 3: With @Retention Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

// Example 4: Without @Retention Annotation
// @Target(ElementType.TYPE)
public @interface MyCustomAnnotationWithInherited {
    
}
