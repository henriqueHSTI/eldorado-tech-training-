package org.eldorado.week.two;

import org.eldorado.week.two.solid.model.BillingEntity;
import org.eldorado.week.two.solid.model.BookEntity;
import org.eldorado.week.two.solid.service.BillingCalculator;
import org.eldorado.week.two.solid.service.InvoiceBookPrinter;

public class Main {
    public static void main(String[] args) {

        BillingCalculator calculator = new BillingCalculator();
        InvoiceBookPrinter invoiceBookPrinter = new InvoiceBookPrinter();

        BookEntity book = BookEntity.builder().bookTitle("Ação humana").authorName("Ludwig Von Mises").year(1949).price(249.90).isbn("9780865976313").build();
        BillingEntity billing = BillingEntity.builder().book(book).quantity(1).discount(0).fee(9.90).shipping(19.90).build();
        billing.setTotalAmount(calculator.calculateTotalAmount(book, billing));

        invoiceBookPrinter.printBilling(billing);

    }
}