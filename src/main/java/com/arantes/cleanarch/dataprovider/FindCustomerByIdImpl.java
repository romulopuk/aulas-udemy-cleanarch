package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.dataprovider.FindCustomerById;
import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import com.arantes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FindCustomerByIdImpl implements FindCustomerById {

    private final CustomerRepository repository;
    private final CustomerEntityMapper mapper;

    @Override
    public Optional<Customer> findById(String id) {
        var customerEntity = repository.findById(id);
        return customerEntity.map(mapper::toDomain);
    }
}
