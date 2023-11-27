package testForm.workWithAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.io.IOUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Requests {

    private Requests() {}

    public static Response sendGetRequest(String url) {
        return RestAssured.given()
                .when()
                .get(url);
    }

    public static Response sendPostRequest(String url) {
        String jsonPath = "src/test/resources/user.json";
        String jsonContent = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(jsonPath);
            jsonContent = IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonContent)
                .when()
                .post(url);
    }

}
