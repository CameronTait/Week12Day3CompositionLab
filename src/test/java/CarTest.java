import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car("2 liter", 100000);
        }

        @Test
    public void hasEngine(){
        assertEquals("2 liter", car.getEngine());
        }

        @Test
    public void hasPrice(){
        assertEquals( 100000, car.getPrice());
        }

        @Test
    public void hasWheels(){
        assertEquals(4, car.getWheels());
        }

        @Test
    public void hasSeats() {
        assertEquals(4, car.getSeats());
        }
}






