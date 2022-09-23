
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinFinderTest {

	@Test
	public void testIntArray() {
		int[] x= {23,45,12,3,78};
		assertEquals("Integer arrays work",code.MinFinder.findMinElem(x),3);
		//fail("Not yet implemented");
		
	}
	@Test
	public void testStringArray() {
		String[] s= {"arc","apple","about"};
		assertEquals("String arrays work",code.MinFinder.findMinElem(s),"about");
	}
	

}
