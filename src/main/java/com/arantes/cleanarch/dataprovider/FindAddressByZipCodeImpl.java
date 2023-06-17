package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.dataprovider.FindAdressByZipCode;
import com.arantes.cleanarch.core.domain.Address;
import com.arantes.cleanarch.dataprovider.client.FindAdressByZipCodeClient;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindAddressByZipCodeImpl implements FindAdressByZipCode {

    private final FindAdressByZipCodeClient client;

    @Override
    public Address find(String zipCode) {
        return new Address(client.find(zipCode));
    }
}
