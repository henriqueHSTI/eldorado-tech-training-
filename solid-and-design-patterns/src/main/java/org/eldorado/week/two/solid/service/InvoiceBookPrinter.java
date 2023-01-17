package org.eldorado.week.two.solid.service;

import lombok.AllArgsConstructor;
import org.eldorado.week.two.solid.model.InvoiceBookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


@AllArgsConstructor
public class InvoiceBookPrinter {
    private static final Logger LOGGER = Logger.getLogger(InvoiceBookPrinter.class.getName());

    private final InvoiceBookEntity invoiceBookEntity;

    public void printBilling() {
        LOGGER.log(Level.INFO, () -> MessageFormat.format("Printg Billing {0}", invoiceBookEntity.toString()));
    }


}
