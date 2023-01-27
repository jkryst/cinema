package com.REST.cinema.features.movie.restriction;

import lombok.Data;
import lombok.Getter;

@Getter
public enum Restriction {


    G("General Audiences", "All ages admitted. Nothing that would offend parents for viewing by children."),
    R("Adults Only", "No One 17 and Under Admitted. Clearly adult. Children are not admitted."),
    PG("PG", "Some Material May Not Be Suitable for Children."),
    PG_13("PG-13", "Some Material May Be Inappropriate for Children Under 13.");


    private String type;
    private String description;


    Restriction(String type, String description) {
        this.type = type;
        this.description = description;
    }

}
