package com.practice.java.strings;

import org.junit.Assert;
import org.junit.Test;

public class StrRevTest {
	@Test
	public void test() {
		//fail("Not yet implemented");
		StrRev testObj = new StrRev();
		String input = "man";
		Assert.assertEquals("nam", testObj.strRev(input));
	}
	@Test
	public void test1() {
		//fail("Not yet implemented");
		StrRev testObj = new StrRev();
		String input = "man";
		input = testObj.strRev(input);
		Assert.assertEquals("nam", input);
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		StrRev testObj = new StrRev();
		String input = "man";
		Assert.assertEquals("nam", testObj.strRevRec(input));
	}
	@Test
	public void test3() {
		//fail("Not yet implemented");
		StrRev testObj = new StrRev();
		String input = "man";
		input = testObj.strRevRec(input);
		Assert.assertEquals("nam", input);
	}
}
