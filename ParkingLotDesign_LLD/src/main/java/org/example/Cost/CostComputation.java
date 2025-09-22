package org.example.Cost;

import org.example.Pricing.PricingStrategy;

public interface CostComputation{

    int price(PricingStrategy strategy);
}
