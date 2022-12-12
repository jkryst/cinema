package com.REST.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.Duration;
import java.util.List;

@Entity
public class Film {

    @Id @GeneratedValue
    long id;
    String title;
    String shortDescription;
    String longDescription;
    Duration duration;
    double rating;
    List<Object> restrictions;
    List<Object> categories;

    public Film(){}

    public Film(long id, String title, String shortDescription, String longDescription, Duration duration,
                double rating, List<Object> restrictions, List<Object> categories) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.duration = duration;
        this.rating = rating;
        this.restrictions = restrictions;
        this.categories = categories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Object> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Object> restrictions) {
        this.restrictions = restrictions;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }
}
