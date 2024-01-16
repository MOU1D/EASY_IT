package com.example.EASY_IT.repository;

import com.example.EASY_IT.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}