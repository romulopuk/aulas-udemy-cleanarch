package com.arantes.cleanarch.dataprovider.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressEntity {

    private String street;
    private String city;
    private String state;
}
