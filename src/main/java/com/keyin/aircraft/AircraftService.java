package com.keyin.aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AircraftService {
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();

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
}
