package com.arantes.cleanarch.dataprovider;

import com.arantes.cleanarch.core.dataprovider.UpdateCustomer;
import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.dataprovider.repository.CustomerRepository;
import com.arantes.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    private final CustomerRepository repository;
    private final CustomerEntityMapper mapper;

    @Override
    public void update(Customer customer) {
        repository.save(mapper.toEntity(customer));
    }
}
