package com.arantes.cleanarch.core.domain;

import com.arantes.cleanarch.entrypoint.controller.request.CustomerRequest;

public record Customer(
        String id,
        String name,
        String cpf,
        Address address,
        boolean isValidCpf
) {

    public Customer(Customer customerInfo, Address addressInfo) {
        this(customerInfo.id,
                customerInfo.name,
                customerInfo.cpf,
                addressInfo,
                false);
    }

    public Customer(CustomerRequest request){
        this("", request.nome(), request.cpf(), null, false);
    }
}
