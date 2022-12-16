package com.REST.cinema.model.film;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Film {

    @Id @GeneratedValue
    long id;
    @Column(name = "title")
    public String title;
    String shortDescription;
    String longDescription;
    int duration;
    double rating;

    @ManyToOne
    @JoinColumn(name="restriction_id", nullable = false)
    Restriction restriction;


    @ManyToMany
    @JoinTable(name = "film_genres",
    joinColumns = @JoinColumn(name ="film_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id") )
    Set<Genre> genres;

    public Film(){}

    public Film(String title, String shortDescription, String longDescription, int duration,
                double rating, Restriction restriction, Set<Genre> genres){

        this.title = title;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.duration = duration;
        this.rating = rating;
        this.restriction = restriction;
        this.genres = genres;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Restriction getRestriction() {
        return restriction;
    }

    public void setRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}
