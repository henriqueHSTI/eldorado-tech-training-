package org.eldorado.week.two.solid.service;

import lombok.RequiredArgsConstructor;
import org.eldorado.week.two.solid.model.InvoiceBookEntity;

@RequiredArgsConstructor
public class InvoiceCalculator {

    private final InvoiceBookEntity invoiceBookEntity;

    public double calculateTotalAmount() {
        var price = ((invoiceBookEntity.getBook().getPrice() - invoiceBookEntity.getBook().getPrice() * invoiceBookEntity.getDiscount()))
                * invoiceBookEntity.getQuantity();
        return (price * (1 + invoiceBookEntity.getFee()) + invoiceBookEntity.getShipping());
    }

}
