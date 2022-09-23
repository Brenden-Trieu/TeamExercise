package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class arrMedianTest {
    @Test
    public void testMedianOfEmptyArray() {
        int[] array = {};
        double expectedValue = 0;
        double returnedValue = code.arrMedian.findMedianValue(array);
        assertEquals(expectedValue, returnedValue, 0.001);
    }

    @Test
    public void testMedianWithOddNumberOfElements(){
        int[] array = {12, 12, 13, 14, 17, 20, 21};
        double expectedValue = 14;
        double returnedValue = code.arrMedian.findMedianValue(array);
        assertEquals(expectedValue, returnedValue, 0.001);
    }

    @Test
    public void testMedianWithEvenNumberOfElements(){
        int[] array = {40, 43, 44, 46, 47, 49, 49, 50};
        double expectedValue = 46.5;
        double returnedValue = code.arrMedian.findMedianValue(array);
        assertEquals(expectedValue, returnedValue, 0.001);
    }
}
