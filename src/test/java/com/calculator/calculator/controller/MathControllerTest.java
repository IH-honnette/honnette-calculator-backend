package com.calculator.calculator.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
public class MathControllerTest {
   private String url = "/calculate";

   @Autowired
    private TestRestTemplate restTemplate;
  
    @Test
    public void doMath() {
        DoMathRequestDto request = new DoMathRequestDto(1,10, "+");
        ResponseEntity<Response> response = this.restTemplate.postForEntity(url, request, Response.class);
        assertEquals(11,response.getBody().getResponse());

    }

}