package com.REST.cinema.model.user;

import com.REST.cinema.model.Role;
import com.REST.cinema.model.film.Film;
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

    List<Film> wishlist;
}
