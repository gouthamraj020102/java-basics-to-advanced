package com.javaconcepts.core.methods;

import com.javaconcepts.core.methods.HumanResource.JobPortal;
import com.javaconcepts.core.methods.SalesDepartment.Invoice;
import com.javaconcepts.core.methods.SalesDepartment.Order;

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
    }
}
