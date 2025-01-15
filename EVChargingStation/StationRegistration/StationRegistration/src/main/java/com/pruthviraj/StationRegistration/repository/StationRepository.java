package com.pruthviraj.StationRegistration.repository;


import com.pruthviraj.StationRegistration.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}

