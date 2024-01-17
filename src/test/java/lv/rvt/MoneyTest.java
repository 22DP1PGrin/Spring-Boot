package lv.rvt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
    public void testMinusMethod(){
        Money mon1 = new Money(2,80);
        Money mon2 = new Money(3,90);

        Money result1 = mon1.minus(mon2);
        
        assertEquals(0, result1.euros());
        assertEquals(90, result1.cents());


    }
}
