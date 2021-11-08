package com.techproed.day04;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
public class GetRequest01 {
    /*
     https://restful-booker.herokuapp.com/booking/3 adresine bir request gonderildiginde
     donecek cevap(response) icin
 HTTP status kodunun 200
 Content Type’in Json
 Ve Status Line’in HTTP/1.1 200 OK
 Oldugunu test edin
    */
    @Test
    public void test01() {
        // 1- api testi yaparken ilk olarak url(endpoint) belirlenmeli
        String url = "https://restful-booker.herokuapp.com/booking/3";
        //2- beklenen sonuç(expected result) oluşturulur.
        // bu case de benden body doğrulaması istenmediği için şimdilik beklenen sonuç oluşturmuyoruz
        //3-  request gönder
        Response response= given().
                accept("application/json").
                when().
                get(url);//request oldu ve bunu response atadık
        response.prettyPrint();
        //4-actual result oluştur
        //response bıdy ile ilgili işlem yapılmayacağı için simdi olusturmayacağız
        //5-doğrulama yap(assertion)
        System.out.println(response.getStatusCode());//200
        System.out.println(response.getContentType());//application/json; charset=utf-8
        System.out.println(response.getStatusLine());//HTTP/1.1 200 OK
        System.out.println(response.getHeaders());//bütün headerı alır ve yazdırır

        Assert.assertEquals(200,response.getStatusCode());
        //status code int deger döner
        Assert.assertEquals("expected ile actual degerler eşit değil","HTTP/1.1 200 OK",response.getStatusLine());

        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).//application/json de yazılabilir
                statusLine("HTTP/1.1 200 OK");

    }
}




