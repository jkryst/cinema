package com.REST.cinema.features.order;

import com.REST.cinema.features.user.Invoice;
import com.REST.cinema.features.user.AppUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @ManyToOne
    AppUser appUser;

    String firstName;

    String lastName;

    String phoneNumber;

    String email;

    @OneToOne
    Invoice invoice;

    @OneToMany
    List<Ticket> tickets;

    LocalDateTime date;

    @OneToOne
    Payment payment;

//    @OneToOne
//    BufferedImage qrCode;

}
