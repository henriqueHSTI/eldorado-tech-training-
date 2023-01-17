package org.eldorado.week.two.solid.repository.model;

import lombok.Data;


@Data
public class InvoiceBookEntity {
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
                "\ntotalAmount= R$ " + totalAmount;
    }
}
