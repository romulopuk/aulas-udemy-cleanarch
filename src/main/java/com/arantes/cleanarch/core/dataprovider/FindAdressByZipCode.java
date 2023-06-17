package com.arantes.cleanarch.core.dataprovider;

import com.arantes.cleanarch.core.domain.Address;

public interface FindAdressByZipCode {

    Address find(String zipCode);
}
