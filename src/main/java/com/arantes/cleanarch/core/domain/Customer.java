package com.arantes.cleanarch.core.domain;

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
}
