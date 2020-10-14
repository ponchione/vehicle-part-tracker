package com.vehicleapp.tracker.repository;

import com.vehicleapp.tracker.model.VehiclePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiclePartRepository extends JpaRepository<VehiclePart, Long> {
//
    List<VehiclePart> findByVehicle(final String vehicle);
//
//    List<VehiclePart> findByPartType(final String type);
//
//    VehiclePartDTO findById(final long id);
}
