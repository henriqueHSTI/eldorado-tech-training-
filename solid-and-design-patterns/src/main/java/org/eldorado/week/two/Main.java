package org.eldorado.week.two;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

//        var bookTitle = "Clean Code";
//        var authorName = "Robert J. Martin";
//        var year = 2000;
//        var price = 97.99;
//        var isbn = "123456";
//
//        var book = new BookEntity(bookTitle, authorName, year, price, isbn);
//
//        var quantity = 1;
//        var discount = 0.15;
//        double fee = 0.11;
//        double shipping = 3.0;
//
//        var invoce = new InvoiceBookEntity(book, quantity, discount, fee, shipping);
//
//        var invoiceCalulator = new InvoiceCalculator(invoce);
//        invoce.setTotalAmount(invoiceCalulator.calculateTotalAmount());
//
//
//        var invoicePrinter = new InvoiceBookPrinter(invoce);
//        invoicePrinter.printBilling();
//
//        var invoicesitory = new InvoiceRepository(invoce);
//        invoicesitory.saveToFile("New Invooce");

        var valor = 0.30;
        Double valor2 = valor * 3;

        System.out.println(new DecimalFormat("#,##0.00").format(valor2));

    }
}