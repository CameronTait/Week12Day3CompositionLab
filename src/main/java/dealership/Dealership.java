package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> vehicle;


    public Dealership(int till) {
        this.till = till;
        vehicle = new ArrayList<Vehicle>();
    }

    public int getTill(){
        return till;
    }

    public ArrayList<vehicle> addToList(int vehicle){
        this.vehicle[0] = vehicle;
    }

    public int getVehicleCount(){
        return this.vehicle.size();
    }

}
