package com.polytech.alertcovidservicelocation.controllers;

import com.polytech.alertcovidservicelocation.models.Location;
import com.polytech.alertcovidservicelocation.models.LocationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations/")
public class LocationsController {
    @Autowired
    private LocationRepository locationRepository;


    @GetMapping
    public List<Location> list() {
        return locationRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Location create(@RequestBody final Location location) {
        return locationRepository.saveAndFlush(location);
    }

}
