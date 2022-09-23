package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MinFinderTest {

	@Test
	void testIntArray() {
		int[] x= {23,45,12,3,78};
		assertEquals("Integer arrays work",code.MinFinder.findMinElem(x),3);
		//fail("Not yet implemented");
		
	}
	@Test
	void testStringArray() {
		String[] s= {"arc","apple","about"};
		assertEquals(code.MinFinder.findMinElem(s),"about","String arrays work");
	}
	

}
