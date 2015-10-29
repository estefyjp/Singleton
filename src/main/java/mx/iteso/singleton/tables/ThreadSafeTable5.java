package mx.iteso.singleton.tables;

import java.util.ArrayList;

import mx.iteso.singleton.TableOrder;

public class ThreadSafeTable5 extends TableOrder{

    private static TableOrder uniqueInstance;

    private ThreadSafeTable5(){
        tableName = "Thread Safe Table 5";
        drinks = new ArrayList();
        dishes = new ArrayList();
    }

    public static TableOrder getInstance(){
    	if(uniqueInstance== null){
    			synchronized (ThreadSafeTable5.class){
        	if(uniqueInstance== null){
        		uniqueInstance = new ThreadSafeTable5();
        	}
    	}
    	}
        return uniqueInstance;
    }

    public static void clearOrder(){
        uniqueInstance = null;
    }
}
