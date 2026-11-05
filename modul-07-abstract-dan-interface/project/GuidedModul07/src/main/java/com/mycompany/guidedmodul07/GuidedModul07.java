package com.mycompany.guidedmodul07;

public class GuidedModul07 {

    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println("1. PENGUJIAN ABSTRACT CLASS (EMPLOYEE)");
        System.out.println("==========================================");
        SalariedEmployee employee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        System.out.println(employee);
        System.out.printf("Total Earnings: $%,.2f\n\n", employee.earnings());

        System.out.println("==========================================");
        System.out.println("2. PENGUJIAN INTERFACE (PAYABLE & INVOICE)");
        System.out.println("==========================================");
        Invoice invoice = new Invoice("01234", "Seat", 2, 375.00);
        System.out.println(invoice);
        System.out.printf("Total Payment: $%,.2f\n", invoice.getPaymentAmount());
    }
}