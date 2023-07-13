package com.keyin.airport.controller;

import com.keyin.airport.Airport;
import com.keyin.city.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {
}

