package com.academy.fundamentals.moviesapplication;

public class MovieData {
    private String m_title;
    private String m_overview;
    private int m_image;

    public MovieData() {
    }

    public String getM_title() {
        return m_title;
    }

    public void setName(String m_title) {
        this.m_title = m_title;
    }

    public String getM_overview() {
        return m_overview;
    }

    public void setOverview(String m_overview) {
        this.m_overview = m_overview;
    }

    public int getM_image() {
        return m_image;
    }

    public void setImageResourceId(int m_image) {
        this.m_image = m_image;
    }
}
