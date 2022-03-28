package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Grêmio campeão 1","grêmio é campeão novamente 1"));
        news.add(new News("Grêmio campeão 2","grêmio é campeão novamente 2"));
        news.add(new News("Grêmio campeão 3","grêmio é campeão novamente 3"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}