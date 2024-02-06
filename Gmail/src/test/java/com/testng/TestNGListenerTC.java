package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGListenerTC {
	
	@Test
	public void m1() {
		System.out.println("m1 method");
		Assert.assertEquals("ALIGHT", "ALIGHT");
	}

	@Test
	public void m2() {
		System.out.println("m2 method");
		Assert.assertEquals("Health", "Wealth");
	}
}
