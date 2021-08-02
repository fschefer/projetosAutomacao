package rest.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class HWTest {

	@Test
	public void testeOlaMundo() {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		Assertions.assertTrue(response.getStatusCode() == 200);
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
	}

}
