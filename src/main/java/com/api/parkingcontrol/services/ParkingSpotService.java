package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositores.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

//    @Autowired
//    ParkingSpotRepository parkingSpotRepository;

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService (ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
