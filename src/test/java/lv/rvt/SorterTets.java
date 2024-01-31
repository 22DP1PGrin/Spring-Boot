package lv.rvt;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import rvt.Sorter;


public class SorterTets {
    @Test
    public void testSmallest(){
        int[] intArray={3,4,-4,6,56,4,12};
        assertEquals(-4,Sorter.smallest(intArray));
    }
    @Test
    public void testIndeOfSmallest(){
        int[] intArray={-5,4,-4,6,56,4,12};
        assertEquals(0,Sorter.indexOfSmallest(intArray));
    }
    @Test
    public void testIndexOfSmallestFrom(){
        int[] intArray={3,4,-4,7,16,54,12};
        assertEquals(2,Sorter.indexOfSmallestFrom(intArray, 1));
        assertEquals(6,Sorter.indexOfSmallestFrom(intArray, 4));
        assertEquals(3,Sorter.indexOfSmallestFrom(intArray, 3));
        assertEquals(2,Sorter.indexOfSmallestFrom(intArray, 2));
        
    }
    @Test
    public void testSwap(){
        int[] intArray={3,4,-4,7,};
        int[] intSwapArray={3,-4,4,7};
        Sorter.swap(intArray, 1, 2);
        assertArrayEquals(intSwapArray, intArray);     
    }
    @Test
    public void testSort(){
        int[] intArray={3,4,-4,7,};
        int[] intSwapArray={-4,3,4,7};
        Sorter.sort(intArray);
        assertArrayEquals(intSwapArray, intArray);  
    }
}

