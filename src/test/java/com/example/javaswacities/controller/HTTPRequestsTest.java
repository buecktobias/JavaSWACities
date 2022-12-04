package com.example.javaswacities.controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class HTTPRequestsTest {
    @Test
    public void testSendPostRequest(){
        HttpClient client = HttpClient.newHttpClient();
        var values = new HashMap<String, String>() {{
            put("Name", "Berg1");
            put ("Mountains", "Bergkette");
            put ("Height", "102.3");
            put ("Type", "mountain");
            put ("Longitude", "17.3");
            put ("Latitude", "17.3");
        }};

        var objectMapper = new ObjectMapper();
        String requestBody;
        try {
            requestBody = objectMapper
                    .writeValueAsString(values);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        requestBody = "{\"Mountains\":\"Bergkette\",\"Type\":\"mountain\",\"Height\":\"102.3\",\"Latitude\":\"17.3\",\"Longitude\":\"17.3\",\"Name\":\"Berg1\"}";
        System.out.println(requestBody);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/mountain"))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.body());
        System.out.println(response.statusCode());
    }
}
