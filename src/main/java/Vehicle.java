public abstract class Vehicle {

    private String engine;
    private int price;

    public Vehicle(String engine, int price){
        this.engine = engine;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public int getPrice(){
        return price;
    }
}
