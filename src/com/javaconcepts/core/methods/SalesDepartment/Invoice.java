package com.javaconcepts.core.methods.SalesDepartment;

public class Invoice {

    // protected method to fetch invoice data, which can be accessed by subclasses or classes in the same package
    protected void fetchInvoiceData() {
        System.out.println("This is a protected method to fetch invoice data.");
    }

    // public method to print the invoice, which internally calls the private method
    public void printInvoice() {
        System.out.println("This is a private method to print the invoice.");
        generateInvoice();
    }

    // private method to generate an invoice
    private void generateInvoice() {
        System.out.println("Generating invoice for the sales department...");
    }

    // default method to get invoice details, which can be accessed by classes in the same package
    void getInvoice() {
        System.out.println("This is a default method to get invoice details.");
    }
}
