package vehicles;

import behaviours.IWheels;
import behaviours.ISeats;
public class Car extends Vehicle implements ISeats, IWheels {

    public Car(String name, int price) {
        super(name, price);
    }

        public int getWheels (){
            return 4;
        }

        public int getSeats () {
            return 4;
        }
    }

