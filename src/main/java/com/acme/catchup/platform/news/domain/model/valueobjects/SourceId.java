package com.acme.catchup.platform.news.domain.model.valueobjects;

import java.util.regex.Pattern;

public record SourceId() {
    private static final int MAX_LENGTH=256;
    private static final Pattern ALLOWED_PATTERN = Pattern.compile("^[a-zA-Z0-9]+$");
    private static final String NOT_BLANK_MESSAGE_KEY="favorite.source.error.newsApiKey.notBlank";
    private static final String SIZE_MESSAGE_KEY="favorite.source.error.sourceId.size";
    private static final String PATTERN_MESSAGE_KEY="favorite.source.error.newsApiKey.pattern";
}
