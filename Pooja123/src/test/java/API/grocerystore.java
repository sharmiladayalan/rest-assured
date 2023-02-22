package API;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import  io.restassured.response.Response;
public class grocerystore {
  @Test
  public void apistatus() {
	  given().when().get("https://simple-grocery-store-api.glitch.me/status\n").then().statusCode(200);
  }
  @Test
  public void getallproduct() {
	  given().when().get("https://simple-grocery-store-api.glitch.me/products").then().statusCode(200);
  }
 

@Test
  public void getsingleproduct () {
	  given().when().get("https://simple-grocery-store-api.glitch.me/products/4643\n").then().statusCode(200);
  }
  @Test
  public void createnewcart () {
  JSONObject js=new JSONObject();
	js.put("id","4444");
	js.put("name","Starbucks Coffee Variety Pack, 100% Arabica");
	given().body(js.toJSONString()).when().post("https://simple-grocery-store-api.glitch.me/carts\n").then().statusCode(201).log().all();
	System.out.println(js);
	System.out.println(js.toJSONString());
	System.out.println(js.toString());
}
  @Test
  public void getcart () { 
	  given().when().get("https://simple-grocery-store-api.glitch.me/carts/pHcYY8GdFbEU65nw2CSfg").then().statusCode(200).assertThat();
  
  }
  @Test(enabled=false)
  public void additemtocart () { 
	 JSONObject request=new JSONObject();
	 given().body(request.toJSONString()).when().post("https://simple-grocery-store-api.glitch.me/carts/items\n").then().statusCode(201).log().all();
}
}
