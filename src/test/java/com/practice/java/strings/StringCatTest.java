package com.practice.java.strings;

import org.junit.Assert;
import org.junit.Test;

import com.practice.java.strings.StringCat;

public class StringCatTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		StringCat testObj = new StringCat();
		String input [] = {"Praveen","Arpitha","DR Padmaja"};
		Assert.assertEquals("Praveen,Arpitha,DR Padmaja", testObj.concatStringRecursively(input));
	}
	@Test
	public void test1() {
		//fail("Not yet implemented");
		StringCat testObj = new StringCat();
		String input [] = {"Praveen","Arpitha","DR Padmaja"};
		Assert.assertEquals("Praveen,Arpitha,DR Padmaja", testObj.concatString(input));
	}
}
