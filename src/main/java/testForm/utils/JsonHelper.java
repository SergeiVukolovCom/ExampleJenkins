package testForm.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import testForm.model.TestsData;
import java.io.File;
import java.io.IOException;

public class JsonHelper {

    private JsonHelper() {}

    public static TestsData getTestsData() {
        ObjectMapper objectMapper = new ObjectMapper();
        File filedata = new File("src/test/resources/testsdata.json");
        TestsData javaobject;
        try {
            javaobject = objectMapper.readValue(filedata, TestsData.class);
        } catch (IOException e) {
            throw new RuntimeException("File not found or another error", e);
        }
        return javaobject;
    }

    public static JsonNode extractJson(String jsonResponse) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readTree(jsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
