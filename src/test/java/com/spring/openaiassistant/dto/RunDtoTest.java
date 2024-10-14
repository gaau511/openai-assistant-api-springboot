package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RunDtoTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void test() {
        // example code from openai docs
        String exampleRunObject = "{\n" +
                "  \"id\": \"run_abc123\",\n" +
                "  \"object\": \"thread.run\",\n" +
                "  \"created_at\": 1698107661,\n" +
                "  \"assistant_id\": \"asst_abc123\",\n" +
                "  \"thread_id\": \"thread_abc123\",\n" +
                "  \"status\": \"completed\",\n" +
                "  \"started_at\": 1699073476,\n" +
                "  \"expires_at\": null,\n" +
                "  \"cancelled_at\": null,\n" +
                "  \"failed_at\": null,\n" +
                "  \"completed_at\": 1699073498,\n" +
                "  \"last_error\": null,\n" +
                "  \"model\": \"gpt-4o\",\n" +
                "  \"instructions\": null,\n" +
                "  \"tools\": [{\"type\": \"file_search\"}, {\"type\": \"code_interpreter\"}],\n" +
                "  \"metadata\": {},\n" +
                "  \"incomplete_details\": null,\n" +
                "  \"usage\": {\n" +
                "    \"prompt_tokens\": 123,\n" +
                "    \"completion_tokens\": 456,\n" +
                "    \"total_tokens\": 579\n" +
                "  },\n" +
                "  \"temperature\": 1.0,\n" +
                "  \"top_p\": 1.0,\n" +
                "  \"max_prompt_tokens\": 1000,\n" +
                "  \"max_completion_tokens\": 1000,\n" +
                "  \"truncation_strategy\": {\n" +
                "    \"type\": \"auto\",\n" +
                "    \"last_messages\": null\n" +
                "  },\n" +
                "  \"response_format\": \"auto\",\n" +
                "  \"tool_choice\": \"auto\",\n" +
                "  \"parallel_tool_calls\": true\n" +
                "}\n";

        assertDoesNotThrow(() -> {RunDto run = objectMapper.readValue(exampleRunObject, RunDto.class);});
    }
}
