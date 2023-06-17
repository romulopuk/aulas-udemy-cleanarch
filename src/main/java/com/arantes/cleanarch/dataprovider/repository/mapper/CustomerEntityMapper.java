package com.arantes.cleanarch.dataprovider.repository.mapper;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.dataprovider.repository.entity.CustomerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class CustomerEntityMapper implements Function<Customer, CustomerEntity> {

    private final AddressEntityMapper mapper;

    @Override
    public CustomerEntity apply(Customer customer) {
        return new CustomerEntity(
                customer.id(),
                customer.name(),
                mapper.apply(customer.address()),
                customer.cpf(),
                customer.isValidCpf()
        );
    }
}
