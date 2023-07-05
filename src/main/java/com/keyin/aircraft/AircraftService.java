package com.keyin.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AircraftService {
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();

    @Autowired
    private AircraftRepository aircraftRepository;

    public AircraftService() {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1);
        aircraft.setBrand("Boeing");
        aircraft.setModel("737");
        aircraft.setTailNumber("AF-1234");

        aircraftList.add(aircraft);
    }

    public List<Aircraft> getAllAircraft() {
        return aircraftList;
    }

    public List<Aircraft> getAllAircraftFromDB() {
        return (List<Aircraft>) aircraftRepository.findAll();
    }

    public Aircraft createAircraft(Aircraft aircraft) {
        return (Aircraft) aircraftRepository.save(aircraft);
    }
}
