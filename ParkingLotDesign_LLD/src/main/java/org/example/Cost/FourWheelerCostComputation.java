package org.example.Cost;

import org.example.Pricing.PricingStrategy;
import org.example.Ticket;

public class FourWheelerCostComputation implements CostComputation{

    PricingStrategy pricingStrategy;

    Ticket ticket;

    public FourWheelerCostComputation(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;
    }

    @Override
    public int price(PricingStrategy strategy) {
        return pricingStrategy.caluculatePrice(ticket);
    }
}
