package com.example.EASY_IT.repository;

import com.example.EASY_IT.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}