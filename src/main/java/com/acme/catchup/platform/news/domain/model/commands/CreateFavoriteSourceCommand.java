package com.acme.catchup.platform.news.domain.model.commands;

import com.acme.catchup.platform.news.domain.model.valueobjects.NewsApiKey;
import com.acme.catchup.platform.news.domain.model.valueobjects.SourceId;

import javax.xml.transform.Source;

public record CreateFavoriteSourceCommand(NewsApiKey newsApiKey, SourceId sourceId){
    public CreateFavoriteSourceCommand {

    }
}
