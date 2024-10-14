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
public class VectorStoreDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("object")
    private String object;

    @JsonProperty("created_at")
    private Integer createdAt;

    @JsonProperty("name")
    private String name;

    @JsonProperty("usage_bytes")
    private Integer usageBytes;

    @JsonProperty("file_counts")
    private FileCounts fileCounts;

    @JsonProperty("status")
    private String status;

    @JsonProperty("expires_after")
    private ExpiresAfter expiresAfter;

    @JsonProperty("expires_at")
    private Integer expiresAt;

    @JsonProperty("last_active_at")
    private Integer lastActiveAt;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    //It's not in document but in example code.
    @JsonProperty("last_used_at")
    private Integer lastUsedAt;







    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ExpiresAfter {
        @JsonProperty("anchor")
        private String anchor;

        @JsonProperty("days")
        private Integer days;

    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FileCounts {
        @JsonProperty("in_progress")
        private Integer inProgress;

        @JsonProperty("completed")
        private Integer completed;

        @JsonProperty("failed")
        private Integer failed;

        @JsonProperty("cancelled")
        private Integer cancelled;

        @JsonProperty("total")
        private Integer total;
    }


}
