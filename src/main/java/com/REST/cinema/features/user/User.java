package com.REST.cinema.features.user;

import com.REST.cinema.features.movie.movie.Movie;
import jakarta.persistence.Id;

import java.util.List;


public class User {
    @Id
    long id;

    String firstName;

    String lastName;

    String phoneNumber;

    String email;

    String password;

    boolean disabled;

    String nip;

    Address address;

    Cart cart;

    Role role;

    List<Movie> wishlist;
}
