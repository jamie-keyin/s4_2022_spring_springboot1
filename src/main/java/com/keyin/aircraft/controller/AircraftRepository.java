package com.keyin.aircraft.controller;

import com.keyin.aircraft.Aircraft;
import com.keyin.airport.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
