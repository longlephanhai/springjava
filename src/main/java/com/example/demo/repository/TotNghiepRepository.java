package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.SinhVien;
import com.example.demo.domain.TotNghiep;

public interface TotNghiepRepository extends JpaRepository<TotNghiep, Long> {
    List<TotNghiep> findBysinhVien(SinhVien sinhVien);
}
