package com.qa.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postman {
	@Test
	public void get() throws ClientProtocolException, IOException {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification http=RestAssured.given();
		Response r=http.get("api/users?page=2");
		System.out.println(r.asPrettyString());
		System.out.println(r.getStatusCode());
		
	}
}
