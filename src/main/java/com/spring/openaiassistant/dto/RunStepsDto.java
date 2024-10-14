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
public class RunStepsDto {

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

    @JsonProperty("run_id")
    private String runId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("status")
    private String status;

    @JsonProperty("step_details")
    private StepDetails stepDetails;

    @JsonProperty("last_error")
    private LastError lastError;

    @JsonProperty("expired_at")
    private Integer expiresAt;

    @JsonProperty("started_at")
    private Integer startedAt;

    @JsonProperty("cancelled_at")
    private Integer cancelledAt;

    @JsonProperty("failed_at")
    private Integer failedAt;

    @JsonProperty("completed_at")
    private Integer completedAt;

    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    @JsonProperty("usage")
    private Usage usage;



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
    public static class LastError{
        @JsonProperty("code")
        private String code;

        @JsonProperty("message")
        private String message;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class StepDetails{
        @JsonProperty("type")
        private String type;

        @JsonProperty("message_creation")
        private MessageCreation messageCreation;

        @JsonProperty("tool_calls")
        private ToolCalls toolCalls;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MessageCreation{
        @JsonProperty("message_id")
        private String messageId;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ToolCalls{
        @JsonProperty("id")
        private String id;

        @JsonProperty("type")
        private String type;

        @JsonProperty("code_interpreter")
        private CodeInterpreter codeInterpreter;

        @JsonProperty("file_search")
        private FileSearch fileSearch;

        @JsonProperty("function")
        private Function function;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Function {

        @JsonProperty("name")
        private String name;

        @JsonProperty("arguments")
        private String arguments;

        @JsonProperty("output")
        private String output;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FileSearch {

        @JsonProperty("results")
        private List<Result> results;

        @JsonProperty("ranking_options")
        private RankingOptions rankingOptions;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result {

        @JsonProperty("file_id")
        private String fileId;

        @JsonProperty("file_name")
        private String fileName;

        @JsonProperty("score")
        private Integer score;

        @JsonProperty("content")
        private Content content;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Content {

        @JsonProperty("type")
        private String type;

        @JsonProperty("text")
        private String text;

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

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CodeInterpreter{
        @JsonProperty("input")
        private String input;

        @JsonProperty("outputs")
        private List<Output> outputs;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Output{
        @JsonProperty("type")
        private String type;

        @JsonProperty("logs")
        private String logs;

        @JsonProperty("image")
        private Image image;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Image{
        @JsonProperty("file_id")
        private String fileId;
    }





}
