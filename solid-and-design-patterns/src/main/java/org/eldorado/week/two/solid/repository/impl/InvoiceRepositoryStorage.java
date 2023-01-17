package org.eldorado.week.two.solid.repository.impl;

import org.eldorado.week.two.solid.repository.SaveInvoice;
import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InvoiceRepositoryStorage implements SaveInvoice {
    private static final Logger LOGGER = Logger.getLogger(InvoiceRepositoryStorage.class.getName());

    @Override
    public void saveInvoice(InvoiceBookEntity invoiceBookEntity) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("I will persisting this: {0} ", invoiceBookEntity.toString()));
    }
}
