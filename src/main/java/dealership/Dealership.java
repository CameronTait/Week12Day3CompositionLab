package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> vehicle;


    public Dealership(int till) {
        this.till = till;
        this.vehicle = new ArrayList<Vehicle>();
    }

    public int getTill(){
        return till;
    }


}
