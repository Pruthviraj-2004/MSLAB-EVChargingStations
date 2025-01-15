package com.pruthviraj.ChargingSessionService.controller;

import com.pruthviraj.ChargingSessionService.model.ChargingSession;
import com.pruthviraj.ChargingSessionService.service.ChargingSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/charging-sessions")
public class ChargingSessionController {

    @Autowired
    private ChargingSessionService service;

    @PostMapping
    public ResponseEntity<ChargingSession> createSession(@RequestBody ChargingSession session) {
        ChargingSession createdSession = service.createSession(session);
        return ResponseEntity.ok(createdSession);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<ChargingSession>> getSessionsByCustomerId(@PathVariable Long customerId) {
        return ResponseEntity.ok(service.getSessionsByCustomerId(customerId));
    }

    @GetMapping("/station/{stationId}")
    public ResponseEntity<List<ChargingSession>> getSessionsByStationId(@PathVariable Long stationId) {
        return ResponseEntity.ok(service.getSessionsByStationId(stationId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSession(@PathVariable Long id) {
        service.deleteSession(id);
        return ResponseEntity.ok("Charging session deleted successfully.");
    }
}
