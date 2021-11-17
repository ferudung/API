package com.techproed.testData;

import java.util.HashMap;

public class HerokuappTestData {
    //{
    //    "firstname": "Susan",
    //    "lastname": "Ericsson",
    //    "totalprice": 521,
    //    "depositpaid": true,
    //    "bookingdates": {
    //        "checkin": "2015-03-05",
    //        "checkout": "2019-08-18"
    //    }
    //}
    public HashMap<String, Object> setupTestData(){

        HashMap<String,Object> bookingdates=new HashMap<String,Object>();
        bookingdates.put("checkin","2018-05-30");
        bookingdates.put("checkout","2019-04-26");

        HashMap<String,Object> expectedData=new HashMap<String,Object>();
        expectedData.put("firstname","Mark");
        expectedData.put("lastname","Brown");
        expectedData.put("totalprice",647);
        expectedData.put("depositpaid",true);
        expectedData.put("bookingdates",bookingdates);
        return expectedData;



    }
}
