package lv.rvt;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import rvt.Sorter;
public abstract class SorterTets {
    @Test
    public void testSmallest(){
        int[] intArray={3,4,-4,6,56,4,12};
        assertEquals(-4,Sorter.smallest(intArray));
    }
}
