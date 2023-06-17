package com.arantes.cleanarch.core.domain;

import com.arantes.cleanarch.dataprovider.repository.entity.CustomerEntity;

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

    public Customer(CustomerEntity entity) {
        this(entity.getId(),
                entity.getName(),
                entity.getCpf(),
                new Address(entity.getAddress()),
                entity.getIsValidCpf());
    }
}
