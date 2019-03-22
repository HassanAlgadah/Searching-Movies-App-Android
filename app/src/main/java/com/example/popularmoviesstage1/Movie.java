package com.example.popularmoviesstage1;

public class Movie {
    private String title;
    private String thumbnail;
    private String overview;
    private String image;
    private String vote_average;
    private String release_date;

    public Movie() {
    }

    public Movie(String title, String thumbnail, String overview, String image, String vote_average) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.overview = overview;
        this.image = image;
        this.vote_average = vote_average;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}