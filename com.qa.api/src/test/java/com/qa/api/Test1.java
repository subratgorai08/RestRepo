package com.qa.api;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Test1 {
	@Test
	public void runData() throws JsonMappingException, JsonProcessingException {
		ObjectMapper map=new ObjectMapper();
		Employe emp=new Employe();
		emp.setId(10);
		emp.setEmail("rahul@gmail.com");
		emp.setFirst_name("Rahul");
		emp.setLast_name("Ray");
		emp.setAvatar("happy");
		String payload = map.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		RequestSpecification res=RestAssured.given();
		res.baseUri("https://httpbin.org/post").contentType("application/json").body(payload);
		Response respon=res.post();
		System.out.println(respon.asPrettyString());
		ResponseBody body = respon.getBody();
		JsonPath path = body.jsonPath();
	 //  String s1= body.asString();
	//	List<Employe> list = path.getList("data",Employe.class);
		List<Object> list = path.getList("data");
		System.out.println(list);
		
		
		
	}
	}

