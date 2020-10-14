package com.vehicleapp.tracker.service;

import com.vehicleapp.tracker.DTO.VehiclePartDTO;
import com.vehicleapp.tracker.repository.VehiclePartRepository;
import com.vehicleapp.tracker.util.VehiclePartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclePartServiceImpl implements VehiclePartService {

    private final VehiclePartMapper mapper = VehiclePartMapper.INSTANCE;

    private final VehiclePartRepository repository;

    @Autowired
    public VehiclePartServiceImpl(final VehiclePartRepository repo) {
        this.repository = repo;
    }

    @Override
    public List<VehiclePartDTO> getAllPartsByVehicle() {
        return mapper.toPartDtoList(repository.findByVehicle(""));
    }
}
