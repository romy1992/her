package com.stat.bradip.resource.management;

import org.mapstruct.Mapper;

import com.stat.bradip.commons.model.CustomerModel;
import com.stat.bradip.resource.entity.Customer;

@Mapper(componentModel = "spring")
public abstract class MappingMapStruct {

	public abstract CustomerModel mappingEntityToModel(Customer model);

	public abstract Customer mappingModelToEntity(CustomerModel entity);

	
}
