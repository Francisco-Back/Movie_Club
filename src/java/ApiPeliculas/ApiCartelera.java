/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApiPeliculas;

import ArbolBinBus.ArbolBinBus;

/**
 *
 * @author franciscoback
 */
public class ApiCartelera {
    
   
  public boolean adult;
  public String backdrop_path;
  public float id;
  public String original_language;
  public String original_title;
  public String overview;
  public float popularity;
  public String poster_path;
  public String release_date;
  public String title;
  public boolean video;
  public float vote_average;
  public float vote_count;
//constructor Vacio
   public ApiCartelera(){
       
   }

    public ApiCartelera(boolean adult, String backdrop_path, float id, String original_language, String original_title, String overview, float popularity, String poster_path, String release_date, String title, boolean video, float vote_average, float vote_count) {
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.id = id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.title = title;
        this.video = video;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    public boolean getAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public float getVote_count() {
        return vote_count;
    }

    public void setVote_count(float vote_count) {
        this.vote_count = vote_count;
    }

    @Override
    public String toString() {
        return "ApiCartelera{" + "adult=" + adult + ", backdrop_path=" + backdrop_path + ", id=" + id + ", original_language=" + original_language + ", original_title=" + original_title + ", overview=" + overview + ", popularity=" + popularity + ", poster_path=" + poster_path + ", release_date=" + release_date + ", title=" + title + ", video=" + video + ", vote_average=" + vote_average + ", vote_count=" + vote_count + '}';
    }
   


 
}
    

