package com.pruthviraj.ChargingSessionService.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ChargingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long stationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Double energyConsumed; // in kWh

    // Constructors
    public ChargingSession() {}

    public ChargingSession(Long customerId, Long stationId, LocalDateTime startTime, LocalDateTime endTime, Double energyConsumed) {
        this.customerId = customerId;
        this.stationId = stationId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.energyConsumed = energyConsumed;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Double getEnergyConsumed() {
        return energyConsumed;
    }

    public void setEnergyConsumed(Double energyConsumed) {
        this.energyConsumed = energyConsumed;
    }
}
