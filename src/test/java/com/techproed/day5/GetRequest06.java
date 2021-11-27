package com.techproed.day5;


import com.techproed.testBase.JsonPlaceHolderTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest06 extends JsonPlaceHolderTestBase {
    // https://jsonplaceholder.typicode.com/todos/123 url'ine, accept type'i "application/json" olan
    // GET request'i yolladigimda gelen response’un;
    // status kodunun 200, content type'inin "application/json", Headers'daki "Server" in "cloudflare",
    // response body'deki "userId"'nin 7, "title" in "esse et quis iste est earum aut impedit" ve
    // "completed" bolumunun false oldugunu test edin
    @Test
    public void test() {
        // URL' i belirle
        // String url = "https://jsonplaceholder.typicode.com/todos/123";
        spec01.pathParams("parametre1","todos",
                "parametre2",123);
        // Request gonder
        Response response = given().
                accept("application/json").
                spec(spec01).
                when().
                get("/{parametre1}/{parametre2}");
        response.prettyPrint();
        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                header("Server",equalTo("cloudflare")).
                body("userId",equalTo(7),
                        "title",equalTo("esse et quis iste est earum aut impedit"),
                        "completed",equalTo(false));
    }
}