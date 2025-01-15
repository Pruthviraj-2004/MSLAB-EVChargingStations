package com.pruthviraj.StationRegistration.controller;

import com.pruthviraj.StationRegistration.model.Station;
import com.pruthviraj.StationRegistration.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class StationController {

    @Autowired
    private StationService stationService;

    // Add a new station
    @PostMapping
    public ResponseEntity<Station> addStation(@RequestBody Station station) {
        Station newStation = stationService.addStation(station);
        return ResponseEntity.ok(newStation);
    }

    // Get all stations
    @GetMapping
    public ResponseEntity<List<Station>> getAllStations() {
        List<Station> stations = stationService.getAllStations();
        return ResponseEntity.ok(stations);
    }

    // Get a station by ID
    @GetMapping("/{id}")
    public ResponseEntity<Station> getStationById(@PathVariable Long id) {
        Station station = stationService.getStationById(id);
        return ResponseEntity.ok(station);
    }

    // Delete a station by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStation(@PathVariable Long id) {
        stationService.deleteStation(id);
        return ResponseEntity.ok("Station deleted successfully");
    }
}