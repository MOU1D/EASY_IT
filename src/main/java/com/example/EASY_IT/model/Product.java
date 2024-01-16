package com.example.EASY_IT.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /** The name of the product. */
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    /** The short description of the product. */
    @Column(name = "short_description", nullable = false)
    private String shortDescription;

    /** The price of the product. */
    @Column(name = "price", nullable = false)
    private Double price;

    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;


}