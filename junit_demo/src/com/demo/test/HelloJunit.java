package com.demo.test;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunit {

	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("hello from helloBeforeAll()");
	}

	@BeforeClass
	public static void helloBeforeClass() {
		System.out.println("hello from helloBeforeClass()");
	}

	@BeforeEach
	public void helloBeforeEach() {
		System.out
				.println("hello from helloBeforeEach(). This will be executed before any test case within this class");
	}

	@Test
	public void testHello1() {
		System.out.println("hello from testHello1()");
	}

	@Test
	public void testHello2() {
		System.out.println("hello from testHello2()");
	}

	@AfterEach
	public void helloAfterEach() {
		System.out.println("hello from helloAfterEach(). This will be executed after any test case within this class");
	}

	@AfterAll
	public static void helloAfterAll() {
		System.out.println("hello from helloAfterAll");
	}
}
