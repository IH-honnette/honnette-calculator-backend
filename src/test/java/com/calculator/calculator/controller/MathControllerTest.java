package com.calculator.calculator.controller;

import com.calculator.calculator.Response;
import com.calculator.calculator.dto.DoMathRequestDto;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class MathControllerTest {

    @Autowired
    private  TestRestTemplate restTemplate;

    public MathControllerTest(TestRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Test
    public void doMath() {
        DoMathRequestDto request = new DoMathRequestDto(1,10, "+");
        String url = "/calculate";
        ResponseEntity<Response> response = this.restTemplate.postForEntity(url, request, Response.class);
        assertEquals(11,response.getBody().getResponse());
    }

}