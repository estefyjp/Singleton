package mx.iteso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table4;

public class TestTable4 {
	@Test
	public void testSingleton(){
    TableOrder uniqueInstance = Table4.getInstance();
    TableOrder uniqueInstance2 = Table4.getInstance();
    assertEquals(true,uniqueInstance==uniqueInstance2);
	}

}
