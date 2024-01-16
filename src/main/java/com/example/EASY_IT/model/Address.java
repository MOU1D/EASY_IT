package com.example.EASY_IT.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** The first line of address. */
    @Column(name = "address_line_1", nullable = false, length = 512)
    private String addressLine1;

    /** The city of the address. */
    @Column(name = "city", nullable = false)
    private String city;

    /** The country of the address. */
    @Column(name = "country", nullable = false, length = 75)
    private String country;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}