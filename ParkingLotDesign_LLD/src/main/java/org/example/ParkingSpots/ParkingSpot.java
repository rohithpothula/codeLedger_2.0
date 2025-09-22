package org.example.ParkingSpots;

import org.example.Spot_Type;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Spot_Type spot_type;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Spot_Type getSpot_type() {
        return spot_type;
    }

    public void setSpot_type(Spot_Type spot_type) {
        this.spot_type = spot_type;
    }
}
