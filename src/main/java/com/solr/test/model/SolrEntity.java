package com.solr.test.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;

@SolrDocument(collection = "dom2")
@Data
public class SolrEntity {

    @Id
    @Indexed(name = "id", type = "string", required = true)
    private String id;

    @Indexed(name = "entityId", type = "long")
    private long entityId;

    @Indexed(name = "entity", type = "string")
    private String entity;

    @Indexed(name = "published", type = "boolean")
    private boolean published;

    @Indexed(name = "text", type = "text_general")
    private String text;

    @Indexed(name = "date", type = "long")
    private long date;

    @Indexed(name = "dateDelete", type = "long", stored = false)
    private long dateDelete;

    @Indexed(name = "dateCreate", type = "date")
    private Date dateCreate;

    @Indexed(name = "dateUpdate", type = "date")
    private Date dateUpdate;

    @Indexed(name = "yyyyMMdd", type = "string")
    private String yyyyMMdd;

    @Indexed(name = "year", type = "string", stored = false)
    private String year;

    @Indexed(name = "title", type = "string")
    private String title;

    @Indexed(name = "titleWildcard", type = "text_wildcard")
    private String titleWildcard;

    @Indexed(name = "description", type = "string")
    private String description;

    @Indexed(name = "content", type = "text_ru", stored = false)
    private String content;

    @Indexed(name = "author", type = "long")
    private long author;

    @Indexed(name = "parentId", type = "string")
    private String parentId;

    @Indexed(name = "hero", type = "boolean")
    private boolean hero;

    @Indexed(name = "best", type = "boolean")
    private boolean best;

    @Indexed(name = "type", type = "string")
    private String type;

    @Indexed(name = "leaveDate", type = "long")
    private long leaveDate;

    @Indexed(name = "attachmentTypes", type = "string", stored = false)
    private String attachmentTypes;

    @Indexed(name = "filter", type = "string", stored = false, defaultValue = "none")
    private String filter;

    @Indexed(name = "commentsCount", type = "int")
    private int commentsCount;

    @Indexed(name = "votesCount", type = "int")
    private int votesCount;

    @Indexed(name = "pageableVotesCount", type = "string")
    private String  pageableVotesCount;

    @Indexed(name = "searchEntity", type = "string")
    private String  searchEntity;

    @Indexed(name = "hashtag", type = "string", stored = false)
    private String  hashtag;

}
