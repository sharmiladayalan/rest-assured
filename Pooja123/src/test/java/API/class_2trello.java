package API;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import  io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

import java.net.http.HttpResponse;

import org.testng.annotations.AfterTest;

public class class_2trello {
	public String url="https://trello.com";
	public String id;
  @Test
  public void Get_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	 
	Response response =given().queryParam("key","038d878418400d88dff051ce7e5839ce")
	  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
	  .header("Content-Type", "application/json").when()
	  .get("https://trello.com/b/bSa4mKFN/pooja").then().extract().response();
	 System.out.println(response.getBody());
  }
  @Test
  public void Create_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response1 =given().queryParam("name","lohith").queryParam("key","038d878418400d88dff051ce7e5839ce")
	  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
	  .header("Content-Type", "application/json").when()
	  .post("/1/boards/").then().extract().response();
	 System.out.println(response1.toString());
	 JsonPath jp=new JsonPath(response1.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response1);
  }
  @Test
  public void Create_Boards1() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response2 =given().queryParam("name","jasmitha").queryParam("key","038d878418400d88dff051ce7e5839ce")
	  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
	  .header("Content-Type", "application/json").when()
	  .post("/1/boards/").then().extract().response();
	 System.out.println(response2.toString());
	 JsonPath jp=new JsonPath(response2.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response2);
	
  }
  @Test
  public void Delete_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response3 =given().queryParam("key","038d878418400d88dff051ce7e5839ce")
	  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
	  .header("Content-Type", "application/json").when()
	  .delete("/1/boards/").then().extract().response();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
