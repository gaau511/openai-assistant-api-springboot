package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunStepsDtoTest {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() {
        // example code from openai docs
        String exampleRunStepsObject = "{\n" +
                "  \"id\": \"step_abc123\",\n" +
                "  \"object\": \"thread.run.step\",\n" +
                "  \"created_at\": 1699063291,\n" +
                "  \"run_id\": \"run_abc123\",\n" +
                "  \"assistant_id\": \"asst_abc123\",\n" +
                "  \"thread_id\": \"thread_abc123\",\n" +
                "  \"type\": \"message_creation\",\n" +
                "  \"status\": \"completed\",\n" +
                "  \"cancelled_at\": null,\n" +
                "  \"completed_at\": 1699063291,\n" +
                "  \"expired_at\": null,\n" +
                "  \"failed_at\": null,\n" +
                "  \"last_error\": null,\n" +
                "  \"step_details\": {\n" +
                "    \"type\": \"message_creation\",\n" +
                "    \"message_creation\": {\n" +
                "      \"message_id\": \"msg_abc123\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"usage\": {\n" +
                "    \"prompt_tokens\": 123,\n" +
                "    \"completion_tokens\": 456,\n" +
                "    \"total_tokens\": 579\n" +
                "  }\n" +
                "}\n";

        assertDoesNotThrow(() -> {RunStepsDto runStepsDto = objectMapper.readValue(exampleRunStepsObject, RunStepsDto.class);});
    }

}