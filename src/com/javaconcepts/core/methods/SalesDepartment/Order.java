package com.javaconcepts.core.methods.SalesDepartment;

public class Order {

    // Public method to get order details, which internally calls the default and protected methods from the Invoice class
    public void getOrder() {
        System.out.println("This is a public method to get order details.");
        Invoice invoice = new Invoice();
        invoice.getInvoice();
        invoice.fetchInvoiceData();
    }
}
