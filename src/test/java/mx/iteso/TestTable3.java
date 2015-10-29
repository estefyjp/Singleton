package mx.iteso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table3;

public class TestTable3 {
	@Test
	public void testSingleton(){
    TableOrder uniqueInstance = Table3.getInstance();
    TableOrder uniqueInstance2 = Table3.getInstance();
    assertEquals(true,uniqueInstance==uniqueInstance2);
	}

}
