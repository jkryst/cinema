package com.REST.cinema.features.order;

import com.REST.cinema.features.user.Invoice;
import com.REST.cinema.features.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    User user;

    String firstName;

    String lastName;

    String phoneNumber;

    String email;

    Invoice invoice;

    List<Ticket> tickets;

    LocalDateTime date;

    Payment payment;

    BufferedImage qrCode;

}
