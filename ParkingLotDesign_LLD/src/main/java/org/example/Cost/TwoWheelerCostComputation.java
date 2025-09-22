package org.example.Cost;

import org.example.Pricing.PricingStrategy;
import org.example.Ticket;

public class TwoWheelerCostComputation implements CostComputation{

    PricingStrategy pricingStrategy;

    Ticket ticket;

    public TwoWheelerCostComputation(PricingStrategy strategy){
        this.pricingStrategy=strategy;
    }

    @Override
    public int price(PricingStrategy strategy) {
        return pricingStrategy.caluculatePrice(ticket);
    }
}
