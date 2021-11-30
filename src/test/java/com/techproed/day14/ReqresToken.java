package com.techproed.day14;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ReqresToken {

    public String  TokenAl(){
        String url="https://reqres.in/api/login";

        HashMap<String,String >requestBody=new HashMap<String,String>();
        requestBody.put("email","eve.holt@reqres.in");
        requestBody.put("password", "cityslicka");

        Response response=given().contentType(ContentType.JSON).
                body(requestBody).//auth().basic("admin","password")
                when().post(url);

        //response.prettyPrint();

        JsonPath json=response.jsonPath();
       String token= json.getString("token");
        System.out.println(token);
        return token;

    }

}
