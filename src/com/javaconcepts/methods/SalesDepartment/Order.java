package com.javaconcepts.methods.SalesDepartment;

public class Order {

    // Public method to get order details, which internally calls the default and protected methods from the Invoice class
    public void getOrder() {
        Invoice invoice = new Invoice();
        invoice.getInvoice();
        invoice.fetchInvoiceData();
    }

    // Fetching return types in Java, demonstrating void and boolean return types
    public void getReturnTypes() {
        System.out.println("This method demonstrates return types in Java.");
        displayOrder();

        boolean isValid = isOrderValid();
        System.out.println("Is the order valid? " + isValid);

        int orderCount = getOrderCount();
        System.out.println("Total number of orders: " + orderCount);

        processOrder();
    }

    void displayOrder() {
        System.out.println("void displayOrder() method not returning any value, just displaying order details.");
    }

    boolean isOrderValid() {
        return true; // Assuming the order is valid for demonstration purposes
    }

    int getOrderCount() {
        return 5; // Returning a sample order count for demonstration purposes
    }

    void processOrder() {
        System.out.println("Processing the order...");
        return; // Using return statement to exit the method early
    }
}
