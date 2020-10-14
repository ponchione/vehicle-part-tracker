package com.vehicleapp.tracker.repository;

import com.vehicleapp.tracker.DTO.VehiclePartDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiclePartRepository {

    List<VehiclePartDTO> findByVehicle(final String vehicle);

    List<VehiclePartDTO> findByPartType(final String type);

    VehiclePartDTO findById(final long id);
}
