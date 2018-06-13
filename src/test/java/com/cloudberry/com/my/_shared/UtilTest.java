package com.cloudberry.com.my._shared;

import java.util.BitSet;
import org.junit.*;
import static org.junit.Assume.*;
import static org.junit.Assert.*;
import static com.cloudberry.com.my._shared.Util.fromInt;
import static com.cloudberry.com.my._shared.Util.toInt;

public class UtilTest {
	
	
	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}
	
	@Test
	public void test() {
		int num 		= 0b11010; //Which is 26 in decimal
		assumeTrue(true);
		BitSet result 	= fromInt(num); 
		System.out.println("fromInt() is called => " + result); //Display which position from left to right, is flagged as 1s.
		System.out.println("toInt() is called => " +  toInt(result));
		assertTrue(true);
	}

}
