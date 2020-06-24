import org.junit.Before;
import org.junit.Test;
import vehicles.Truck;

import static org.junit.Assert.assertEquals;

public class TruckTest {

    Truck truck;

    @Before
    public void before() {
        truck = new Truck("20 liter", 500000);
    }

    @Test
    public void hasEngine(){
        assertEquals("20 liter", truck.getEngine());
    }

    @Test
    public void hasPrice(){
        assertEquals( 500000, truck.getPrice());
    }

    @Test
    public void hasSeats(){
        assertEquals(2, truck.getSeats());
    }

    @Test
    public void hasWheels(){
        assertEquals(16, truck.getWheels());
    }
}