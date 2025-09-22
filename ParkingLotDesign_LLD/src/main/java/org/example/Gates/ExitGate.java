package org.example.Gates;

import org.example.Cost.CostComputation;
import org.example.Factory.CostComputationFactory;
import org.example.Factory.ParkingManagerFactory;
import org.example.Managers.ParkingSpotManager;
import org.example.Pricing.PricingStrategy;
import org.example.Ticket;
import org.example.Vehicle;

public class ExitGate {
    Ticket ticket;

    CostComputationFactory costComputationFactory;

    ParkingManagerFactory parkingManagerFactory;

    CostComputation costComputation;

    ParkingSpotManager parkingSpotManager;

    PricingStrategy strategy;

    Vehicle vehicle;

    ExitGate(Ticket ticket){
        this.ticket=ticket;
    }

    public int getPricetoPay(){
        this.costComputationFactory.getCostComputation(vehicle).price(strategy);
    }

//    TODO for later
    public int payment(){
        return 0;
    }

    public void unParkVehicle(Vehicle vehicle){
        this.parkingManagerFactory.getParkingManager(vehicle).remove_vehicle();
    }

}
