import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

public class TEST01_GET {
    @Test
    void TEST_01_GET () {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Status Code : "+ response.getStatusCode());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }
    public void test_delete (){

        baseURI = "http://localhost:3000/";
        when()
                .delete ("/users/4")
                .then()
                .statusCode(200);
    }
}

