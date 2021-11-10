package com.techproed.testBase;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.BeforeClass;

public class jsonPlaceHolderTestBase {

   protected RequestSpecification spec01;

   @Before
    public void setUp(){
       spec01=new RequestSpecBuilder().
               setBaseUri("https://jsonplaceholder.typicode.com").
               build();
   }

}
