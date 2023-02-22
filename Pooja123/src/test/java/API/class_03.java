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

public class class_03 {
	public String url="https://trello.com";
	public String id;
	@Test(enabled=false)
	  public void Get_Boards() {
		// This code sample uses the  'Unirest' library:
		// http://unirest.io/java.html
		 
		Response response =given().queryParam("key","038d878418400d88dff051ce7e5839ce")
		  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
		  .header("Content-Type", "application/json").when()
		  .get("https://trello.com/b/bSa4mKFN/pooja").then().extract().response();
		 System.out.println(response.getBody());
	  }
	  @Test(enabled=true)
	  public void Create_Boards() {
		// This code sample uses the  'Unirest' library:
		// http://unirest.io/java.html
		baseURI = url;
		Response response =given().queryParam("name","lohith").queryParam("key","038d878418400d88dff051ce7e5839ce")
		  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
		  .header("Content-Type", "application/json").when()
		  .post("/1/boards/").then().extract().response();
		 System.out.println(response.toString());
		 JsonPath jp=new JsonPath(response.asString());
		 id=jp.get("id");
		 System.out.println(id);
		 System.out.println(response);
	  }
	  @Test(enabled=true)
	  public void Delete_Boards() {
		// This code sample uses the  'Unirest' library:
		// http://unirest.io/java.html
		baseURI = url;
		Response response =given().queryParam("key","038d878418400d88dff051ce7e5839ce")
		  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
		  .header("Content-Type", "application/json").when()
		  .delete("/1/boards/"+id).then().extract().response();
		 System.out.println(response.getBody());
	  }
	  @Test(enabled=true)
	  public void Update_Boards() {
		// This code sample uses the  'Unirest' library:
		// http://unirest.io/java.html
		baseURI = url;
		Response response =given().queryParam("name","jasmitha").queryParam("key","038d878418400d88dff051ce7e5839ce")
		  .queryParam("token", "ATTA9ca512e7c3251a52990ad9dc9f4d41d44282ebd7f60d218230b7d17406baa14e96580B56")
		  .header("Content-Type", "application/json").when()
		  .put("/1/boards/"+id).then().extract().response();
		 System.out.println(response.getBody());
	  }
}

