package com.REST.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
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
