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
    
   
  private boolean adult;
  private String backdrop_path;
  private float id;
  private String original_language;
  private String original_title;
  private String overview;
  private float popularity;
  private String poster_path;
  private String release_date;
  private String title;
  private boolean video;
  private float vote_average;
  private float vote_count;
//constructor Vacio
   public ApiCartelera(){
       
   }
   
    public ApiCartelera(float id, String original_language, String original_title, String overview, float popularity, String poster_path, String release_date, String title, boolean video, float vote_average, float vote_count) {
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
  
  


 // Getter Methods 

  public boolean getAdult() {
    return adult;
  }

  public String getBackdrop_path() {
    return backdrop_path;
  }

  public float getId() {
    return id;
  }

  public String getOriginal_language() {
    return original_language;
  }

  public String getOriginal_title() {
    return original_title;
  }

  public String getOverview() {
    return overview;
  }

  public float getPopularity() {
    return popularity;
  }

  public String getPoster_path() {
    return poster_path;
  }

  public String getRelease_date() {
    return release_date;
  }

  public String getTitle() {
    return title;
  }

  public boolean getVideo() {
    return video;
  }

  public float getVote_average() {
    return vote_average;
  }

  public float getVote_count() {
    return vote_count;
  }

 // Setter Methods 

  public void setAdult( boolean adult ) {
    this.adult = adult;
  }

  public void setBackdrop_path( String backdrop_path ) {
    this.backdrop_path = backdrop_path;
  }

  public void setId( float id ) {
    this.id = id;
  }

  public void setOriginal_language( String original_language ) {
    this.original_language = original_language;
  }

  public void setOriginal_title( String original_title ) {
    this.original_title = original_title;
  }

  public void setOverview( String overview ) {
    this.overview = overview;
  }

  public void setPopularity( float popularity ) {
    this.popularity = popularity;
  }

  public void setPoster_path( String poster_path ) {
    this.poster_path = poster_path;
  }

  public void setRelease_date( String release_date ) {
    this.release_date = release_date;
  }

  public void setTitle( String title ) {
    this.title = title;
  }

  public void setVideo( boolean video ) {
    this.video = video;
  }

  public void setVote_average( float vote_average ) {
    this.vote_average = vote_average;
  }

  public void setVote_count( float vote_count ) {
    this.vote_count = vote_count;
  }
}
    
