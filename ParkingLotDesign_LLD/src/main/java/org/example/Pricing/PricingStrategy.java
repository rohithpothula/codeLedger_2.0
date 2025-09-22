package org.example.Pricing;

import org.example.Ticket;

public interface PricingStrategy {
    int caluculatePrice(Ticket ticket);
}
