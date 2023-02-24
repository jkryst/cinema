package com.REST.cinema.features.user;

import com.REST.cinema.features.movie.movie.Movie;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String firstName;

    String lastName;

    String phoneNumber;

    String email;

    String password;

    boolean disabled;

    String nip;

    @OneToOne
    Address address;

    @OneToOne
    Cart cart;

    @OneToOne
    Role role;

    @ManyToMany
    List<Movie> wishlist;
}
