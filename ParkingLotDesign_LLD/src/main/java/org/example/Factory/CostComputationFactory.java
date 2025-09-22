package org.example.Factory;

import org.example.Cost.CostComputation;
import org.example.Cost.FourWheelerCostComputation;
import org.example.Cost.TwoWheelerCostComputation;
import org.example.Pricing.PricingStrategy;
import org.example.Spot_Type;
import org.example.Vehicle;

public class CostComputationFactory {

    PricingStrategy pricingStrategy;

    public CostComputation getCostComputation(Vehicle vehicle){
         if(vehicle.getVehicle_type().equals(Spot_Type.TWO_WHEELER)){
              return new TwoWheelerCostComputation(this.pricingStrategy);
         }
         else if(vehicle.getVehicle_type().equals(Spot_Type.HEAVY_WHEELER)){
              return new FourWheelerCostComputation(this.pricingStrategy);
         }
         return null;
    }
}
