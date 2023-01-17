package org.eldorado.week.two.solid.repository;

import org.eldorado.week.two.solid.repository.impl.InvoiceRepositoryNoSql;
import org.eldorado.week.two.solid.repository.impl.InvoiceRepositoryStorage;
import org.eldorado.week.two.solid.repository.model.InvoiceBookEntity;


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
