package net.sjune.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	@Test
	public void greeting() throws Exception {
		assertEquals("Hello world!", new HelloWorld().greeting());
	}
}