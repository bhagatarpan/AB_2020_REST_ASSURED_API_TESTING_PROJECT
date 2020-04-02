import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DataDriverExample extends DataForTest {

    //    @Test (dataProvider = "dataprovider_dataforpost")
    public void test_post(String firstname, String lastname, int subjectid) {
        JSONObject request = new JSONObject();
        request.put("firstName", firstname);
        request.put("lasttName", lastname);
        request.put("subjectId", subjectid);

        baseURI = "http://localhost:3000/";
        given().contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Content-Type", "application/json")
                .body(request.toJSONString())
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();
    }

    @Test(dataProvider = "dataproivder_datafordelete")
    public void test_delete(int userid) {

        baseURI = "http://localhost:3000/";
        when()
                .delete("/users/" + userid)
                .then()
                .statusCode(200);
    }


}
