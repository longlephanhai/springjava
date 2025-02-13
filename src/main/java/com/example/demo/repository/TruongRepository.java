package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Truong;

public interface TruongRepository extends JpaRepository<Truong, String> {
    Truong findByMaTruong(String maTruong);
}
