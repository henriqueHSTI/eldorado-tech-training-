package org.eldorado.week.two;

import org.eldorado.week.two.solid.repository.SaveInvoice;
import org.eldorado.week.two.solid.repository.impl.InvoiceRepositoryNoSql;
import org.eldorado.week.two.solid.repository.impl.InvoiceRepositoryStorage;
import org.eldorado.week.two.solid.repository.model.BookEntity;
import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;
import org.eldorado.week.two.solid.service.InvoiceBookPrinter;
import org.eldorado.week.two.solid.service.InvoiceCalculator;
import org.eldorado.week.two.solid.service.InvoiceCalculatorWithoutFee;

public class Main {
    public static void main(String[] args) {

        var bookTitle = "Clean Code";
        var authorName = "Robert J. Martin";
        var year = 2000;
        var price = 97.99;
        var isbn = "123456";

        var book = new BookEntity(bookTitle, authorName, year, price, isbn);

        var quantity = 1;
        var discount = 0.15;
        double fee = 0.11;
        double shipping = 3.0;

        var invoce = new InvoiceBookEntity(book, quantity, discount, fee, shipping);

        var invoiceCalulator = new InvoiceCalculator(invoce);
        invoce.setTotalAmount(invoiceCalulator.calculateTotalAmount());
        invoiceCalulator.calcuteRoute();

        var invoicePrinter = new InvoiceBookPrinter(invoce);
        invoicePrinter.printBilling();

        var invoiceCalulatorWithoutFee = new InvoiceCalculatorWithoutFee(invoce);
        invoce.setTotalAmount(invoiceCalulatorWithoutFee.calculateTotalAmount());
        invoiceCalulatorWithoutFee.calcuteRoute();

        invoicePrinter.printBilling();

        SaveInvoice saveInvoice = new InvoiceRepositoryStorage();
        saveInvoice.saveInvoice(invoce);

        saveInvoice = new InvoiceRepositoryNoSql();
        saveInvoice.saveInvoice(invoce);


    }
}