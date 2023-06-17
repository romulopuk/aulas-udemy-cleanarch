package com.arantes.cleanarch.dataprovider.client;

import com.arantes.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAdressByZipCodeClient", url = "${arantes.client.address.url}")
public interface FindAdressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
