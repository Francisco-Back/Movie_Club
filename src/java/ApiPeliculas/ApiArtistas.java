/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApiPeliculas;

/**
 *
 * @author franciscoback
 */
public class ApiArtistas {
  private boolean adult;
  private float gender;
  private float id;
  private String known_for_department;
  private String name;
  private String original_name;
  private float popularity;
  private String profile_path;
  private float cast_id;
  private String character;
  private String credit_id;
  private float order;


 // Getter Methods 

  public boolean getAdult() {
    return adult;
  }

  public float getGender() {
    return gender;
  }

  public float getId() {
    return id;
  }

  public String getKnown_for_department() {
    return known_for_department;
  }

  public String getName() {
    return name;
  }

  public String getOriginal_name() {
    return original_name;
  }

  public float getPopularity() {
    return popularity;
  }

  public String getProfile_path() {
    return profile_path;
  }

  public float getCast_id() {
    return cast_id;
  }

  public String getCharacter() {
    return character;
  }

  public String getCredit_id() {
    return credit_id;
  }

  public float getOrder() {
    return order;
  }

 // Setter Methods 

  public void setAdult( boolean adult ) {
    this.adult = adult;
  }

  public void setGender( float gender ) {
    this.gender = gender;
  }

  public void setId( float id ) {
    this.id = id;
  }

  public void setKnown_for_department( String known_for_department ) {
    this.known_for_department = known_for_department;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public void setOriginal_name( String original_name ) {
    this.original_name = original_name;
  }

  public void setPopularity( float popularity ) {
    this.popularity = popularity;
  }

  public void setProfile_path( String profile_path ) {
    this.profile_path = profile_path;
  }

  public void setCast_id( float cast_id ) {
    this.cast_id = cast_id;
  }

  public void setCharacter( String character ) {
    this.character = character;
  }

  public void setCredit_id( String credit_id ) {
    this.credit_id = credit_id;
  }

  public void setOrder( float order ) {
    this.order = order;
  }
    
}
