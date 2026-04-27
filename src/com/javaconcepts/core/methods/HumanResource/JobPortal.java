package com.javaconcepts.core.methods.HumanResource;

import com.javaconcepts.core.methods.SalesDepartment.Invoice;

public class JobPortal extends Invoice {

    // Public method to generate an invoice for maintaining the job portal, which internally calls the protected method by extending Invoice class
    public void getInvoiceForMaintainingJobPortal() {
        System.out.println("Generating invoice for job posting...");
        fetchInvoiceData();
    }
}
