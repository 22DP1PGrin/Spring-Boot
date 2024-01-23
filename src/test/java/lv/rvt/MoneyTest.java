package lv.rvt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import rvt.Money;

public class MoneyTest {
    @Test
    
    public void testPlusMethod(){
        Money mon1 = new Money(5,10);
        Money mon2 = new Money(5,10);

        Money result1 = mon1.plus(mon2);
        
        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());

        Money mon3=new Money(2,89);
        Money mon4=new Money(3,99);
        
        Money result2 = mon3.plus(mon4);

        assertEquals(6, result2.euros());
        assertEquals(88, result2.cents());
    }
     
    
    @Test
    
    public void testLessThan(){
        Money mon1 = new Money(15,54);
        Money mon2 = new Money(17,14);


        assertEquals(true, mon1.lessThan(mon2));
        assertEquals(false, mon2.lessThan(mon1));
    }
    
    
    public void testMinusMethod(){
        Money mon1 = new Money(3,90);
        Money mon2 = new Money(2,80);

        Money result1 = mon1.minus(mon2);
        
        assertEquals(1, result1.euros());
        assertEquals(10, result1.cents());


    }
}
