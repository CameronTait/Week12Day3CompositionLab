import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest{

        Motorbike motorbike;

        @Before
        public void before() {
            motorbike = new Motorbike("1 liter", 8000);
        }

        @Test
        public void hasEngine(){
            assertEquals("1 liter", motorbike.getEngine());
        }

        @Test
        public void hasPrice(){
            assertEquals(8000, motorbike.getPrice());
        }
    }
