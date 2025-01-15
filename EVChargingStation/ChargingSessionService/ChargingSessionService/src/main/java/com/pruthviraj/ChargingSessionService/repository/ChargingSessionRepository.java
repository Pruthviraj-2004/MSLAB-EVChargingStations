package com.pruthviraj.ChargingSessionService.repository;

import com.pruthviraj.ChargingSessionService.model.ChargingSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChargingSessionRepository extends JpaRepository<ChargingSession, Long> {
    List<ChargingSession> findByCustomerId(Long customerId);
    List<ChargingSession> findByStationId(Long stationId);
}
