package net.otyk.javatest.httpclient;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

public class HttpTest {

	@Test
	public void doGet() {
		try {
			new Http().doGet("http://www.google.com/");
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
}
