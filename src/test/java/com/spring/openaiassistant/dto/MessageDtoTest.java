package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MessageDtoTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() {
        // example code from openai docs
        String exampleMessageObject = "{\n" +
                "  \"id\": \"msg_abc123\",\n" +
                "  \"object\": \"thread.message\",\n" +
                "  \"created_at\": 1698983503,\n" +
                "  \"thread_id\": \"thread_abc123\",\n" +
                "  \"role\": \"assistant\",\n" +
                "  \"content\": [\n" +
                "    {\n" +
                "      \"type\": \"text\",\n" +
                "      \"text\": {\n" +
                "        \"value\": \"Hi! How can I help you today?\",\n" +
                "        \"annotations\": []\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"assistant_id\": \"asst_abc123\",\n" +
                "  \"run_id\": \"run_abc123\",\n" +
                "  \"attachments\": [],\n" +
                "  \"metadata\": {}\n" +
                "}\n";

        assertDoesNotThrow(() -> {MessageDto message = objectMapper.readValue(exampleMessageObject, MessageDto.class);});

    }
}
