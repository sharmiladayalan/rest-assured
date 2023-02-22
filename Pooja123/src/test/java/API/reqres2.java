package API;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterTest;

public class reqres2 {
	public String url="https://reqres.in/";
	public String id;
  @Test
  public void get() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/users?page=2").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void get1() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/users/2").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void get2() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/users/23").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void get3() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/unknown").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void get4() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/unknown/2").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void get5() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/unknown/23").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void get6() {
	  Response response =given().
			  header("Content-Type", "application/json").when()
			  .get("https://reqres.in/api/users?delay=3").then().extract().response();
			 System.out.println(response.getBody());
  }
  @Test
  public void Create_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response1 =given().queryParam("name","morpheus").queryParam("job","leader")
	  .header("Content-Type", "application/json").when()
	  .post("/api/users").then().extract().response();
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
	Response response1 =given().queryParam("email","eve.holt@reqres.in").queryParam("password","pistol")
	  .header("Content-Type", "application/json").when()
	  .post("/api/register").then().extract().response();
	 System.out.println(response1.toString());
	 JsonPath jp=new JsonPath(response1.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response1);
  }
  @Test
  public void Create_Boards2() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response1 =given().queryParam("email","sydney@fife")
	  .header("Content-Type", "application/json").when()
	  .post("/api/register").then().extract().response();
	 System.out.println(response1.toString());
	 JsonPath jp=new JsonPath(response1.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response1);
  }
  @Test
  public void Create_Boards3() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response1 =given().queryParam("email","eve.holt@reqres.in").queryParam("password","cityslicka")
	  .header("Content-Type", "application/json").when()
	  .post("/api/login").then().extract().response();
	 System.out.println(response1.toString());
	 JsonPath jp=new JsonPath(response1.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response1);
  }
  @Test
  public void Create_Boards4() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response1 =given().queryParam("email","peter@klaven")
	  .header("Content-Type", "application/json").when()
	  .post("/api/login").then().extract().response();
	 System.out.println(response1.toString());
	 JsonPath jp=new JsonPath(response1.asString());
	 id=jp.get("id");
	 System.out.println(id);
	 System.out.println(response1);
  }
  @Test
  public void Delete_Boards() {
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	baseURI = url;
	Response response3 =given()
	  .header("Content-Type", "application/json").when()
	  .delete("/api/users/2").then().extract().response();
  }
  
}
