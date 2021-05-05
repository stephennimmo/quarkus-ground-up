package dev.rhenergy.customer;

import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface CustomerMapper {

    CustomerEntity toEntity(Customer domain);

    Customer toDomain(CustomerEntity entity);

}
