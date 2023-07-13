package com.qa.api;

import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestGet {
	@Test(enabled=true)
	public void getbody() {
		RequestSpecification res=RestAssured.given();
		res.baseUri("https://reqres.in/");
		res.basePath("api/users?page=2");
		Response respon=res.get();
		ResponseBody body=respon.getBody();
		JsonPath path = body.jsonPath();
		String value=path.get("data[1]").toString();
		System.out.println(value);
	

	
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
