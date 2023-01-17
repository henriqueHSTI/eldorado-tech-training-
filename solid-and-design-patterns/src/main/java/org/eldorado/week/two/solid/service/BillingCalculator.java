package org.eldorado.week.two.solid.service;

import org.eldorado.week.two.solid.model.BillingEntity;
import org.eldorado.week.two.solid.model.BookEntity;

public class BillingCalculator {

    public double calculateTotalAmount(BookEntity book, BillingEntity billing) {
        double totalAmount = (book.getPrice() * billing.getQuantity()) + billing.getFee() - billing.getDiscount() + billing.getShipping();
        return totalAmount;
    }
}
