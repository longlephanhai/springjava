package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Nganh;

public interface NganhRepository extends JpaRepository<Nganh, String> {
    Nganh findByMaNganh(String maNganh);

}
