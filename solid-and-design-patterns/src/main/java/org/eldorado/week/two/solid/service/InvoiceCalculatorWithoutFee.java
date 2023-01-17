package org.eldorado.week.two.solid.service;


import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;


public class InvoiceCalculatorWithoutFee extends InvoiceCalculator {

    public InvoiceCalculatorWithoutFee(InvoiceBookEntity invoiceBookEntity) {
        super(invoiceBookEntity);
    }

    @Override
    public double calculateTotalAmount() {
        var price = ((invoiceBookEntity.getBook().getPrice() - invoiceBookEntity.getBook().getPrice() * invoiceBookEntity.getDiscount())) * invoiceBookEntity.getQuantity();
        return (price + invoiceBookEntity.getShipping());
    }
}
