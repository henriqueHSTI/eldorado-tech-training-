package org.eldorado.week.two.solid.repository.impl;

import org.eldorado.week.two.solid.model.BillingEntity;
import org.eldorado.week.two.solid.repository.SaveInvoice;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillingRepositoryStorage implements SaveInvoice {
    private static final Logger LOGGER = Logger.getLogger(BillingRepositoryStorage.class.getName());

    @Override
    public void saveBillingEntity(BillingEntity billing) {
        LOGGER.log(Level.INFO, () ->
                MessageFormat.format("Persisting this: {0} ", billing.toString()));
    }

}