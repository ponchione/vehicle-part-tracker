package com.vehicleapp.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehiclePart {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "part")
    private String partName;

    @Column(name = "type")
    private String partType;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "link")
    private String url;

}
