package org.example.Factory;

import org.example.Managers.ParkingSpotManager;
import org.example.Managers.TwoWheelerManager;
import org.example.Spot_Type;
import org.example.Vehicle;

public class ParkingManagerFactory {


    public ParkingSpotManager getParkingManager(Vehicle vehicle){
       if(vehicle.getVehicle_type().equals(Spot_Type.TWO_WHEELER)){
              return new TwoWheelerManager();
       }
       else if(vehicle.getVehicle_type().equals(Spot_Type.FOUR_WHEELER)){
              return new FourWheelerManager();
       }
       return null;
    }

}
