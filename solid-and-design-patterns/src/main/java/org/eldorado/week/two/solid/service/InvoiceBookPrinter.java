package org.eldorado.week.two.solid.service;

import lombok.AllArgsConstructor;
import org.eldorado.week.two.solid.model.BookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


@AllArgsConstructor
public class InvoiceBookPrinter {
    private static final Logger LOGGER = Logger.getLogger(InvoiceBookPrinter.class.getName());
    BookEntity book;
    int quantity;

    double discount;

    double fee;

    double totalAmount;

    double shipping;

    public double calculateTotalAmount() {
        var totalPrice = book.getPrice() + shipping;
        var price = (totalPrice - totalPrice * discount) * quantity;
        totalAmount = price * (1 + fee);
        return totalAmount;
    }

    public void printBilling() {
        LOGGER.log(Level.INFO, () -> MessageFormat.format("Printg Billing {0}", toString()));

    }

    public void saveToFile(String fileName) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("I will persisting this: {0} to File {1}", toString(), fileName));
    }

    @Override
    public String toString() {
        return "Billing" +
                "\nbook title= " + book.getBookTitle() +
                "\nquantity= " + quantity +
                "\ndiscount= " + discount +
                "\nfee= R$ " + fee +
                "\ntotalAmount= R$ " + totalAmount;
    }
}
