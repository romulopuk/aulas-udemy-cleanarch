package com.arantes.cleanarch.core.dataprovider;

import com.arantes.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> findById(final String id);
}
