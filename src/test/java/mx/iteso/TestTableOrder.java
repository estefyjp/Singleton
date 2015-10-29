package mx.iteso;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;

public class TestTableOrder {
	TableOrder order;

    @Before
    public void setUp() {
        order = Table1.getInstance();
    }

    @Test
    public void TestTodo() {
        //Dishes
        order.addDish(new Dish());
        assertEquals(1,order.dishes.size());
        order.clearDishes();
        assertEquals(0,order.dishes.size());

        //Drinks
        order.addDrink(new Drink());
        assertEquals(1,order.drinks.size());
        order.clearDrinks();
        assertEquals(0,order.drinks.size());
    }

}
