import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinFinderTest {

	@Test
	void testIntArray() {
		int[] x= {23,45,12,3,78};
		assertEquals(code.MinFinder.findMinElem(x),3,"Integer arrays work");
		//fail("Not yet implemented");
		
	}
	@Test
	void testStringArray() {
		String[] s= {"arc","apple","about"};
		assertEquals(code.MinFinder.findMinElem(s),"about","String arrays work");
	}
	

}
