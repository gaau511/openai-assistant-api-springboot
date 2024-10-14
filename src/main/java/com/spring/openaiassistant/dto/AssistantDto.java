package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssistantDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created_at")
    private Integer createdAt;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("model")
    private String model;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("tools")
    private List<Tool> tools;

    @JsonProperty("tool_resources")
    private ToolResources toolResources;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonProperty("temperature")
    private Double temperature;

    @JsonProperty("top_p")
    private Double topP;

    // string : "auto" or ResponseFormat
    @JsonProperty("response_format")
    private Object responseFormat;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Tool {
        @JsonProperty("type")
        private String type;

        @JsonProperty("file_search")
        private FileSearch fileSearch;

        @JsonProperty("function")
        private Function function;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FileSearch {
        @JsonProperty("max_num_results")
        private Integer maxNumResults;

        @JsonProperty("ranking_options")
        private RankingOptions rankingOptions;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RankingOptions {
        @JsonProperty("ranker")
        private String ranker;

        @JsonProperty("score_threshold")
        private Double scoreThreshold;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Function {
        @JsonProperty("description")
        private String description;

        @JsonProperty("name")
        private String name;

        @JsonProperty("parameters")
        private Map<String, Object> parameters;

        @JsonProperty("strict")
        private Boolean strict;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ToolResources {
        @JsonProperty("code_interpreter")
        private CodeInterpreter codeInterpreter;

        @JsonProperty("file_search")
        private FileSearch fileSearch;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CodeInterpreter {
        @JsonProperty("file_ids")
        private List<String> fileIds;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    // use via casting
    public static class ResponseFormat {
        @JsonProperty("type")
        private String type;

        @JsonProperty("json_schema")
        private JsonSchema jsonSchema;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JsonSchema {
        @JsonProperty("description")
        private String description;

        @JsonProperty("name")
        private String name;

        @JsonProperty("schema")
        private Map<String, Object> schema;

        @JsonProperty("strict")
        private Boolean strict;
    }
}
