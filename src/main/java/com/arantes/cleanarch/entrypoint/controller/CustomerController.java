package com.arantes.cleanarch.entrypoint.controller;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.usecase.InsertCustomerUseCase;
import com.arantes.cleanarch.entrypoint.controller.request.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final InsertCustomerUseCase useCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        useCase.insert(new Customer(request), request.zipCode());
        return ResponseEntity.ok().build();
    }
}
