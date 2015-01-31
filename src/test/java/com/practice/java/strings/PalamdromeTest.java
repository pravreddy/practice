package com.practice.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class PalamdromeTest {

	@Test
	public void test() {
		Palamdrome testObj = new Palamdrome();
		Assert.assertEquals(true, testObj.isPalamdrome("racecar"));
	}
	@Test
	public void testfalsecase() {
		Palamdrome testObj = new Palamdrome();
		Assert.assertEquals(false, testObj.isPalamdrome("motor"));
	}
}
