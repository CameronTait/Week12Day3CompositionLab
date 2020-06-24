package vehicles;

import behaviours.ISeats;
import behaviours.IWheels;

public class Motorbike extends Vehicle implements ISeats, IWheels {
        public Motorbike(String name, int price){
            super(name, price);
        }

        public int getWheels(){
            return 2;
    }

    public int getSeats(){
            return 1;
    }

}
