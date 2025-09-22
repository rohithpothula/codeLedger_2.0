package org.example;

import org.example.ParkingSpots.ParkingSpot;

public class Ticket {
    Long entry_time;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(Long entry_time, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entry_time = entry_time;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public Long getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Long entry_time) {
        this.entry_time = entry_time;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
