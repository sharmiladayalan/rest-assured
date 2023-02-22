package API;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import  io.restassured.response.Response;

public class Class_04 {
  @Test(enabled=false)
  public void users() {
	  given().get("http://localhost:3000/user").then().statusCode(200).body("ID[1]",equalTo(25)).log().all();
  }
  @Test
  public void put_user() {
	  JSONObject js=new JSONObject();
	  js.put("First_Name" ,"hema");
	  js.put("Last_Name" ,"D");
	  js.put("ID" ,"34");
	  given().body(js.toJSONString()).when().put("http://reqres.in/api/users/2").then().statusCode(301).log().all();
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
