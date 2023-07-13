package com.qa.api;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.client.RestClient;

import Base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest extends BaseTest {
   
	BaseTest basetest;
	String serviceurl;
	String apiurl;
	String url;
	CloseableHttpResponse response;
	@BeforeMethod
	public void setUp() {
		basetest=new BaseTest();
		serviceurl=prop.getProperty("serviceurl");
		apiurl=prop.getProperty("apiurl");
		url=serviceurl+apiurl;
		
		
	}
	@Test
	public void test() throws  IOException {
		basetest=new BaseTest();
		RestClient rest=new RestClient();
		response=rest.get(url);
		int statuscode=response.getStatusLine().getStatusCode();
		Assert.assertEquals(statuscode,successful_statuscode,"" );
	
		
	
	}
}
