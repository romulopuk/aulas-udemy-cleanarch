package com.arantes.cleanarch.entrypoint.controller.response;

import com.arantes.cleanarch.core.domain.Address;

public record AddressResponse(String street,
                              String city,
                              String state) {

    public AddressResponse(Address domain) {
        this(domain.street(), domain.city(), domain.state());
    }
}
