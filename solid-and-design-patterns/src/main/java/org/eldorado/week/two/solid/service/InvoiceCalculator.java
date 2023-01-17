package org.eldorado.week.two.solid.service;

import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;

public class InvoiceCalculator {
    protected InvoiceBookEntity invoiceBookEntity;

    public InvoiceCalculator(InvoiceBookEntity invoiceBookEntity) {
        this.invoiceBookEntity = invoiceBookEntity;
    }

    public double calculateTotalAmount() {
        var price = ((invoiceBookEntity.getBook().getPrice() - invoiceBookEntity.getBook().getPrice() * invoiceBookEntity.getDiscount()))
                * invoiceBookEntity.getQuantity();
        return (price * (1 + invoiceBookEntity.getFee()) + invoiceBookEntity.getShipping());
    }

    public void calcuteRoute() {

    }

    public void calcuteTimeToDelivery() {

    }
}
