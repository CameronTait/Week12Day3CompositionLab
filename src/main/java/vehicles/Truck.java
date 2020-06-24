package vehicles;

import behaviours.ISeats;
import behaviours.IWheels;

public class Truck extends Vehicle implements ISeats, IWheels {

    public Truck(String name, int price) {
        super (name, price);

    }

    public int getWheels() {
        return 16;
    }

    public int getSeats() {
        return 2;
    }
}
