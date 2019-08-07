package com.academy.fundamentals.moviesapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieViewAdapter extends RecyclerView.Adapter<MovieViewAdapter.ViewHolder> {
    private LayoutInflater mInflater;
    private ArrayList<MovieData> mDataSource;
    private MoviesDatabase m_movieDatabase;
    private MoviesActivity m_movieClick;
    private Context m_context;

    public MovieViewAdapter(Context context){
        m_context = context;
        m_movieDatabase = new MoviesDatabase(context);
        mDataSource = m_movieDatabase.GetAllData();
        mInflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        m_movieClick = new MoviesActivity();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.activity_movie_raw, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.onBindViewHolder(mDataSource.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataSource.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView ivImage;
        public final TextView tvTitle;
        public final TextView tvOverview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.imageRaw);
            tvTitle = itemView.findViewById(R.id.overview);
            tvOverview = itemView.findViewById(R.id.smalltext);
            itemView.setOnClickListener(m_movieClick);
        }

        public void onBindViewHolder(MovieData movieModel) {
            ivImage.setImageResource(movieModel.getM_image());
            tvTitle.setText(movieModel.getM_title());
            tvOverview.setText(movieModel.getM_overview());
        }

    }
}
