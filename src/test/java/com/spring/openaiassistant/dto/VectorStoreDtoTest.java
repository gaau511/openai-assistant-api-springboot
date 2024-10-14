package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorStoreDtoTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() {
        // example code from openai docs
        String exampleVectorStoreObject = "{\n" +
                "  \"id\": \"vs_123\",\n" +
                "  \"object\": \"vector_store\",\n" +
                "  \"created_at\": 1698107661,\n" +
                "  \"usage_bytes\": 123456,\n" +
                "  \"last_active_at\": 1698107661,\n" +
                "  \"name\": \"my_vector_store\",\n" +
                "  \"status\": \"completed\",\n" +
                "  \"file_counts\": {\n" +
                "    \"in_progress\": 0,\n" +
                "    \"completed\": 100,\n" +
                "    \"cancelled\": 0,\n" +
                "    \"failed\": 0,\n" +
                "    \"total\": 100\n" +
                "  },\n" +
                "  \"metadata\": {},\n" +
                "  \"last_used_at\": 1698107661\n" +
                "}\n";

        assertDoesNotThrow(() -> {objectMapper.readValue(exampleVectorStoreObject, VectorStoreDto.class);});
    }
}