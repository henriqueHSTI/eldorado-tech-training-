package org.eldorado.week.two;

import org.eldorado.week.two.solid.repository.model.BookEntity;
import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;
import org.eldorado.week.two.solid.service.InvoiceBookPrinter;
import org.eldorado.week.two.solid.service.InvoiceCalculator;
import org.eldorado.week.two.solid.repository.InvoiceRepositoryManager;

public class Main {
    public static void main(String[] args) {

        var bookTitle = "Clean code";
        var authorName = "Robert J. Martin";
        var year = 2000;
        var price = 97.99;
        var isbn = "123456";

        var book = new BookEntity(bookTitle, authorName, year, price, isbn);

        var quantity = 1;
        var discount = 0.15;
        var fee = 0.11;
        var shipping = 3.0;

        var invoice = new InvoiceBookEntity(book, quantity, discount, fee, shipping);

        var invoiceCalculator = new InvoiceCalculator(invoice);
        invoice.setTotalAmount(invoiceCalculator.calculateTotalAmount());

        var invoicePrinter = new InvoiceBookPrinter(invoice);
        invoicePrinter.printBilling();

        var invoiceRepository = new InvoiceRepositoryManager(invoice);
        invoiceRepository.saveToStorage("New Invoice");

        System.out.println("Hello world!");
    }
}