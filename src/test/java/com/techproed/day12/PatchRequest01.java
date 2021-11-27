package com.techproed.day12;

import com.techproed.testBase.JsonPlaceHolderTestBase;
import com.techproed.testData.JsonPlaceHolderTestData;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PatchRequest01 extends JsonPlaceHolderTestBase {
    //https://jsonplaceholder.typicode.com/todos/198 URL ine aşağıdaki body gönderdiğimde
    //   {
    //
    //      "title": "API calismaliyim"
    //
    //     }
    //Dönen response un status kodunun 200 ve body kısmının aşağıdaki gibi olduğunu test edin
    //{
    // "userId": 10,
    // "title": "API calismaliyim"
    // "completed": true,
    // "id": 198
    //}
    @Test
    public void test(){

        //url
        spec01.pathParams("parametre1","todos","parametre2",198);

        //expected ve request data olusturulur
        JsonPlaceHolderTestData testData=new JsonPlaceHolderTestData();
        JSONObject requestdata=testData.setUpPatchRequestData();
        System.out.println(requestdata);
        JSONObject expectedata=testData.setUpPatchExpectedData();
        System.out.println(expectedata);
        //request gönder
        Response response=given().contentType(ContentType.JSON).
                spec(spec01).
                auth().basic("admin","password123").
                body(requestdata.toString()).
                when().
                patch("/{parametre1}/{parametre2}");
            response.prettyPrint();

        // JsonPath
        JsonPath json=response.jsonPath();
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals(expectedata.getInt("userId"),json.getInt("userId"));
        Assert.assertEquals(expectedata.getString("title"),json.getString("title"));
        Assert.assertEquals(expectedata.getBoolean("completed"),json.getBoolean("completed"));
        Assert.assertEquals(expectedata.getInt("id"),json.getInt("id"));


        //Matchers class
        response.then().assertThat().
                body("completed", equalTo(expectedata.getBoolean("completed")),
                        "title",equalTo(expectedata.getString("title")),
                        "userId",equalTo(expectedata.getInt("userId")));

        //De-Serialization
        HashMap<String,Object> actualData=response.as(HashMap.class);
        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals(expectedata.getInt("userId"),actualData.get("userId"));
        Assert.assertEquals(expectedata.getInt("id"),actualData.get("id"));
        Assert.assertEquals(expectedata.getString("title"),actualData.get("title"));
        Assert.assertEquals(expectedata.getBoolean("completed"),actualData.get("completed"));


    }
}
