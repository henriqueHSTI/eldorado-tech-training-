package org.eldorado.week.two.solid.repository;

import org.eldorado.week.two.solid.model.BillingEntity;
import org.eldorado.week.two.solid.repository.impl.BillingRepositoryNoSQL;
import org.eldorado.week.two.solid.repository.impl.BillingRepositoryStorage;

public class BillingRepository {

    public BillingRepositoryStorage billingRepositoryStorage;
    public BillingRepositoryNoSQL billingRepositoryNoSQL;

    public void billingRepositoryManager(BillingRepositoryStorage billingRepositoryStorage) {
        this.billingRepositoryStorage = billingRepositoryStorage;
    }

    public void billingRepositoryManager(BillingRepositoryNoSQL billingRepositoryNoSQL) {
        this.billingRepositoryNoSQL = billingRepositoryNoSQL;
    }

    public void save(BillingRepositoryStorage billingRepositoryStorage, BillingEntity billing) {
        billingRepositoryStorage.saveBillingEntity(billing);
    }

    public void save(BillingRepositoryNoSQL billingRepositoryNoSQL, BillingEntity billing) {
        billingRepositoryNoSQL.saveBillingEntity(billing);
    }
}
