package org.eldorado.week.two.solid.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


@AllArgsConstructor
@Data
public class InvoiceBookEntity {
    private static final Logger LOGGER = Logger.getLogger(InvoiceBookEntity.class.getName());
    BookEntity book;
    int quantity;

    double discount;

    double fee;

    double totalAmount;

    double shipping;

    public InvoiceBookEntity(BookEntity book, int quantity, double discount, double fee, double shipping) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.fee = fee;
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Billing" +
                "\nbook title= " + book.getBookTitle() +
                "\nquantity= " + quantity +
                "\ndiscount= " + discount +
                "\nfee= R$ " + fee +
                "\ntotalAmount= R$ " + new DecimalFormat("#,##0.00").format(totalAmount);
    }

}
