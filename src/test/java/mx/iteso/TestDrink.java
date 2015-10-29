package mx.iteso;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.singleton.Drink;

public class TestDrink {
	Drink drink;

    @Before
    public void setUp() {
        drink = new Drink();
    }

    @Test
    public void TestDescription() {
    	drink.setDescription("Coke");
    	drink.setPrice(10);
    	drink.setWaiter("Waiter A");
    	drink.setName("Soda");
    	assertEquals("Coke", drink.getDescription());
    	assertEquals("Waiter A", drink.getWaiter());
    	assertEquals("Soda", drink.getName());
    	assertEquals(10, drink.getPrice(), 0);
    }  
}
