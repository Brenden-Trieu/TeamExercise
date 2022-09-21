package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import code.avgValue;

public class testAvgValue {
    @Test
   public void testAvgValueOfEmptyArray(){
      int[] input = {};
      double expectedAvg = 0;
      double returnedAvg = avgValue.avgValueFinder(input);
      assertEquals(expectedAvg,returnedAvg,0.001);
   }

@Test
   public void testAvgValueOfFilledArray(){
    int[] input = {1,2,3,4};
    double expectedAvg = 2.5;
    double returnedAvg = avgValue.avgValueFinder(input);
    assertEquals(expectedAvg,returnedAvg,0.001);
   }

}
