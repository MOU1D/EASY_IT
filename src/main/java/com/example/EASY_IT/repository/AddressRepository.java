package com.example.EASY_IT.repository;

import com.example.EASY_IT.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}