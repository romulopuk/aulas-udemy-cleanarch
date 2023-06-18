package com.arantes.cleanarch.core.domain;

import com.arantes.cleanarch.dataprovider.client.response.AddressResponse;

public record Address(
        String street,
        String city,
        String state
) {

    public Address(AddressResponse response) {
        this(response.street(), response.city(), response.state());
    }
}
