package ru.neutrinosoft.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<News> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeData();
        RecyclerView rv = (RecyclerView)findViewById(R.id.rvNews);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        RVAdapter adapter = new RVAdapter(news);
        rv.setAdapter(adapter);
    }

    private void initializeData(){
        news = new ArrayList<News>();
        news.add(new News("Item One"));
        news.add(new News("Item Two"));
        news.add(new News("Item Three"));
    }


}
