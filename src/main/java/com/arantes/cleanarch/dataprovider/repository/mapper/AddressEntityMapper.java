package com.arantes.cleanarch.dataprovider.repository.mapper;

import com.arantes.cleanarch.core.domain.Address;
import com.arantes.cleanarch.dataprovider.repository.entity.AddressEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AddressEntityMapper implements Function<Address, AddressEntity> {

    @Override
    public AddressEntity apply(Address address) {
        return new AddressEntity(address.street(), address.city(), address.state());
    }
}
