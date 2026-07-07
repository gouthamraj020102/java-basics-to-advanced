package com.javaconcepts.classes.enumclass.abstractmethod;

public enum EnumSample {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("This is Monday");
        }
    },
    TUESDAY {
        @Override
        public void dummyMethod() {
            System.out.println("This is Tuesday");
        }
    },
    SUNDAY {
        @Override
        public void dummyMethod() {
            System.out.println("This is Sunday");
        }
    };
    public abstract void dummyMethod();
}
