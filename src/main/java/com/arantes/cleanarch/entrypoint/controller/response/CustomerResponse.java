package com.arantes.cleanarch.entrypoint.controller.response;

import com.arantes.cleanarch.core.domain.Customer;

public record CustomerResponse(String name,
                               String cpf,
                               Boolean isValidCpf,
                               AddressResponse address) {

    public CustomerResponse(Customer customer) {
        this(
                customer.name(),
                customer.cpf(),
                customer.isValidCpf(),
                new AddressResponse(customer.address()));
    }
}

