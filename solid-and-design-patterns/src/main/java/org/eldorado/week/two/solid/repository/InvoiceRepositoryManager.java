package org.eldorado.week.two.solid.repository;

import lombok.AllArgsConstructor;
import org.eldorado.week.two.solid.repository.impl.InvoiceRepositoryNoSql;
import org.eldorado.week.two.solid.repository.impl.InvoiceRepositoryStorage;
import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
public class InvoiceRepositoryManager {
    public InvoiceRepositoryStorage invoiceRepositoryStorage;
    public InvoiceRepositoryNoSql invoiceRepositoryNoSql;

    public InvoiceRepositoryManager(InvoiceRepositoryStorage invoiceRepositoryStorage) {
        this.invoiceRepositoryStorage = invoiceRepositoryStorage;
    }

    public InvoiceRepositoryManager(InvoiceRepositoryNoSql invoiceRepositoryNoSql) {
        this.invoiceRepositoryNoSql = invoiceRepositoryNoSql;
    }

    public void save(InvoiceRepositoryStorage invoiceRepositoryStorage, InvoiceBookEntity invoice) {
        invoiceRepositoryStorage.saveInvoice(invoice);
    }

    public void save(InvoiceRepositoryNoSql invoiceRepositoryStorage, InvoiceBookEntity invoice) {
        invoiceRepositoryStorage.saveInvoice(invoice);
    }
}
