package com.javaconcepts.annotations.onannotations.inheritedannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Inherited allows this annotation to be visible on subclasses when the parent class is annotated.
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotationWithInherited {
    
}
