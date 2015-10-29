package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import static org.junit.Assert.*;
import org.junit.Test;



public class TestTable1 {
	
	@Test
	public void testSingleton(){
    TableOrder uniqueInstance = Table1.getInstance();
    TableOrder uniqueInstance2 = Table1.getInstance();
    assertEquals(true,uniqueInstance==uniqueInstance2);
    //Table1.clearOrder();
	//assertEquals(true, uniqueInstance==null);
	}
	


}
