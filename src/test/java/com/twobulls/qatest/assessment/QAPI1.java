package com.twobulls.qatest.assessment;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QAPI1 {
	
	private CloseableHttpClient client;
	
	public static final String API_URL = "http://passwordutility.net:80/api/password/generate";
	
	public static final String TEST_DATA = "{\"password\":\"123456\", \"user_id\" : \"70f3fc6beac4412b82db266b4796b\"}";
	
	public static final int SUCCESS_CODE = 200;
	
	@Test
	public void testGeneratePassword() throws ClientProtocolException, IOException {
		
		HttpPost httpPost = new HttpPost(API_URL);
		StringEntity entity = new StringEntity(TEST_DATA);
	    httpPost.setEntity(entity);
	    httpPost.setHeader("Accept", "application/json");
	    httpPost.setHeader("Content-type", "application/json");
	 
	    CloseableHttpResponse response = client.execute(httpPost);
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
