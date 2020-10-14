package com.vehicleapp.tracker.service;

import com.vehicleapp.tracker.DTO.VehiclePartDTO;

import java.util.List;

public interface VehiclePartService {

    List<VehiclePartDTO> getAllPartsByVehicle();
}
