package com.arantes.cleanarch.core.usecase.impl;

import com.arantes.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.arantes.cleanarch.core.dataprovider.UpdateCustomer;
import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.arantes.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final UpdateCustomer updateCustomer;
    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAdressByZipCode findAdressByZipCode;

    public UpdateCustomerUseCaseImpl(UpdateCustomer updateCustomer,
                                     FindCustomerByIdUseCase findCustomerByIdUseCase,
                                     FindAdressByZipCode findAdressByZipCode
    ) {
        this.updateCustomer = updateCustomer;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAdressByZipCode = findAdressByZipCode;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.id());
        var address = findAdressByZipCode.find(zipCode);

        updateCustomer.update(new Customer(customer, address));
    }
}
