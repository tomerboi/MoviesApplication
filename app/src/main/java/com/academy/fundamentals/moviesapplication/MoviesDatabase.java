package com.academy.fundamentals.moviesapplication;

import android.content.Context;

import java.util.ArrayList;

public class MoviesDatabase {
    private ArrayList<MovieData> allLocalData = new ArrayList<>(9);
    private Context mContext;

    public MoviesDatabase(Context context) {
        mContext = context;
        AddAllMoviesData();
    }
    public ArrayList<MovieData> GetAllData(){
        return allLocalData;
    }
    private void AddAllMoviesData() {
        MovieData movieModel1 = new MovieData();
        MovieData movieModel2 = new MovieData();
        MovieData movieModel3 = new MovieData();
        MovieData movieModel4 = new MovieData();
        MovieData movieModel5 = new MovieData();
        MovieData movieModel6 = new MovieData();
        MovieData movieModel7 = new MovieData();
        MovieData movieModel8 = new MovieData();
        MovieData movieModel9 = new MovieData();

        movieModel1.setName(mContext.getString(R.string.black_panther));
        movieModel2.setName(mContext.getString(R.string.deadpool));
        movieModel3.setName(mContext.getString(R.string.guardians_of_the_galaxy));
        movieModel4.setName(mContext.getString(R.string.interstellar));
        movieModel5.setName(mContext.getString(R.string.jurassic_park));
        movieModel6.setName(mContext.getString(R.string.oceans));
        movieModel7.setName(mContext.getString(R.string.the_meg));
        movieModel8.setName(mContext.getString(R.string.the_purge));
        movieModel9.setName(mContext.getString(R.string.thor));

        movieModel1.setOverview(mContext.getString(R.string.black_panther_overview));
        movieModel2.setOverview(mContext.getString(R.string.deadpool_overview));
        movieModel3.setOverview(mContext.getString(R.string.guardians_of_the_galaxy_overview));
        movieModel4.setOverview(mContext.getString(R.string.interstellar_overview));
        movieModel5.setOverview(mContext.getString(R.string.jurassic_park_overview));
        movieModel6.setOverview(mContext.getString(R.string.oceans_overview));
        movieModel7.setOverview(mContext.getString(R.string.the_meg_overview));
        movieModel8.setOverview(mContext.getString(R.string.the_purge_overview));
        movieModel9.setOverview(mContext.getString(R.string.thor_overview));

        movieModel1.setImageResourceId(R.drawable.black_panther_film_poster);
        movieModel2.setImageResourceId(R.drawable.deadpool);
        movieModel3.setImageResourceId(R.drawable.guardians_of_the_galaxy_poster);
        movieModel4.setImageResourceId(R.drawable.interstellar);
        movieModel5.setImageResourceId(R.drawable.jurrasic_park);
        movieModel6.setImageResourceId(R.drawable.oceans);
        movieModel7.setImageResourceId(R.drawable.the_meg);
        movieModel8.setImageResourceId(R.drawable.the_purge);
        movieModel9.setImageResourceId(R.drawable.thor);

        allLocalData.add(movieModel1);
        allLocalData.add(movieModel2);
        allLocalData.add(movieModel3);
        allLocalData.add(movieModel4);
        allLocalData.add(movieModel5);
        allLocalData.add(movieModel6);
        allLocalData.add(movieModel7);
        allLocalData.add(movieModel8);
        allLocalData.add(movieModel9);
    }
}
