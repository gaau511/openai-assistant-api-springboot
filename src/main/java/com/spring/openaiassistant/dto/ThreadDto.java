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
public class ThreadDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created_at")
    private Integer createdAt;

    @JsonProperty("tool_resources")
    private AssistantDto.ToolResources toolResources;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ToolResources {
        @JsonProperty("code_interpreter")
        private AssistantDto.CodeInterpreter codeInterpreter;

        @JsonProperty("file_search")
        private AssistantDto.FileSearch fileSearch;
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
    public static class FileSearch {
        @JsonProperty("max_num_results")
        private Integer maxNumResults;

        @JsonProperty("ranking_options")
        private AssistantDto.RankingOptions rankingOptions;
    }

}
