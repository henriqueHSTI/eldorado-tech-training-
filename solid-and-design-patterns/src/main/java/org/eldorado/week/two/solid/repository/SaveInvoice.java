package org.eldorado.week.two.solid.repository;

import org.eldorado.week.two.solid.model.BillingEntity;

public interface SaveInvoice {
    void saveBillingEntity(BillingEntity billing);

}