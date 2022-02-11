package com.dondex.ddmongodb.mappers;

import com.example.ddcore.models.Business;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface BusinessMapper {
    BusinessMapper INSTANCE = Mappers.getMapper(BusinessMapper.class);

    Business businessEntityToBusinessModel(com.dondex.ddmongodb.entities.Business business);
    List<Business> listBusinessEntitiesToListBusinessModels(List<com.dondex.ddmongodb.entities.Business> businesses);
    com.dondex.ddmongodb.entities.Business businessModelToBusinessEntity(Business business);

}
