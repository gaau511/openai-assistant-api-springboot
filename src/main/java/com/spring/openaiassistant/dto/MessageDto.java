package com.spring.openaiassistant.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class MessageDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created_at")
    private Integer createdAt;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("incomplete_details")
    private Reason reason;

    @JsonProperty("completed_at")
    private Integer completedAt;

    @JsonProperty("incomplete_at")
    private Integer incompleteAt;

    @JsonProperty("role")
    private String role;

    @JsonProperty("content")
    private List<Content> content;

    @JsonProperty("assistant_id")
    private String assistantId;

    @JsonProperty("run_id")
    private String runId;

    @JsonProperty("attachments")
    private List<Attachment> attachments;

    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Reason {
        @JsonProperty("reason")
        private String reason;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Content {
        @JsonProperty("type")
        private String type;

        @JsonProperty("image_file")
        private ImageFile imagefile;

        @JsonProperty("image_url")
        private ImageUrl imageUrl;

        @JsonProperty("text")
        private Text text;

        @JsonProperty("refusal")
        private String refusal;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Attachment {
        @JsonProperty("file_id")
        private String fileId;

        @JsonProperty("tools")
        private List<Tool> tools;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Tool {
        @JsonProperty("type")
        private String type;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ImageFile {

        @JsonProperty("file_id")
        private String fileId;

        @JsonProperty("detail")
        private String detail;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ImageUrl {

        @JsonProperty("url")
        private String url;

        @JsonProperty("detail")
        private String detail;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Text {

        @JsonProperty("value")
        private String value;

        // type can be "file_citation", "file_path"
        // It's not commonly use.
        // Parse and use them according to their type.
        @JsonProperty("annotations")
        private List<Object> annotations;
    }

}
