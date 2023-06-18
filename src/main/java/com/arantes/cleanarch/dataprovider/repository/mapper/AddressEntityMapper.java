package com.arantes.cleanarch.dataprovider.repository.mapper;

import com.arantes.cleanarch.core.domain.Address;
import com.arantes.cleanarch.dataprovider.repository.entity.AddressEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressEntityMapper {

    AddressEntity toEntity(Address address);

    Address toDomain(AddressEntity entity);
}
