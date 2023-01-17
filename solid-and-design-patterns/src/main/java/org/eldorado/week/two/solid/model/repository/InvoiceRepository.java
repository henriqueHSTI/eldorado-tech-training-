package org.eldorado.week.two.solid.model.repository;

import lombok.AllArgsConstructor;
import org.eldorado.week.two.solid.model.InvoiceBookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
public class InvoiceRepository {
    private static final Logger LOGGER = Logger.getLogger(InvoiceRepository.class.getName());
    private final InvoiceBookEntity invoiceBookEntity;

    public void saveToStorage(String fileName) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("I will persisting this: {0} to File {1}", invoiceBookEntity.toString(), fileName));
    }
    public void saveToMongoDB(String fileName) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("I will persisting this: {0} to File {1}", invoiceBookEntity.toString(), fileName));
    }
}
