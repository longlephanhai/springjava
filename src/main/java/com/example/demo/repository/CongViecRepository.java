package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.CongViec;
import com.example.demo.domain.SinhVien;

public interface CongViecRepository extends JpaRepository<CongViec, Long> {
  List<CongViec> findBysinhVien(SinhVien sinhVien);
}
