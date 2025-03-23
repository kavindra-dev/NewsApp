package com.myapp.newsproject.data.network;

import com.myapp.newsproject.data.model.Comment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface ExtraInfoApiService {
    @GET("likes/{articleId}")
    Call<Integer> getLikes(@Path("articleId") String articleId);

    @GET("comments/{articleId}")
    Call<List<Comment>> getComments(@Path("articleId") String articleId);
}
