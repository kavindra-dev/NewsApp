package com.myapp.newsproject.data.repository;

import com.myapp.newsproject.data.model.NewsResponse;
import com.myapp.newsproject.data.network.NewsApiService;
import com.myapp.newsproject.data.network.RetrofitClient;
import com.myapp.newsproject.utils.Constants;

import retrofit2.Call;

public class NewsRepository {
    private NewsApiService apiService;
    public NewsRepository() {
        apiService = RetrofitClient.getClient().create(NewsApiService.class);
    }
    public Call<NewsResponse> getTopHeadlines(String country) {
        return apiService.getTopHeadlines(country, Constants.API_KEY);
    }
}
