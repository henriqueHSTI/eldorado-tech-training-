package org.eldorado.week.two.solid.service;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillingRepository {

    private static final Logger LOGGER = Logger.getLogger(InvoiceBookPrinter.class.getName());

    public void saveToFile(String fileName) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("I will persisting this: {0} to File {1}", toString(), fileName));
    }
}
