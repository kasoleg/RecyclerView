package ru.neutrinosoft.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;

import java.util.List;

/**
 * Created by Oleg on 15.09.2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.NewsViewHolder>{
    List<News> news;
    RVAdapter(List<News> news){
        this.news = news;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_news, viewGroup, false);
        NewsViewHolder pvh = new NewsViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder newsViewHolder, int i) {
        newsViewHolder.tvNews.setText(news.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView tvNews;
        NewsViewHolder(View itemView) {
            super(itemView);
            tvNews = (TextView)itemView.findViewById(R.id.tvNews);
        }
    }
}
