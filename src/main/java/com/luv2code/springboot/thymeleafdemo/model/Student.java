package com.luv2code.springboot.thymeleafdemo.model;

import com.luv2code.springboot.thymeleafdemo.validation.CourseCode;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1, message="is required")
    private String lastName= "";
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;
    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "only 6 chars/digit")
    private String postalCode;

    @CourseCode(value = "LUV", message = "must start with 'LUV'")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry(){
        return country;
    }


    public void setCountry(String country){
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
