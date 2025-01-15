package com.pruthviraj.StationRegistration.service;

import com.pruthviraj.StationRegistration.model.Station;
import com.pruthviraj.StationRegistration.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    // Add a new station
    public Station addStation(Station station) {
        return stationRepository.save(station);
    }

    // Get all stations
    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }

    // Get a station by ID
    public Station getStationById(Long id) {
        return stationRepository.findById(id).orElseThrow(() -> new RuntimeException("Station not found!"));
    }

    // Delete a station by ID
    public void deleteStation(Long id) {
        stationRepository.deleteById(id);
    }
}
