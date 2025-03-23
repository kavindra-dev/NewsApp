package com.myapp.newsproject.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.myapp.newsproject.data.model.Article;
import com.myapp.newsproject.data.model.NewsResponse;
import com.myapp.newsproject.data.repository.NewsRepository;

import java.util.List;

import retrofit2.Call;

public class NewsViewModel extends ViewModel {
    private NewsRepository repository;
    private MutableLiveData<List<Article>> articles;
    public NewsViewModel() {
        repository = new NewsRepository();
        articles = new MutableLiveData<>();
    }
    public LiveData<List<Article>> getArticles() {
        return articles;
    }
    public void fetchNews() {
        repository.getTopHeadlines("us").enqueue(new retrofit2.Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, retrofit2.Response<NewsResponse> response) {
                Log.d("Response:", response.toString());
                if (response.isSuccessful() && response.body() != null) {
                    articles.setValue(response.body().getArticles());
                }
            }
            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                // Handle failure
            }
        });
    }
}
