package com.javaconcepts.methods;

import com.javaconcepts.methods.HumanResource.JobPortal;
import com.javaconcepts.methods.SalesDepartment.Invoice;
import com.javaconcepts.methods.SalesDepartment.Order;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculation class
        Calculation calculation = new Calculation();
        calculation.getPriceOfPen();
        calculation.getCombinedAge();

        // Create an instance of the JobPortal class to call protected method from Invoice class
        JobPortal jobPortal = new JobPortal();

        // Public method from JobPortal class can be accessed directly
        jobPortal.getInvoiceForMaintainingJobPortal();

        // Create an instance of the Invoice class to call public method internally calling private method
        Invoice invoice = new Invoice();
        invoice.printInvoice();

        // Create an instance of the Order class to call public method which internally calls default and protected methods
        Order order = new Order();
        order.getOrder();

        order.getReturnTypes();

        // Types of methods in Java
        // 1. System-defined methods: These are methods that are predefined in Java
        calculation.squareRootOfVariable(25);

        // 2. User-defined methods: These are methods that are created by the user to perform specific tasks
        calculation.getPriceOfPen();

        // 3. Overloaded methods: These are methods that have the same name but different parameters/arguments
        calculation.sum(5, 10);
        calculation.sum(5, 10, 15); // This would require an overloaded method
        calculation.sum(5, 10, 15, 20); // This would require another overloaded method

        // 4. Overridden methods: These are methods that are defined in a subclass and have the same name and parameters as a method in the superclass
        Person objectPerson = new Doctor();
        objectPerson.profession(); // when profession method is not overridden in Doctor class, it will call the profession method of Person class and print "I am a person"

        // 5. Static methods: These are methods that belong to the class rather than an instance of the class and can be called without creating an object of the class
        System.out.println("Price of pencil box: " + Calculation.getPriceOfPencilBox());
        // Static methods can also be called using an instance of the class, but it is not recommended as it can lead to confusion and is not considered good practice
        calculation.getPriceOfPencilBox(); // This will work but it is not recommended to call static method using an instance of the class, it is better to call it using the class name like Calculation.getPriceOfPencilBox() to improve code readability and avoid confusion.

        // Accessing static variable penPrice and instance variable scalePrice from the non-static method print() in Calculation class
        calculation.print();

        // No Overriding happens on Static methods, it is called method hiding. When a static method is defined in a subclass with the same signature as a static method in the superclass, the method in the subclass hides the method in the superclass.
        // The version of the static method that gets called is determined by the type of the reference variable, not the type of the object that it points to.
        Doctor.additonalDetails(); // This will call the static method additonalDetails() of the Doctor class and print "I am in Doctor class"
        Person.additonalDetails(); // This will call the static method additonalDetails() of the Person class and print "I am in Person class"

        Doctor doctor = new Doctor();
        doctor.additonalDetails(); // This will call the static method additonalDetails() of the Doctor class and print "I am in Doctor class" because static methods are called based on the reference type, not the object type. Here, doctor is a reference of type Doctor, so it will call the static method of the Doctor class.
        objectPerson.additonalDetails(); // This will call the static method additonalDetails() of the Person class and print "I am in Person class" because static methods are called based on the reference type, not the object type. Here, objectPerson is a reference of type Person, so it will call the static method of the Person class.

        // 6. Final methods: These are methods that cannot be overridden by subclasses. They are declared using the final keyword.
        Person.additonalDetails(); // When marked as final, it cannot be overridden in the Person subclass

        // 7. Abstract methods: These are methods that are declared without an implementation and must be implemented by subclasses. They are declared using the abstract keyword.
        Surgeon surgeon = new Nurse();
        surgeon.performSurgery(); // This will call the performSurgery() method of the Nurse class and print "Performing surgery with a Surgeon" because the performSurgery() method is overridden in the Nurse class.
        // The assistInSurgery() method cannot be overridden in the Nurse class because it is declared as final in the Surgeon class.

        // Using Variable Arguments (Varargs) to sum an arbitrary number of integers
        calculation.sumOfNumbers(3);
        calculation.sumOfNumbers(3, 5);
        calculation.sumOfNumbers(3, 5, 7);
        calculation.sumOfNumbers(3, 5, 7, 9);
        calculation.sumOfNumbers(1, 2, 4, 8, 16, 32, 64);

        calculation.sumOfNumbersWithDefaultValue(10.0); // This will call the sumOfNumbersWithDefaultValue method with a default value of 10.0 and no additional integers to sum, so it will print "Sum of the provided values is: 10.0"
        calculation.sumOfNumbersWithDefaultValue(10.0, 5); // This will call the sumOfNumbersWithDefaultValue method with a default value of 10.0 and one additional integer to sum, so it will print "Sum of the provided values is: 15.0"
        calculation.sumOfNumbersWithDefaultValue(10.0, 5, 10); // This will call the sumOfNumbersWithDefaultValue method with a default value of 10.0 and two additional integers to sum, so it will print "Sum of the provided values is: 25.0"
        calculation.sumOfNumbersWithDefaultValue(10.0, 50, 150, 250); // This will call the sumOfNumbersWithDefaultValue method with a default value of 10.0 and three additional integers to sum, so it will print "Sum of the provided values is: 460.0"
    }
}
