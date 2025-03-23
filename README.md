# NewsApp
Showing US news from newsapi.org

Entire application is developed using Android studio, Java, Mvvm Structure.


#Project Structure

-app/
    -data/
        -model/                             # model class for Article, Comment and Like 
            -Article.java
            -Comment.java
            -NewsResponse.java
        -network/                           # For creating Retrofit client, Api Path 
            -NewsApiService.java
            -ExtraInfoApiService.java
            -RetrofitClient.java
        -repository/                        # Repository to fetch the data
            -NewsRepository.java
        -ui/                                # Shows UI for news representation in activity using attached fragment area, adapter to recycler view to present the news.
            -adapter/
                -NewsAdapter.java
            -view/
                -NewsActivity.java
            -fragment/
                -NewsFragment.java
        -viewmodel/                         # ViewModel take care of bridge between view and logical conditions.
            -NewsViewModel.java
        -utils/                             # Constants that are going to be used overall.
            -Constants.java
        -test/                              # Testing of code functionality.
            -NewsViewModelTest.java
        -resources/                         # Resource file for layout and drawable i.e; images.
            -layout/
                -activity_main.xml
                -fragment_news.xml
                -item_article.xml
            -drawable/
                -placeholder.png
-AndroidManifest.xml                        # For providing permissions.
-build.gradle                               # for including dependencies that we are going to use in our app like Glide, Retrofit,etc.
