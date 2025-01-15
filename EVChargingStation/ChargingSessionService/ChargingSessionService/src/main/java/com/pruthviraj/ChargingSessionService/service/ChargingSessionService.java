package com.pruthviraj.ChargingSessionService.service;

import com.pruthviraj.ChargingSessionService.model.ChargingSession;
import com.pruthviraj.ChargingSessionService.repository.ChargingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingSessionService {

    @Autowired
    private ChargingSessionRepository repository;

    public ChargingSession createSession(ChargingSession session) {
        return repository.save(session);
    }

    public List<ChargingSession> getSessionsByCustomerId(Long customerId) {
        return repository.findByCustomerId(customerId);
    }

    public List<ChargingSession> getSessionsByStationId(Long stationId) {
        return repository.findByStationId(stationId);
    }

    public void deleteSession(Long id) {
        repository.deleteById(id);
    }
}
