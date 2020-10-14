package com.vehicleapp.tracker.util;

import com.vehicleapp.tracker.DTO.VehiclePartDTO;
import com.vehicleapp.tracker.model.VehiclePart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VehiclePartMapper {

    VehiclePartMapper INSTANCE = Mappers.getMapper(VehiclePartMapper.class);

    //Map VehiclePart to VehiclePartDTO
    VehiclePartDTO toPartDto(final VehiclePart part);

    List<VehiclePartDTO> toPartDtoList(final List<VehiclePart> parts);
}
