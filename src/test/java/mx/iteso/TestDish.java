package mx.iteso;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.singleton.Dish;

public class TestDish {
	Dish dish;

    @Before
    public void setUp() {
        dish = new Dish();
    }

    @Test
    public void TestDescription() {
    	dish.setDescription("Enchilada");
    	dish.setPrice(8);
    	dish.setWaiter("Waiter C");
    	dish.setName("Mexican");
    	assertEquals("Enchilada", dish.getDescription());
    	assertEquals("Waiter C", dish.getWaiter());
    	assertEquals("Mexican", dish.getName());
    	assertEquals(8, dish.getPrice(), 0);
    }

}
