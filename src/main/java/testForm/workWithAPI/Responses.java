package testForm.workWithAPI;

import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;

public class Responses {

    public static int readStatusCode(Response response) {
        return response.getStatusCode();
    }

    public static String getJsonFromResponse(Response response) {
        return response.getBody().asString();
    }

    public static boolean checkFieldJson(JsonNode rootNode) {
        JsonNode typeNode = rootNode.get("type");
        if (typeNode != null) {
            return typeNode.asBoolean();
        } else {
            return false;
        }
    }

}
