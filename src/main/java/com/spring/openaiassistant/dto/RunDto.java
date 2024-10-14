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
public class RunDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created_at")
    private Integer createdAt;

    @JsonProperty("assistant_id")
    private String assistantId;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("required_action")
    private RequiredAction requiredAction;

    @JsonProperty("last_error")
    private LastError lastError;


    @JsonProperty("expires_at")
    private Integer expiresAt;

    @JsonProperty("started_at")
    private Integer startedAt;

    @JsonProperty("cancelled_at")
    private Integer cancelledAt;

    @JsonProperty("failed_at")
    private Integer failedAt;

    @JsonProperty("completed_at")
    private Integer completedAt;

    @JsonProperty("incomplete_details")
    private IncompleteDetails incompleteDetails;

    @JsonProperty("model")
    private String model;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("tools")
    private List<Tool> tools;


    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    @JsonProperty("usage")
    private Usage usage;

    @JsonProperty("temperature")
    private Integer temperature;

    @JsonProperty("top_p")
    private Integer topP;

    @JsonProperty("max_prompt_tokens")
    private Integer maxPromptTokens;

    @JsonProperty("max_completion_tokens")
    private Integer maxCompletionTokens;

    @JsonProperty("truncation_strategy")
    private TruncationStrategy truncationStrategy;

    //It can be either string ("auto" , "none", "required") or Object.
    //Parse and use them according to the type.
    @JsonProperty("tool_choice")
    private Object toolChoice;

    @JsonProperty("parallel_tool_calls")
    private Boolean parallelToolCalls;

    //It can be either string ("auto") or Object.
    //Parse and use them according to the type.
    @JsonProperty("response_format")
    private Object responseFormat;




    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TruncationStrategy{
        @JsonProperty("type")
        private String type;

        @JsonProperty("last_messages")
        private Integer last_messages;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Usage{
        @JsonProperty("completion_tokens")
        private Integer completionTokens;

        @JsonProperty("prompt_tokens")
        private Integer promptTokens;

        @JsonProperty("total_tokens")
        private Integer totalTokens;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class IncompleteDetails{
        @JsonProperty("reason")
        private String reason;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LastError{
        @JsonProperty("code")
        private String code;

        @JsonProperty("message")
        private String message;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RequiredAction {
        @JsonProperty("type")
        private String type;

        @JsonProperty("submit_tool_outputs")
        private SubmitToolOutputs submitToolOutputs;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SubmitToolOutputs {
        @JsonProperty("tool_calls")
        private List<ToolCall> toolCalls;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ToolCall {
        @JsonProperty("id")
        private String id;

        @JsonProperty("type")
        private String type;

        @JsonProperty("function")
        private Function2 function2;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Function2 {
        @JsonProperty("name")
        private String name;

        @JsonProperty("arguments")
        private String arguments;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Function {
        @JsonProperty("description")
        private String description;

        @JsonProperty("name")
        private String name;

        @JsonProperty("parameters")
        private Object parameters;

        @JsonProperty("strict")
        private Boolean strict;
    }

    @Data
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
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FileSearch {

        @JsonProperty("max_num_results")
        private Integer maxNumResults;

        @JsonProperty("ranking_options")
        private RankingOptions rankingOptions;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RankingOptions {

        @JsonProperty("ranker")
        private String ranker;

        @JsonProperty("score_threshold")
        private Integer scoreThreshold;
    }


}
