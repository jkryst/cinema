package com.REST.cinema.features.user;

public class Address {
    int id;
    String name;

    public Address(int id, String name) {
        id=id;
        name=name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
