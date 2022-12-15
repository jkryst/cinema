package com.REST.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Restriction {

    @Id
    @GeneratedValue
    long id;
    String type;

    public Restriction() {
    }

    public Restriction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
