import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before(){
        dealership = new Dealership(1000000);

    }

    @Test
    public void hasTill(){
        assertEquals(1000000, dealership.getTill());
    }

}
