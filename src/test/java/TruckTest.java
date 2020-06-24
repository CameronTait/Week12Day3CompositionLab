import org.junit.Before;
import org.junit.Test;

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
}