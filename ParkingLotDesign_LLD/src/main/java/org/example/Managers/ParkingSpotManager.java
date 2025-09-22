package org.example.Managers;

import org.example.ParkingSpots.ParkingSpot;
import org.example.Ticket;
import org.example.Vehicle;

public interface ParkingSpotManager {
//    List<ParkingSpot> list_of_spots;

    void find_parking_space();
    void add_parking_space();
    void remove_parking_space();
    Ticket park_vehicle(Vehicle vehicle, ParkingSpot parkingSpot);
    void remove_vehicle();
}
