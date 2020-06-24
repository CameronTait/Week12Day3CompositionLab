import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;

    @Before
    public void before(){
        dealership = new Dealership(1000000);
        car = new Car("Ford", 6000);

    }

    @Test
    public void hasTill(){
        assertEquals(1000000, dealership.getTill());
    }

    @Test
    public void getVehicleCountTest(){
        assertEquals(0, dealership.getVehicleCount());
    }

    @Test
    public void canAddVehicle(){
        dealership.addToList();
        assertEquals(1, dealership.getVehicleCount());
    }

}
