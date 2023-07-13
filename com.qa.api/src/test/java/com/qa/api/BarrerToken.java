package com.qa.api;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BarrerToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://bookstore.toolsqa.com/";
		RequestSpecification http=RestAssured.given();
		
		String Payload="{\r\n"
				+ "  \"userName\": \"admin\",\r\n"
				+ "  \"password\": \"Gorai@123\"\r\n"
				+ "}";
		Response res=http.body(Payload).contentType("application/json").post("Account/V1/GenerateToken");
		String head=res.getHeader("token");
	//	String file=res.asString();
	//	String token=JsonPath.from(file).get("token");
	//	System.out.println(token);
		ResponseBody body=res.getBody();
		String token=body.jsonPath().getString("token");
		System.out.println(token);
		
		
		
	
	}

}
