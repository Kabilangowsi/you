package restassured_BDD;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Jsonschemeclasspath {

	@Test
	public void classpath() {
		File a = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Restapii\\src\\test\\resources\\input.json");
		RestAssured.given().baseUri("http://localhost:3000/employees").header("Content-Type", "application/json")
				.body(a).when().get().then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("output.json"));
	}

}
