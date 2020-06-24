import org.junit.Before;
import org.junit.Test;

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


}




