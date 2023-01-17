package org.eldorado.week.two.solid.service;

import lombok.AllArgsConstructor;
import org.eldorado.week.two.solid.model.BillingEntity;
import org.eldorado.week.two.solid.model.BookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


@AllArgsConstructor
public class InvoiceBookPrinter {
    private static final Logger LOGGER = Logger.getLogger(InvoiceBookPrinter.class.getName());

    public void printBilling(BillingEntity billing) {
        LOGGER.log(Level.INFO, () -> MessageFormat.format("{0}", billing.toString()));

    }

}
