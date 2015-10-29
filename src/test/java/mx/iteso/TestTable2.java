package mx.iteso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table2;

public class TestTable2 {

	@Test
	public void testSingleton(){
    TableOrder uniqueInstance = Table2.getInstance();
    TableOrder uniqueInstance2 = Table2.getInstance();
    assertEquals(true,uniqueInstance==uniqueInstance2);
	}

}
