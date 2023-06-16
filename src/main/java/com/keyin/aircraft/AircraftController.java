package com.keyin.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {
    @Autowired
    private AircraftService aircraftService;
    @GetMapping("/aircraft")
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }
}
