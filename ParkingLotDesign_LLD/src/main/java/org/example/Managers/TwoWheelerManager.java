package org.example.Managers;

import org.example.ParkingSpots.ParkingSpot;
import org.example.ParkingSpots.TwoWheelerParkingSpot;
import org.example.Ticket;
import org.example.Vehicle;

import java.util.List;

public class TwoWheelerManager implements ParkingSpotManager{

    List<TwoWheelerParkingSpot> list_of_spots;

    public TwoWheelerManager(List<TwoWheelerParkingSpot> list_of_spots) {
        this.list_of_spots = list_of_spots;
    }

    @Override
    public void find_parking_space() {

    }

    @Override
    public void add_parking_space() {

    }

    @Override
    public void remove_parking_space() {

    }

    @Override
    public Ticket park_vehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        return null;
    }

    @Override
    public void remove_vehicle(Vehicle) {

    }
}
