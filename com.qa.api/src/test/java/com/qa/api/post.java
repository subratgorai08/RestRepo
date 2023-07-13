package com.qa.api;

import static io.restassured.RestAssured.given;


import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
@Test
public class post {
	public void test() {
//		JSONObject obj=new JSONObject();
//		obj.put("name", "morpheus");
//		obj.put("job","leader");
//	    given().
//	    body(obj.toString()).
	 //   header("Content-Type","application/json").
	//    when().
	 //   post("https://reqres.in/api/users").
	//    get("https://reqres.in/api/users").
	//    then().statusCode(201);
	    
	    
	      
	    
	   
	    
	}
	public void get() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification http=RestAssured.given();
		JSONObject json=new JSONObject();
		json.put("name", "morpheus");
		json.put("job","leader");
		http.body(json.toString());
		http.header("Content-Type","application/json");
		
		Response res=http.post("api/users");
		System.out.println(res.statusCode());
		System.out.println(res.asPrettyString());
		System.out.println(res.jsonPath().get("name"));
		
		
		
		
		
	}

}
