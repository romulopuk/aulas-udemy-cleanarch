package com.arantes.cleanarch.entrypoint.controller;

import com.arantes.cleanarch.core.domain.Customer;
import com.arantes.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.arantes.cleanarch.core.usecase.InsertCustomerUseCase;
import com.arantes.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.arantes.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.arantes.cleanarch.entrypoint.controller.response.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final InsertCustomerUseCase insertUseCase;
    private final FindCustomerByIdUseCase findByIdUseCase;
    private final UpdateCustomerUseCase updateUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        insertUseCase.insert(new Customer(request), request.zipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var result = new CustomerResponse(findByIdUseCase.find(id));
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,
                                       @Valid @RequestBody CustomerRequest request) {
        var customer = new Customer(id, request.nome(), request.cpf(), null, false);
        updateUseCase.update(customer, request.zipCode());
        return ResponseEntity.noContent().build();
    }
}
