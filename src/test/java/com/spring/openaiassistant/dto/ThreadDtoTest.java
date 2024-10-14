package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadDtoTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() {
        // example code from openai docs
        String exampleThreadObject = "{\n" +
                "  \"id\": \"thread_abc123\",\n" +
                "  \"object\": \"thread\",\n" +
                "  \"created_at\": 1698107661,\n" +
                "  \"metadata\": {}\n" +
                "}";

        assertDoesNotThrow(() -> {ThreadDto thread = objectMapper.readValue(exampleThreadObject, ThreadDto.class);});

    }

}