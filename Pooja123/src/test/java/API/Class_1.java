package API;



import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import  io.restassured.response.Response;

@Test(enabled=false)
public class Class_1 {
	public String url="https://reqres.in/api/users?page=2";
	public void testcase1() {
		 Response rep= RestAssured.get(url);
		 System.out.println(rep.statusCode());
		 int status_code=rep.statusCode();
		 Assert.assertEquals(status_code,201);
		 System.out.println(rep.asString());
		 System.out.println(rep.getBody());
		 
	}
	@Test(enabled=false)
	public void testcase2() {
		given().get(url).statusCode();
		given().get(url).then().statusCode(200).body("data.First_name",hasItems("Michael"));
		given().get(url).then().statusCode(200).body("data.id",equalTo(7)).log().all();
	}
	
@Test(enabled=false)
public void testcase3() {
	JSONObject js=new JSONObject();
	js.put("name","pooja");
	js.put("job","tester");
	given().body(js.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	System.out.println(js);
	System.out.println(js.toJSONString());
	System.out.println(js.toString());
}
@Test(enabled=false)
public void testcase4() {
	JSONObject js=new JSONObject();
	js.put("name","pooja");
	js.put("job","tester");
	given().body(js.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	System.out.println(js);
}
@Test(enabled=true)
public void testcase5() {
	JSONObject js=new JSONObject();
	given().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
}
}
