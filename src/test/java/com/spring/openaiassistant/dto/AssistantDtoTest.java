package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;

import static org.junit.jupiter.api.Assertions.*;

class AssistantDtoTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() {
        // example code from openai docs
        String exampleAssistantObject = "{\n" +
                "  \"id\": \"asst_abc123\",\n" +
                "  \"object\": \"assistant\",\n" +
                "  \"created_at\": 1698984975,\n" +
                "  \"name\": \"Math Tutor\",\n" +
                "  \"description\": null,\n" +
                "  \"model\": \"gpt-4o\",\n" +
                "  \"instructions\": \"You are a personal math tutor. When asked a question, write and run Python code to answer the question.\",\n" +
                "  \"tools\": [\n" +
                "    {\n" +
                "      \"type\": \"code_interpreter\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"metadata\": {},\n" +
                "  \"top_p\": 1.0,\n" +
                "  \"temperature\": 1.0,\n" +
                "  \"response_format\": \"auto\"\n" +
                "}\n";

        assertDoesNotThrow(() -> {AssistantDto assistant = objectMapper.readValue(exampleAssistantObject, AssistantDto.class);});
    }

}