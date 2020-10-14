package com.vehicleapp.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "Parts")
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
