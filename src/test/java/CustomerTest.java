import customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Steve", 13000);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", customer.getName());
    }

    @Test
    public void hasMoney(){
        assertEquals(13000, customer.getMoney());
    }


}
