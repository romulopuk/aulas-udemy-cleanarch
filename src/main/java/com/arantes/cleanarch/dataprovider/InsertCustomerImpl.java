package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.dataprovider.InsertCustomer;
import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import com.arantes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {

    private final CustomerRepository repository;
    private final CustomerEntityMapper mapper;

    @Override
    public void insert(Customer customer) {
        repository.save(mapper.apply(customer));
    }
}
