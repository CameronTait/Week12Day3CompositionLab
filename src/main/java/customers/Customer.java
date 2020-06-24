package customers;

import vehicles.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Car> cars;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<Car>();

    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }


}

