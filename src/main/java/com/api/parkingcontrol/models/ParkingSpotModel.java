package com.api.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_parking_spot")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false,  unique = true, length = 100)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length =  7)
    private String carLicensePlate;
    @Column(nullable = false, length = 70)
    private String carBrand;
    @Column(nullable = false, length = 70)
    private String carModel;
    @Column(nullable = false, length = 70)
    private String carColor;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column (nullable = false)
    private String responsibleName;
    @Column(nullable = false, length = 100)
    private String apartmentNumber;
    @Column(nullable = false, length = 100)
    private String apartmentBlock;
}
