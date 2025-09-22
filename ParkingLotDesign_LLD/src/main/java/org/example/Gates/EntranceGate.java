package org.example.Gates;

import org.example.Factory.ParkingManagerFactory;
import org.example.Managers.ParkingSpotManager;
import org.example.ParkingSpots.ParkingSpot;
import org.example.Ticket;
import org.example.Vehicle;

public class EntranceGate {
//    int gate_number; for future to implement this
    ParkingManagerFactory parkingManagerFactory;

    ParkingSpotManager parkingSpotManager;

    Ticket ticket;

    public void setParkingSpotManager(Vehicle vehicle){
        this.parkingSpotManager=parkingManagerFactory.getParkingManager(vehicle);
    }

    public ParkingSpot findSpace(){
        ParkingSpot parkingSpot = parkingSpotManager.find_parking_space();
        return parkingSpot;
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot){
        ticket = parkingSpotManager.park_vehicle(vehicle, spot);
        return ticket;
    }
}
