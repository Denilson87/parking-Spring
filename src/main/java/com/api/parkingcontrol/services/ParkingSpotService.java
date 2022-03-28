package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository ParkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository ParkingSpotRepository) {
        this.ParkingSpotRepository = ParkingSpotRepository;
    }
}
