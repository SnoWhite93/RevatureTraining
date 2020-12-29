package com.demo.service.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.MyServices;

public class MyServicesTest {

	private static MyServices services;

	@BeforeAll
	public static void setupMyServices() {
		services = new MyServices();

	}

	@Test
	public void testSayHelloByName() {
		String output = "Hello Ileana";
		assertEquals(output, services.sayHello("Ileana"));
	}
	
	@Test
	public void testSayHelloForNull() {
		
		assertNull(services.sayHello(null));
	}
}
