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

    private VehiclePartService service;

    @Autowired
    public VehiclePartController(final VehiclePartService vps) {
        this.service = vps;
    }

    @GetMapping(path = "/all")
//    public ResponseEntity<List<VehiclePartDTO>> getAllParts() {
    public void getAllParts() {
        //return service.getAllParts();
    }

}
