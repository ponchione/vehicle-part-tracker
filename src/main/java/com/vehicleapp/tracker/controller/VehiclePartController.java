package com.vehicleapp.tracker.controller;

import com.vehicleapp.tracker.DTO.VehiclePartDTO;
import com.vehicleapp.tracker.model.VehiclePart;
import com.vehicleapp.tracker.service.VehiclePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehiclePartController {

    private final VehiclePartService service;

    @Autowired
    public VehiclePartController(final VehiclePartService vps) {
        this.service = vps;
    }

    @GetMapping(path = "/all")
    public List<VehiclePartDTO> getAllPartsByVehicle() {
        return service.getAllPartsByVehicle();
    }

}
