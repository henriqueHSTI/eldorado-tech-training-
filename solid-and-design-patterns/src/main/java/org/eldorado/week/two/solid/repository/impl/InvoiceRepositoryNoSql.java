package org.eldorado.week.two.solid.repository.impl;

import org.eldorado.week.two.solid.repository.SaveInvoice;
import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvoiceRepositoryNoSql implements SaveInvoice {
    private static final Logger LOGGER = Logger.getLogger(InvoiceRepositoryNoSql.class.getName());

    @Override
    public void saveInvoice(InvoiceBookEntity invoiceBookEntity) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("I will persisting in mongo DB: {0}", invoiceBookEntity.toString()));
    }
}
