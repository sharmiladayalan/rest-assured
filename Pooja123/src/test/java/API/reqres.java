package API;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import com.github.dockerjava.transport.DockerHttpClient.Response;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBodyExtractionOptions;
import com.fasterxml.jackson.databind.JsonNode;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class reqres {
	//public String url="https://reqres.in/";
  @Test
public void get_method() {
	  String url2="https://reqres.in/api/users?page=2";
	  io.restassured.response.Response response= RestAssured.get(url2);
	  Assert.assertEquals(response.getStatusCode(),200,"Response code mismatch");
	  int total_pages= ((ResponseBodyExtractionOptions) response).jsonPath().get("total_pages");
	  Assert.assertEquals(total_pages, 2,"total_pages value mismatch");
  }
  @Test(enabled=false)
  public void get_method1() { 
	  String url3="https://reqres.in/api/users/2";
	  io.restassured.response.Response response= RestAssured.get(url3);
	  Assert.assertEquals(response.getStatusCode(),200,"Response code mismatch");
	  String email= ((ResponseBodyExtractionOptions) response).jsonPath().get("email");
	  Assert.assertEquals(email,"email is mismatch");
  }
  @Test(enabled=true)
  public void post() {  
	  String url4="https://reqres.in/api/users";
	  String contentType="application/json";
	  String bodyData="{\r\n"+
			    "\"name\": \"morpheus\",\r\n"+
			    "\"job\": \"leader\\r\n"+
			    "}";
	 
	/*Response response=  (Response) RestAssured.given().contentType(contentType).body(bodyData).when().post(url4).then().extract().response();
	 Assert.assertEquals(response.getStatusCode(),200,"Response code mismatch");
	  String name= ((ResponseBodyExtractionOptions) response).jsonPath().get("name");
	  Assert.assertEquals(name,"morpheus","email is mismatch");*/
			}

@Test(enabled=true)
public void get() {  
io.restassured.response.Response response =given().queryParam("key","038d878418400d88dff051ce7e5839ce")
.queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
.header("Content-Type", "application/json").when()
.get("https://trello.com/b/bSa4mKFN/pooja").then().extract().response();
System.out.println(response.getBody());
}
}
