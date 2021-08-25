package jUnit_scripts_assertscommands;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertsTest {
	
	Asserts a=new Asserts();

	@Test
	public void testSub() {
		assertEquals(5, a.sub(10,5));
		assertSame(10,a.sub(10,0));
		assertNotSame(10,a.sub(10,10));
		assertNotNull(a);
		assertNull(a);
		assertTrue("Result is greater than 10",a.sub(20,5)>10);
		assertFalse("Result is a decimal digit",a.sub(20,5)<1);
	}

	@Test
	public void testAdd() {
		assertEquals(5, a.add(10,5));
		assertSame(10,a.add(10,0));
		assertNotSame(10,a.add(10,10));
		assertNotNull(a);
		assertNull(a);
		assertTrue("Added integers are greater than 10",a.add(20,5)>10);
		assertFalse("Result is a decimal digit",a.add(20,5)<1);
		
	}

	@Test
	public void testMul() {
		assertEquals(5, a.mul(10,5));
		assertSame(10,a.mul(10,0));
		assertNotSame(10,a.mul(10,10));
		assertNotNull(a);
		assertNull(a);
		assertTrue("Result is greater than 10",a.mul(20,5)>10);
		assertFalse("Result is a decimal digit",a.mul(20,5)<1);
		
	}
	@Test
	public void testarrayCheck(){
		assertArrayEquals(a.actualarray,a.expectedarray);
	}

}
