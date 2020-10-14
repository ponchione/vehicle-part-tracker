package com.vehicleapp.tracker.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehiclePartDTO {

    private long id;

    private String vehicle;

    private String partName;

    private String partType;

    private BigDecimal price;

    private String url;

}
