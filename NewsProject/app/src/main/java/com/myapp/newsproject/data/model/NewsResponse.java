package com.myapp.newsproject.data.model;

import java.util.List;

public class NewsResponse {

    private String status;
    private int totalResults;
    private List<Article> articles;

    // Getters
    public String getStatus() { return status; }
    public int getTotalResults() { return totalResults; }
    public List<Article> getArticles() { return articles; }

}
