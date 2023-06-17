package com.arantes.cleanarch.core.domain;

import com.arantes.cleanarch.dataprovider.client.response.AddressResponse;
import com.arantes.cleanarch.dataprovider.repository.entity.AddressEntity;

public record Address(
        String street,
        String city,
        String state
) {

    public Address(AddressResponse response) {
        this(response.street(), response.city(), response.state());
    }

    public Address(AddressEntity entity) {
        this(entity.getStreet(), entity.getCity(), entity.getState());
    }
}
