package com.arantes.cleanarch.core.usecase.impl;

import com.arantes.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.arantes.cleanarch.core.dataprovider.InsertCustomer;
import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAdressByZipCode findAdressByZipCode;
    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(
            FindAdressByZipCode findAdressByZipCode,
            InsertCustomer insertCustomer) {

        this.findAdressByZipCode = findAdressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAdressByZipCode.find(zipCode);
        insertCustomer.insert(new Customer(customer, address));
    }
}
