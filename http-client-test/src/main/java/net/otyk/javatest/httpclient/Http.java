package net.otyk.javatest.httpclient;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

public class Http {

	public Http() {
	}

	public void doGet(String uri) throws IOException {
		does(new GetMethod(uri));
	}

	private void does(HttpMethod method) throws IOException {
		HttpClient cli = new HttpClient();
		try {
			int status = cli.executeMethod(method);
			System.out.println("status=" + status);
			System.out.println("body=" + method.getResponseBodyAsString());
		} finally {
			method.releaseConnection();
		}
	}
}
