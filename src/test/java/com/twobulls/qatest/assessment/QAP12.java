package com.twobulls.qatest.assessment;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QAP12 {
	
	private CloseableHttpClient client;
	
	public static final String API_URL = "https://od-api-demo.oxforddictionaries.com:443/api/v1/domains/es/es";
	
	public static final int SUCCESS_CODE = 200;
	
	@Test
	public void testAPI() throws ClientProtocolException, IOException {
		HttpGet httpGet = new HttpGet(API_URL);
		httpGet.setHeader("app_id", "!no1me2digas!");
		httpGet.setHeader("app_key", "0clave42");
	    CloseableHttpResponse response = client.execute(httpGet);
	    Assert.assertEquals(response.getStatusLine().getStatusCode(), SUCCESS_CODE);
	}
	
	@BeforeTest
	public void beforeTest() {
		client = HttpClients.createDefault();
	}
	
	@AfterTest
	public void afterTest() throws IOException {
		client.close();
	}
}
