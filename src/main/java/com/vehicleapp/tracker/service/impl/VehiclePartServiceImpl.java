package com.vehicleapp.tracker.service.impl;

import com.vehicleapp.tracker.DTO.VehiclePartDTO;
import com.vehicleapp.tracker.repository.VehiclePartRepository;
import com.vehicleapp.tracker.service.VehiclePartService;
import com.vehicleapp.tracker.util.VehiclePartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclePartServiceImpl implements VehiclePartService {

    private final VehiclePartMapper mapper = VehiclePartMapper.INSTANCE;

    private VehiclePartRepository repository;

    @Autowired
    public VehiclePartServiceImpl(final VehiclePartRepository repo) {
        this.repository = repo;
    }

//    @Override
////    public ResponseEntity<VehiclePartDTO> getSingularPart() {
//    public ResponseEntity<VehiclePartDTO> getSingularPart() {
//        return new ResponseEntity();
//    }

//    @Override
//    public List<VehiclePartDTO> getAllParts() {
//        return repository.getAll();
//    }
}
