import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class TEST02_PUT {
    @Test
    void Test_02_Put () {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","AB");
        map.put("job","AB_STUDENT");

        JSONObject request = new JSONObject(map);
        System.out.println(request.toJSONString());

        given().
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
        statusCode(201);
    }
}
