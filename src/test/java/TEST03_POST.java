
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;


public class TEST03_POST {

    @Test
    public void TEST03_POST () {

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("firstName","Super");
        map.put("lastName","Man");
        map.put("subjectId", 2);

        JSONObject request = new JSONObject(map);
        System.out.println(request.toJSONString());

        given().
                body(request.toJSONString()).
                when().
                post("http://localhost:3000/users").
                then().
                statusCode(201);

//        JSONObject request = new JSONObject(map);
//
//        baseURI = "http://localhost:3000/";
//        JSONObject request = new JSONObject();
//        request.put("firstName","Tom");
//        request.put("lasttName","Hanks");
//        request.put("subjectId", 2);
//        given().contentType(JSON).accept(JSON).
//                header("Content-Type","application/json").
//                body(request.toJSONString()).
//        when().put("/users").
//        then().statusCode(201);


    }
    public void get_test (){


        given().
                get("/users").
                then().
                statusCode(200).
                log().all();
    }

}
