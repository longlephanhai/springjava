package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.SinhVien;

public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
    SinhVien findBySoCMND(String soCMND);
}
