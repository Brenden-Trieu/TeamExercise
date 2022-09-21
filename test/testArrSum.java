package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testArrSum {
    @Test
    public void testSumZero() {
        int[] arr = {};
        int result = code.arrSum.sumVal(arr);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void testSum() {
        int[] arr = { 15, 9, 88, 51, 10, 21 };
        int result = code.arrSum.sumVal(arr);
        int expected = 194;
        assertEquals(expected, result);
    }
}
